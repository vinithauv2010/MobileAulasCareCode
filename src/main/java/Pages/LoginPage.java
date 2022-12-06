package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.AndriodGestures;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.netty.util.internal.SystemPropertyUtil;

public class LoginPage extends AndriodGestures {
	public AndroidDriver driver;
	public HomePage HP;
	final long NANOSEC_PER_SEC = 1000l*1000*1000;
	

	public LoginPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		// PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

//driver.findElement(By.className("android.widget.EditText"));
	@AndroidFindBy(className = "android.widget.EditText")
	private WebElement phoneNumber;
	// driver.findElement(By.xpath("//android.view.ViewGroup[@text='CONTINUE']"))
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@text='CONTINUE']")
	private WebElement continueButton;
	// driver.findElement(By.className("android.widget.EditText")).
	@AndroidFindBy(className = "android.widget.EditText")
	private WebElement OTPbutton;

	// driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='VERIFY']")
	private WebElement VerifyButton;
	
	
	/**************************************************Login code********************************************************/
	protected boolean isElementPresent(By by){
        try{
            driver.findElement(by);
            return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
    }
	
	public void checkUpdateAvailable() throws InterruptedException {
		Thread.sleep(3000);
		boolean update=driver.findElement(By.xpath("//*[@text='Update available']")).isDisplayed();
		int size=driver.findElements(By.className("android.widget.TextView")).size();
		System.out.println("The size is :"+size);
		for(int i=0;i<size;i++) {
			String names=driver.findElements(By.className("android.widget.TextView")).get(i).getText();
			System.out.println("The names are:"+names);
			//boolean updateButton=
		}
		
		//boolean update=driver.findElement(By.className("(android.widget.TextView)[1]")).isDisplayed();
		Boolean isPresent = driver.findElements(By.className("(android.widget.TextView)[1]")).size() > 0;
		if(isPresent) {
			System.out.println("Element is dispalyed");
		}
	/*	if(update=true) {
		
			String retrieved_text = driver.findElement(By.className("(android.widget.TextView)[1]")).getText(); 

		
			driver.findElement(By.className("(android.widget.TextView)[6]")).click();

			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50000));
			wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("(android.widget.TextView)[1]"), retrieved_text)); 
		}*/
		
		//System.out.println("Update was completed ");
	}
public void checkUpdates() throws InterruptedException, MalformedURLException {
	Thread.sleep(9000);
	boolean isPresent=driver.findElement(By.xpath("//*[@text='Update available']")).isDisplayed();
	if(isPresent) {
	List<WebElement> ele=driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
	int sizis=ele.size();
	System.out.println("The size is "+sizis);
	for(int i=0;i<sizis;i++) {
		String namesare=driver.findElements(By.xpath("//*[@class='android.widget.TextView']")).get(i).getText();
		System.out.println("The names are:"+namesare);
		if(namesare.equalsIgnoreCase("Update available")) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@text='UPDATE NOW']")).click();
			/*long startTime = System.nanoTime();
			while ((System.nanoTime()-startTime)< 5*60*NANOSEC_PER_SEC){
			  //System.out.println("waiting for 5 min");
			}*/
			String retrieved_text = driver.findElement(By.xpath("//*[@text='Updating']")).getText(); 
			System.out.println("The test is :"+retrieved_text);
WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
			wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@text='Updating']"), retrieved_text)); 
			break;
		}
		
	}
	Thread.sleep(8000);
	//wait(3000);
	driver.findElement(By.xpath("//*[@text='RESTART AULAS']")).click();
	Thread.sleep(8000);
	System.out.println("Restart was successfully...");
	Thread.sleep(3000);
	//Login();
	
}
	  
		
		
	
	
}

public void initialSetUp() {
	List<WebElement> clickNext=driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
	int count=clickNext.size();
	System.out.println("The count is :"+count);
	for(int i=0;i<count;i++) {
		//String namesAre=driver.findElements(By.xpath("//*[@class='android.widget.TextView']")).get(i).getText();
		//System.out.println("The names are:"+namesAre);
		driver.findElements(By.xpath("//*[@class='android.widget.TextView']")).get(i).click();
	}
	
}

	public HomePage doLogin() throws InterruptedException {
		initialSetUp();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("9812168599");
		driver.hideKeyboard();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		//Thread.sleep(8000);
		/*WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//*[@text='Verify your number']")), "text", "Verify your number"));
		Thread.sleep(2000);*/
		Thread.sleep(10000);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("592726");
		//*[@class='android.widget.EditText']
		driver.hideKeyboard();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@text='VERIFY']")).click();
		Thread.sleep(30000);
		return new HomePage(driver);
	}
	
	public HomePage Login(String mobileNum,String Otp) throws InterruptedException, IOException {
		//	FP=new FeePage(driver);
		
			//initilization();
			
			//tagName[@attribute='value']  -> //tagName
			/*Thread.sleep(8000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='UPDATE NOW']")).click();
			Thread.sleep(8000);
		    driver.findElement(By.xpath("//android.widget.TextView[@text='RESTART AULAS']")).click();
		    Thread.sleep(1000);*/
			for(int i=0;i<7;i++) {
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup")).click();
			}
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys(mobileNum);
			driver.hideKeyboard();
			driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
			Thread.sleep(5000);
			driver.findElement(By.className("android.widget.EditText")).sendKeys(Otp);
			driver.hideKeyboard();
			driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).click();
			Thread.sleep(5000);
			System.out.println("The Login was successfull");
			Thread.sleep(30000);
			return new HomePage(driver);
		}
	/*********************************Production Side
	 * @throws InterruptedException **********************************/
	
	
	public void UpdateProApp() throws InterruptedException {
		
		Thread.sleep(3000);
	boolean updateIsAvailable=	driver.findElement(By.xpath("//*[@text='aulas needs an update']")).isDisplayed();
	System.out.println("The Availability of Updated Version status is :"+" "+updateIsAvailable);
	driver.findElement(By.xpath("//*[@text='Update']")).click();
	System.out.println("Cliked on update button... ");
WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup")));
	//driver.findElement(By.className("android.widget.EditText")).sendKeys("9812168599");
	}
	
	public HomePage LoginProductionApp() throws MalformedURLException, InterruptedException {
		//	FP=new FeePage(driver);
			//initilization();
			
			//tagName[@attribute='value']  -> //tagName
			/*Thread.sleep(8000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='UPDATE NOW']")).click();
			Thread.sleep(8000);
		    driver.findElement(By.xpath("//android.widget.TextView[@text='RESTART AULAS']")).click();
		    Thread.sleep(1000);*/
		for(int i=0;i<7;i++) {
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView")).click();
			}
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys("9399613815");
			driver.hideKeyboard();
			driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
			Thread.sleep(5000);
			driver.findElement(By.className("android.widget.EditText")).sendKeys("592726");
			driver.hideKeyboard();
			driver.findElement(By.xpath("//android.widget.TextView[@text='VERIFY']")).click();
			Thread.sleep(5000);
			System.out.println("The Login was successfull");
			Thread.sleep(30000);
			return new HomePage(driver);
		}

}
