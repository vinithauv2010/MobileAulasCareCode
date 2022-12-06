package Test;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Andriod_BaseTest.AulasBaseTest;
import Pages.AulasCarePage;
import Pages.AulasWalletPage;
import Pages.HomePage;
import Pages.NotificationPage;
import Pages.SchedulePage;
import io.appium.java_client.android.AndroidDriver;

public class NotificationModule extends AulasBaseTest {
	public AndroidDriver driver;
	public SchedulePage SP;
	public HomePage HP;
	public AulasCarePage AC;
	public AulasWalletPage AW;
	public NotificationPage NP;
	
	ExtentReports extent;
	
@BeforeSuite
public void doLoginOperation() throws InterruptedException, IOException {
	Properties prop=new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\config.properties");
	prop.load(fis);
	ConfigureAppium();
	Thread.sleep(8000);
	LP.checkUpdates();
	HP = LP.Login(prop.getProperty("SuperAdmniPhno"),prop.getProperty("OTP"));

}
@Test(priority=1)

public void CheckAnnouncementNoti() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 1 is strated ");
	NP=HP.clickOnNotificationBtn();
	NP.clickOnAnnouncement();
	
	System.out.println("Test case 1 is completed ");
	}

/*
@Test(priority=2)

public void CheckTestNoti() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 2 is strated ");
	NP=HP.clickOnNotificationBtn();
	NP.clickOntest();
	
	System.out.println("Test case 2 is completed ");
	}
@Test(priority=3)

public void CheckFeePaymentNoti() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 3 is strated ");
	NP=HP.clickOnNotificationBtn();
	NP.clickOnFeePayments();
System.out.println("Test case 3 is completed ");
	}

@Test(priority=4)

public void CheckOthersNoti() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 4 is strated ");
	NP=HP.clickOnNotificationBtn();
	NP.clickOnOthers();
System.out.println("Test case 4 is completed ");
	}

@Test(priority=5)

public void CheckDigitalLibNoti() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 5 is strated ");
	NP=HP.clickOnNotificationBtn();
	NP.clickOnDigitalLib();
System.out.println("Test case 5 is completed ");
	}
*/





















}