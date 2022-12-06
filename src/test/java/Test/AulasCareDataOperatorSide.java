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

public class AulasCareDataOperatorSide extends AulasBaseTest {
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
	HP = LP.Login(prop.getProperty("DataOperatorPhNum"),prop.getProperty("OTP"));

	 HP.clickOnMoreButton();
	
}

@Test(priority=1)
public void fillVaccinationDetails() throws InterruptedException {
	Thread.sleep(3000);
	AC=HP.clickOnAulasCare();
	AC.clickCovid19("Covid-19 resources");
	AC.clickVaccination();
	//AC.registerInBrowser();
	
}

@Test(priority=2)
public void checkFAQs() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 2 is started in AulasCare unit FAQ");
	AC=HP.clickOnAulasCare();
	AC.FAQs("FAQs");
	AC.checkAllFAQs();
	System.out.println("Test case 2 is Completed in AulasCare unit FAQ");
	
	
}

@Test(priority=3)
public void chatWithAInstitute() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 3 is started in AulasCare");
	AC=HP.clickOnAulasCare();
	AC.chatWithInstitute("Hello");
	System.out.println("Test case 3 is Completed in AulasCare ");
	
	
}

@Test(priority=4)
public void chatWithAAulasTeam() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Test case 4 is started in AulasCare");
	AC=HP.clickOnAulasCare();
	AC.chatWithAulasTeam("Hi Aulas Team");
	System.out.println("Test case 4 is Completed in AulasCare ");
	
	
}






























}