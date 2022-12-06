package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Andriod_BaseTest.AulasBaseTest;
import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AulasWalletPage extends AndriodGestures {
	public AndroidDriver driver;
	
	public AulasWalletPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
	//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickOnCompletereKYC() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='COMPLETE YOUR KYC']")).click();
		System.out.println("Clicked on plusCOMPLETE YOUR KYC button...");
	}
	
	public void entername(String name) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).sendKeys(name);
		driver.hideKeyboard();
		System.out.println("The entered name is :..."+name+"  ");
	}
	
	public void selectRelation(String relation) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Select Relationship']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='"+relation+"']")).click();
		//Self,Father,Mother,Brother
		System.out.println("The relation was selected successfully");
}
	public void eneterPhoneNumber(String phnumber  ) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Enter number']")).sendKeys(phnumber);
		System.out.println("The Phone number entered is:"+phnumber);
	}
	public void selectGender(String gender) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Select gender']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='"+gender+"']")).click();
		//Male,Female,Female
		System.out.println("The Gender was selected successfully");
	}
	
	public void selectDOB() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Date of Birth']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		}
	
	public void fillBasicInfo(String name,String relation,String phnumber,String gender) throws InterruptedException {
		Thread.sleep(3000);
		entername(name);
		selectRelation(relation);
		eneterPhoneNumber(phnumber);
		selectGender(gender);
		selectDOB();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}