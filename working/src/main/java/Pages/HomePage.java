package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends AndriodGestures {

public AndroidDriver driver;
public SchedulePage SP;
	
	public HomePage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

	public SchedulePage clickOnScheduleButton() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@content-desc='Schedule, tab, 1 of 4']")).click();
		driver.findElement(By.xpath("//*[@text='Schedule']")).click();
		
		System.out.println("Clicked on schedule button");
		Thread.sleep(30000);
		return new SchedulePage(driver);
	}
	
	public void selectOrganization() throws InterruptedException{
		Thread.sleep(3000);
		String ORGName=driver.findElement(By.xpath("//*[@text='Brigosha']")).getText();
		driver.findElement(By.xpath("//*[@text='Brigosha']")).click();
		System.out.println("Clicked on :"+" "+ORGName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Next ➞']")).click();
		System.out.println("Clicked on Next Button...");
	}
	public void selectProductionTest() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Production testing.\"));"));
		String ORGName=driver.findElement(By.xpath("//*[@text='Production testing.']")).getText();
		//driver.findElement(By.xpath("//*[@text='Brigosha']")).click();
		System.out.println("Clicked on :"+" "+ORGName);
	}
	
	public void clickOnMoreButton() throws InterruptedException {
		Thread.sleep(3000);
		String more=driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc="More, tab, 4 of 4"]/android.widget.TextView[2]")).click();
		System.out.println("clicked on :"+more+" Button");
		
	}
	public FeePage ClickOnFee() throws InterruptedException {
		Thread.sleep(3000);
		String more=driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc="More, tab, 4 of 4"]/android.widget.TextView[2]")).click();
		System.out.println("clicked on :"+more+" Button");
		return new FeePage(driver);
	}
	
	
	public AulasWalletPage ClickOnAulasWallet() throws InterruptedException {
		Thread.sleep(3000);
		scrollAndClick("aulas Wallet");
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc="More, tab, 4 of 4"]/android.widget.TextView[2]")).click();
		System.out.println("clicked on aulas wallet Button");
		return new AulasWalletPage(driver);
	}
	
	public NotificationPage clickOnNotificationBtn() {
		wait(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")).click();
		
		System.out.println("Clicked on the notification btn...");
		return new NotificationPage(driver);
		}
	
	public FeePage clickOnFee() {
		
		wait(3000);
		driver.findElement(AppiumBy.accessibilityId("Fee, tab, 3 of 4")).click();
		System.out.println("Clicked on the Fee module btn...");
		return new FeePage(driver);
	}
	
	public AulasCarePage clickOnAulasCare() throws InterruptedException {
		// Thread.sleep(3000);
		Thread.sleep(3000);
		
		scrollAndClick("aulas Care");
		//String aulasCare = driver.findElement(By.xpath("//*[@text='aulas Care']")).getText();
		//driver.findElement(By.xpath("//*[@text='aulas Care']")).click();
		// driver.findElement(By.xpath("//android.widget.Button[@content-desc="More,
		// tab, 4 of 4"]/android.widget.TextView[2]")).click();
		System.out.println("clicked on :"+"Aulascare"+" Button");
		return new AulasCarePage(driver);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
