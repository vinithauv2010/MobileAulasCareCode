//Jenkinsfile (Declarative Pipeline)

// -- Directory where the Project Files are located.  
def JOB_FILES_DIRECTORY
// -- Directory where the Platform Tools is located
def PLATFORM_TOOL_DIRECTORY
// -- Directory where the Android Emulator is located
def EMULATOR_DIRECTORY
// -- Path of the Suite to execute
def SUITE_PATH

// -- Keep only 15 builds
echo 'Discard old build'
properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', 
    daysToKeepStr: '', numToKeepStr: "15"))])

pipeline {
    agent any
    // -- Display a timestamp on the log.
    options{timestamps()}
    stages {

    // Parameters needed: JOB_FILES_DIRECTORY, PLATFORM_TOOL_DIRECTORY, EMULATOR_DIRECTORY, SUITE_PATH
    // JOB_NAME, JOB_APPIUM_SUITE
    // ------------------------------------
    // -- STAGE: Initial Configuration
    // ------------------------------------
    stage("Initial Configuration") {
        steps {

            script {
                // -- Set the Directory of the files in the workspace
                JOB_FILES_DIRECTORY = "${env.JOB_DIRECTORY}"+"/src/test/resources/files"
                // -- Set the suite name and route parameter
                SUITE_PATH = "src/test/resources/suites/"+"${JOB_APPIUM_SUITE}"+".xml" 

                // -- Initial Configuration Only If the Platform is Android.
                if (JOB_PLATFORM_NAME == "android"){
                    // -- Set the Platform Tool Directory. 
                    PLATFORM_TOOL_DIRECTORY = "${env.ANDROID_HOME}"+"/platform-tools/"
                    // -- Set the Emulator Directory.
                    EMULATOR_DIRECTORY = "${env.ANDROID_HOME}"+"/emulator/"
                }
            }

            // -- Clean Workspace
            echo "Clean Workspace"
            cleanWs()
        }
    }
    
    // Parameters needed: JOB_GIT_BRANCH, JOB_GIT_URL, GIT_CREDENTIAL
    // --------------------------------
    // -- STAGE: Download GIT Code
    // --------------------------------
    stage("Download GIT Code") {
        steps {
            script {
                try {
                   // -- Download GIT Code 
                    echo "Downloading GIT Code from: ${JOB_GIT_URL}. Branch: ${JOB_GIT_BRANCH}"
                    checkout([$class: "GitSCM", branches: [[name: "${JOB_GIT_BRANCH}"]], doGenerateSubmoduleConfigurations: false, 
                    extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: "${env.GIT_CREDENTIAL}", 
                    url: "${JOB_GIT_URL}"]]])
                } catch (err) { 
                    echo "The Download GIT Code Stage failed"                                          
                }
            }   
        }
    }

    // Parameters needed: JOB_PLATFORM_NAME, PLATFORM_TOOL_DIRECTORY
    // --------------------------------
    // -- STAGE: Execute ADB Server
    // --------------------------------
    stage("Execute ADB Server") {
        when {
                expression { return JOB_PLATFORM_NAME == "android" }
        }
        steps {
            echo "Executing ADB Server"
            // -- First, you need to go to the Platform Tool Directory.
            // -- Then run the ADB Server
            script {
                try {
                    sh """
                        cd ${PLATFORM_TOOL_DIRECTORY}
                        ./adb start-server&
                    """
                } catch (err) { 
                    echo "The ADB Server is not running"                                          
                }
            }  
        }
    }

    // Parameters needed: JOB_PLATFORM_NAME, EMULATOR_DIRECTORY, JOB_EMULATOR_VERSION
    // --------------------------------
    // -- STAGE: Launch Android Emulador
    // --------------------------------
    stage("Launch Android Emulador") {
        when {
                expression { return JOB_PLATFORM_NAME == "android" }
        }
        steps {
            echo "Starting Emulador"
                // -- First, you need to go to the Emulator Directory.
                // -- Then launch the Emulator
            script {
                try {
                    sh """
                        cd ${EMULATOR_DIRECTORY}
                        ./emulator -avd ${JOB_DEVICE_NAME} -engine auto -wipe-data -no-cache -memory 3072 -no-snapshot-save&
                        sleep 60s
                    """
                } catch (err) { 
                    echo "The emulator is not open"                                          
                }
            }      
        }
    }

    // Parameters needed: JOB_PLATFORM_NAME, JOB_APP_NAME, JOB_DEVICE_NAME, 
    // JOB_PLATFORM_NAME, JOB_EMULATOR_PLATFORM_VERSION
    // --------------------------------
    // -- STAGE: Appium Test
    // --------------------------------
    stage("Appium Test") {
        steps {
            script {
                // -- Android Appium Test
                if (JOB_PLATFORM_NAME == "android"){
                    echo "Launching Appium Test on Android"
                }
                // -- iOS Appium Test
                if (JOB_PLATFORM_NAME == "ios"){
                    echo "Launching Appium Test on iOS"
                    //TODO: Complete
                }
                
                // -- Script to launch Appium Test
                script {
                    try {
                        if (JOB_APP_NAME) {
                            sh """
                                mvn clean -DdeviceName="${JOB_DEVICE_NAME}" -DdevicePlatformName="${JOB_PLATFORM_NAME}" -DdevicePlatformVersion="${JOB_EMULATOR_PLATFORM_VERSION}" -DdeviceApp="${JOB_APP_NAME}" -DtestSuite="${SUITE_PATH}" test
                            """
                        }
                        else {
                            sh """
                                mvn clean -DdeviceName="${JOB_DEVICE_NAME}" -DdevicePlatformName="${JOB_PLATFORM_NAME}" -DdevicePlatformVersion="${JOB_EMULATOR_PLATFORM_VERSION}" -DtestSuite="${SUITE_PATH}" test
                            """
                        }
                        echo "Publishing Junit Results"
                        junit "**/target/surefire-reports/junitreports/*.xml"

                    } catch (err) { 
                        echo "Archiving Screenshot of the Failed Tests"
                        archiveArtifacts "**/screenshot/*.png"
                        echo "Publishing Junit Results"
                        junit "**/target/surefire-reports/junitreports/*.xml"
                    }
                }   
            }
        }
    }

    //------------------------------------
    // -- STAGE: SonarQube
    // ------------------------------------
    stage("SonarQube") {
        steps {
            script {
                try {
                    echo "Analizing the project with SonarQube."
                    withSonarQubeEnv("Sonar Server") {
                        sh "mvn sonar:sonar"
                    }
                } catch (err) { 
                    echo "The SonarQube analysis failed"                                          
                }
            }  
        }
    }

    } // -- End stage
    // -- Parameters needed: JOB_SLACK_CHANNEL_NOTIFICATION, JOB_NAME, BUILD_NUMBER, BUILD_URL
    // ----------------------------------------------
    // -- STAGE: Post Build actions
    // ----------------------------------------------
    post ("Post-Build Actions"){
        success ("JOB SUCCESS"){
            sh "echo Success Job"
            slackSend botUser: true, color: "#14910c", channel: "#"+"${JOB_SLACK_CHANNEL_NOTIFICATION}", message: "The Pipeline: `${JOB_NAME}`, `${BUILD_NUMBER}` finished successfully (<${BUILD_URL}|Open>)."
        }

        failure ("JOB FAILURE"){
            sh "echo Failure Job"
            slackSend botUser: true, color: "#d6280d", channel: "#"+"${JOB_SLACK_CHANNEL_NOTIFICATION}", message: "The Pipeline: `${JOB_NAME}`, `${BUILD_NUMBER}` finished with a failure (<${BUILD_URL}|Open>)"   
        }

        unstable ("JOB UNSTABLE") {
            sh "echo Unstable Job"
            slackSend botUser: true, color: "#fded72", channel: "#"+"${JOB_SLACK_CHANNEL_NOTIFICATION}", message: "The Pipeline: `${JOB_NAME}`, `${BUILD_NUMBER}` finished unstable (<${BUILD_URL}|Open>)" 
        }

        aborted ("JOB ABORTED") {
            sh "echo Aborted Job"
            slackSend botUser: true, color: "#a6a6a6", channel: "#"+"${JOB_SLACK_CHANNEL_NOTIFICATION}", message: "The Pipeline: `${JOB_NAME}`, `${BUILD_NUMBER}` was aborted (<${BUILD_URL}|Open>)"
        }
    }
}
