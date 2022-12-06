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

public class AulasCareModule extends AulasBaseTest {
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
	HP = LP.Login(prop.getProperty("SuperAdmniPhno"),prop.getProperty("OTP"));

	 HP.clickOnMoreButton();
	
}
@Test(priority=1)
public void checkSupport() throws InterruptedException {
	Thread.sleep(3000);
	//AC.clickOnMoreButton();
	AC=HP.clickOnAulasCare();
	AC.clickOnSupport();
	AC.clickOnViewAll("VIEW ALL");
	AC.doChart("LAKSHMI STUDENT","Hello");
	
	
}
@Test(priority=2)
public void fillVaccinationDetails() throws InterruptedException {
	Thread.sleep(3000);
	AC=HP.clickOnAulasCare();
	AC.clickCovid19("Covid-19 resources");
	AC.clickVaccination();
	AC.registerInBrowser();
	
}
@Test(priority=3)
public void checkFAQs() throws InterruptedException {
	Thread.sleep(3000);
	AC=HP.clickOnAulasCare();
	AC.FAQs("FAQs");
	AC.checkAllFAQs();
	
	
}
/*@Test(priority=4)
public void fillBasicInfoDetails() throws InterruptedException {
	Thread.sleep(3000);
	AC.clickOnWallet("aulas Wallet");
	AC.clickOnCompleteKYC();
	AC.fillBasicInfo("Mother", "Female");
	AC.fillContactDetails();
	//AC.clickOnProcced();
	AC.upDateDocument();
	
	
	
}

@Test(priority=5)
public void fillAccountDetails() throws InterruptedException {
	Thread.sleep(3000);
	AC.clickAccountDetails();
	AC.enterEmailID();
	AC.enterPhoneNumb();
	
	
}*/












}