package ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Andriod_BaseTest.AulasBaseTest;

//import org.testng.ITestListener;

public class ListenerTest extends AulasBaseTest implements ITestListener						
{	
	ExtentReports extent=GenerateExtendReports.getExtentReport();
	ExtentTest test;
    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
    	extent.flush();		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
       test.fail(arg0.getThrowable()); 	
     
       test.addScreenCaptureFromPath(arg0.getMethod().getMethodName(), arg0.getMethod().getMethodName());
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	 test=extent.createTest(arg0.getMethod().getMethodName()); 		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	test.log(Status.PASS,"Test Passed"); 
        		
    }		
}