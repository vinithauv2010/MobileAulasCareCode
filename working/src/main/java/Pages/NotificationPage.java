package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Andriod_BaseTest.AulasBaseTest;
import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NotificationPage extends AndriodGestures {
	public AndroidDriver driver;
	
	public NotificationPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
	//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickOnAnnouncement() {
		
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[2]")).click();
		System.out.println("Cliked on announcement in notifiaction module...");
		wait(3000);
		driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click();
		System.out.println("Clicked on back button....");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		System.out.println("Again clicked back......");
	}
	
public void clickOntest() {
		
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[1]")).click();
		System.out.println("Cliked on test in notifiaction module...");
		wait(3000);
		driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click();
		System.out.println("Clicked on back button....");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		System.out.println("Again clicked back......");
	}

public void clickOnFeePayments() {
	
	wait(3000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
	System.out.println("Cliked on FeePayments in notifiaction module...");
	wait(3000);
	driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click();
	System.out.println("Clicked on back button....");
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	System.out.println("Again clicked back......");
}

public void clickOnOthers() {
	
	wait(3000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]")).click();
	System.out.println("Cliked on others in notifiaction module...");
	wait(3000);
	driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click();
	System.out.println("Clicked on back button....");
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	System.out.println("Again clicked back......");
}

public void clickOnDigitalLib() {
	
	wait(3000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]")).click();
	System.out.println("Cliked on digitalLibrary in notifiaction module...");
	wait(3000);
	driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click();
	System.out.println("Clicked on back button....");
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	System.out.println("Again clicked back......");
}


}