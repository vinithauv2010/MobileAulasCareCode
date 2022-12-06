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
import Pages.FeePage;
import Pages.HomePage;
import Pages.NotificationPage;
import Pages.SchedulePage;
import io.appium.java_client.android.AndroidDriver;

public class FeeModule extends AulasBaseTest {
	public AndroidDriver driver;
	public SchedulePage SP;
	public HomePage HP;
	public AulasCarePage AC;
	public AulasWalletPage AW;
	public NotificationPage NP;
	public FeePage FP;

	ExtentReports extent;

	@BeforeSuite
	public void doLoginOperation() throws InterruptedException, IOException {
//	LP.doLogin();
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\config.properties");
		prop.load(fis);
		ConfigureAppium();
		Thread.sleep(8000);
		LP.checkUpdates();
		HP = LP.Login(prop.getProperty("SuperAdmniPhno"),prop.getProperty("OTP"));

	}

	@Test(priority = 1)

	public void generatePaymentRequest() throws InterruptedException {
		wait(3000);
		System.out.println("Generate fee request test cases started ..");
		FP = HP.clickOnFee();
		//SFP.generatePaymentRequestIndividual();
		FP.modeOfPayment("Generate Payment Request");
		FP.individualFeeReq("ramesh student", "30");
		System.out.println("Generate fee request test cases completed ..");

	}
	
	@Test(priority = 2)

	public void generatePaymentRequestClass() throws InterruptedException {
		wait(3000);
		System.out.println("Generate fee request for class test cases started ..");
		FP = HP.clickOnFee();
		//SFP.generatePaymentRequestIndividual();
		FP.modeOfPayment("Generate Payment Request");
		FP.generateClassFeeReq("30");
		System.out.println("Generate fee request for class test cases completed ..");

	}
	
	@Test(priority = 3)

	public void generateOfflinePayment() throws InterruptedException {
		wait(3000);
		System.out.println("generateOfflinePayment test cases started ..");
		FP = HP.clickOnFee();
		//SFP.generatePaymentRequestIndividual();
		FP.modeOfPayment("Add Offline Payment");
		FP.AddOffilePayment("ramesh student","Debit/Credit card");
		System.out.println("generateOfflinePayment test cases completed ..");

	}
}