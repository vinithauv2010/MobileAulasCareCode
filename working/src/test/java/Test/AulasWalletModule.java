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
import Pages.SchedulePage;
import io.appium.java_client.android.AndroidDriver;

public class AulasWalletModule extends AulasBaseTest {
	public AndroidDriver driver;
	public SchedulePage SP;
	public HomePage HP;
	public AulasCarePage AC;
	public AulasWalletPage AW;
	
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
public void CheckKYCbtn() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 1 is strated ");
	HP.clickOnMoreButton();
	AW=HP.ClickOnAulasWallet();
	AW.clickOnCompletereKYC();
	System.out.println("Test case 1 is completed ");
	
	
}

@Test(priority=1)
public void fillGeneraDetails() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 2 is strated ");
	HP.clickOnMoreButton();
	AW=HP.ClickOnAulasWallet();
	AW.clickOnCompletereKYC();
	AW.fillBasicInfo("h","Father","90123456789","Male");
	System.out.println("Test case 2 is completed ");
	}

}