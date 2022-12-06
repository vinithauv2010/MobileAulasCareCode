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

public class SchedulePage extends AndriodGestures {
	public AndroidDriver driver;
	
	public SchedulePage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
	//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	/************************************coding was started**********************/
	
	
	public void clickOnCalenderButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[3]/android.widget.TextView")).click();
		System.out.println("Clicked on CalenderButton ");
		String Plus = driver.findElement(By.xpath("//*[@text='+']")).getText();
		driver.findElement(By.xpath("//*[@text='+']")).click();
		System.out.println("Clicked on plus button...");
		
	}
	
	public void selectSubject() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Select Subject']")).click();
		driver.hideKeyboard();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Android Development']")).click();
		//driver.findElement(By.xpath("Android Development")).click();
		Thread.sleep(3000);
		System.out.println("The selected subject is andriod develeopemnt ...");
		
	}
	
	public void selectClass() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Select Class']")).click();
		driver.hideKeyboard();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='6353 class - ABC']")).click();
	//	driver.findElement(By.xpath("6353 class - ABC")).click();
		Thread.sleep(3000);
		System.out.println("The selected class is 6353 class - ABC ...");
		
	}
	public void selectTeacher() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Select Teacher']")).click();
		driver.hideKeyboard();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Charles leclerc']")).click();
		//driver.findElement(By.xpath("6353 class - ABC")).click();
		Thread.sleep(3000);
		System.out.println("The selected teacher is Charles leclerc ...");
		
	}
	
	public void selectModeOfClass(String mode) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='"+mode+"']")).click();
		//BROADCAST
		//OFFLINE
		System.out.println("The selected mode of class is ..."+mode);
		
	}
	
	public void selectStartDate(String visibleText) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//*[@text='OK'])")).click();
		driver.findElement(By.id("android:id/button1")).click();
	}
	
	public void selectStartTime() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc="2"]")).click();
		driver.findElement(By.id("2")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc="10"]")).click();
		driver.findElement(By.id("10")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		
		
	}
	
public void selectEndTime() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc="3"]")).click();
		driver.findElement(By.id("3")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc="15"]"]")).click();
		driver.findElement(By.id("15")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		}
	
	public void repeatOn(String day) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='"+day+"']")).click();
		//Su,M,T,W,Th,F,S
		System.out.println("The selected day is :"+day);
		
	}
	
	
public void selectLastDay() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		}
	
	public void clickOnSaveBtn() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='SAVE']")).click();
	}
	
	
	public void clickOngoingSchedule() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='ONGOING']")).click();
		System.out.println("Clicked on ongoing schedule...");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@text='All classes']")).click();
		}
	
	public void clickScheduleduled() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='SCHEDULED']")).click();
		System.out.println("Clicked on ongoing SCHEDULED...");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@text='All classes']")).click();
		}	
	
	
	
	
	
	
	
	
	
	
	
}
