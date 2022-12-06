package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Andriod_BaseTest.AulasBaseTest;
import Pages.AulasCarePage;
import Pages.HomePage;
import Pages.SchedulePage;
import io.appium.java_client.android.AndroidDriver;

public class ScheduleModuleTeacherSide extends AulasBaseTest {
	public AndroidDriver driver;
	public SchedulePage SP;
	public HomePage HP;
	public AulasCarePage AC;
	
	ExtentReports extent;
	
@BeforeSuite
public void doLoginOperation() throws InterruptedException, IOException {
	Properties prop=new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\config.properties");
	prop.load(fis);
	ConfigureAppium();
	Thread.sleep(8000);
	LP.checkUpdates();
	HP = LP.Login(prop.getProperty("TeacherPhNum"),prop.getProperty("OTP"));

}

@Test(priority=3)
public void CreateScheduleBroadcast() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 1 is strated ");
	SP= HP.clickOnScheduleButton();
	SP.clickOnCalenderButton();
	SP.selectSubject();
	SP.selectClass();
	SP.selectTeacher();
	SP.selectModeOfClass("BROADCAST");
	SP.selectStartDate("Repeat On");
	SP.selectStartTime();
	SP.selectEndTime();
	SP.repeatOn("T");
	SP.selectLastDay();
	SP.clickOnSaveBtn();
	System.out.println("Test case 1 is Completed ");
	
}

@Test(priority=3)
public void CreateScheduleOffline() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 2 is strated ");
	SP= HP.clickOnScheduleButton();
	SP.clickOnCalenderButton();
	SP.selectSubject();
	SP.selectClass();
	SP.selectTeacher();
	SP.selectModeOfClass("OFFLINE");
	SP.selectStartDate("Repeat On");
	SP.selectStartTime();
	SP.selectEndTime();
	SP.repeatOn("T");
	SP.selectLastDay();
	SP.clickOnSaveBtn();
	System.out.println("Test case 2 is Completed ");
	
}




@Test(priority=3)
public void checkSchedule() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 3 is strated ");
	SP= HP.clickOnScheduleButton();
	SP.clickOngoingSchedule();
	SP.clickScheduleduled();
	System.out.println("Test case 3 is completed.. ");
	
	
}
}