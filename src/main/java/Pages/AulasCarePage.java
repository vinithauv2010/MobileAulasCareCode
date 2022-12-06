package Pages;

//import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AulasCarePage extends AndriodGestures {
	public AndroidDriver driver;

	public AulasCarePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		// PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void clickOnMoreButton() throws InterruptedException {
		Thread.sleep(3000);
		String more = driver.findElement(By.xpath("//*[@text='More']")).getText();
		driver.findElement(By.xpath("//*[@text='More']")).click();
		// driver.findElement(By.xpath("//android.widget.Button[@content-desc="More,
		// tab, 4 of 4"]/android.widget.TextView[2]")).click();
		System.out.println("clicked on :" + more + " Button");
	}

	
	public void clickOnSupport() throws InterruptedException {
		// Thread.sleep(3000);
		Thread.sleep(3000);
		String support = driver.findElement(By.xpath("//*[@text='Support']")).getText();
		driver.findElement(By.xpath("//*[@text='Support']")).click();
		// driver.findElement(By.xpath("//android.widget.Button[@content-desc="More,
		// tab, 4 of 4"]/android.widget.TextView[2]")).click();
		System.out.println("clicked on :" + support + " Button");
	}

	public void clickOnViewAll(String view) throws InterruptedException {
		// Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ view + "\").instance(0))"))
				.click();
		// String viewAll=driver.findElement(By.xpath("//*[@text='VIEW
		// ALL']")).getText();

		// driver.findElement(By.xpath("//*[@text='VIEW ALL']")).click();
		// driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
		// driver.findElement(By.xpath("//android.widget.Button[@content-desc="More,
		// tab, 4 of 4"]/android.widget.TextView[2]")).click();
		// System.out.println("clicked on :"+viewAll+" Button");

		Thread.sleep(3000);
		System.out.println("Clicked on the view all button...");
	}

	public void doChart(String visibleText, String chat) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))"))
				.click();
		Thread.sleep(8000);
		driver.findElement(AppiumBy.accessibilityId("Type your response here")).sendKeys(chat);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView"))
				.click();

	}

	public void clickCovid19(String covid) throws InterruptedException {
		// Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ covid + "\").instance(0))"))
				.click();

		Thread.sleep(3000);
		System.out.println("Clicked on Covid-19 resources button...");
	}

	public void clickVaccination() throws InterruptedException {
		Thread.sleep(3000);

		String vaccination = driver.findElement(By.xpath("//*[@text='FIND A VACCINATION CENTER']")).getText();
		// Covid-19 resources
		driver.findElement(By.xpath("//*[@text='FIND A VACCINATION CENTER']")).click();

		Thread.sleep(3000);
		System.out.println("clicked on :" + vaccination + " Button");
		Set<String> contexs = driver.getContextHandles();
		for (String contexName : contexs) {
			System.out.println("The Contexs names are :" + contexName);
		}
		Thread.sleep(10000);
		driver.context("WEBVIEW_chrome");
	}

	public void registerInBrowser() throws InterruptedException {
		Thread.sleep(3000);
		// String register=driver.findElement(By.xpath("//*[@text='Register / Sign
		// In']")).getText();
		driver.findElement(By.xpath("//*[@text='Register / Sign In']")).click();
		// System.out.println("Clicked on :"+register);

	}

	public void FAQs(String faq) throws InterruptedException {
		// Thread.sleep(3000);
		// FAQs
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ faq + "\").instance(0))"))
				.click();

		Thread.sleep(3000);
		System.out.println("Clicked on FAQ's button...");
	}

	public void checkAllFAQs() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='What is aulas?']")).click();
		driver.findElement(By.xpath("//*[@text='What is aulas?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='How can an institute get onboard aulas?']")).click();
		driver.findElement(By.xpath("//*[@text='How can an institute get onboard aulas?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Technical specifications?']")).click();
		driver.findElement(By.xpath("//*[@text='Technical specifications?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='How stable is aulas in low internet?']")).click();
		driver.findElement(By.xpath("//*[@text='How stable is aulas in low internet?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='How can hybrid classes be conducted using aulas?']")).click();
		driver.findElement(By.xpath("//*[@text='How can hybrid classes be conducted using aulas?']")).click();
		Thread.sleep(3000);
		String lastQues = "How many users can be added on aulas?";
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ lastQues + "\").instance(0))"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='What features does aulas provide?']")).click();
		driver.findElement(By.xpath("//*[@text='What features does aulas provide?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='What level of digital literacy is required to use aulas?']")).click();
		driver.findElement(By.xpath("//*[@text='What level of digital literacy is required to use aulas?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='How many users can be added on aulas?']")).click();
		driver.findElement(By.xpath("//*[@text='How many users can be added on aulas?']")).click();

	}

	/***********************************
	 * Aulas Wallet
	 *********************************************/
	public void clickOnWallet(String wallet) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ wallet + "\").instance(0))"))
				.click();
		System.out.println("Clicked on the Aulas wallet Button");

	}

	public void clickOnCompleteKYC() throws InterruptedException {
		Thread.sleep(3000);
		String kyc = driver.findElement(By.xpath("//*[@text='COMPLETE YOUR KYC']")).getText();
		driver.findElement(By.xpath("//*[@text='COMPLETE YOUR KYC']")).click();
		System.out.println("clicked on :" + kyc + "Button");

	}

	public void fillBasicInfo(String relation, String gender) throws InterruptedException {
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//*[@text='Hi321']"));
		
		name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		name.clear();
		name.sendKeys("Hi321");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@text='Mother']")).click();
		// select relations are Father,Mother,Brother

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='" + relation + "']")).click();
		System.out.println("The selected relation  is " + relation);

		// select Gneder Male,Female,Others

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.xpath("//*[@text='" + gender + "']")).click();
		System.out.println("The selected Gender is " + gender);
		Thread.sleep(3000);
		String email = "abc123@gmail.com";
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ email + "\").instance(0))"));
		WebElement mailid = driver.findElement(By.xpath("//*[@text='abc123@gmail.com']"));
		mailid.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		mailid.clear();
		mailid.sendKeys("abc123@gmail.com");
		driver.hideKeyboard();
		System.out.println("The mail id is set successfully...");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@text='PROCEED']")).click();
		System.out.println("clicked on PROCEED button ...");

	}

	public void generateCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String date1 = dateFormat.format(date);

		// Print the Date
		System.out.println(date1);
	}

	public void fillContactDetails() throws InterruptedException {
		// select address
		Thread.sleep(3000);
		String AD="dn";
		WebElement address = driver.findElement(By.xpath("//*[@text='dn']"));
		address.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		address.clear();
		address.sendKeys(AD);
		driver.hideKeyboard();
		System.out.println("The printed Address is :"+AD);

		// Select Pincode
		Thread.sleep(3000);
		String code="560102";
		WebElement pinCode = driver.findElement(By.xpath("//*[@text='560102']"));
		pinCode.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		pinCode.clear();
		pinCode.sendKeys(code);
		driver.hideKeyboard();
		System.out.println("The printed Pincode is :"+code);
		
		// select State
		Thread.sleep(3000);
		String statename="Karnataka";
		WebElement State = driver.findElement(By.xpath("//*[@text='Karnataka']"));
		State.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		State.clear();
		State.sendKeys(statename);
		driver.hideKeyboard();
		System.out.println("The printed Statename is :"+statename);

		// select District
		String districtName="Bangalore";
		Thread.sleep(3000);
		WebElement District = driver.findElement(By.xpath("//*[@text='Bangalore']"));
		District.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		District.clear();
		District.sendKeys(districtName);
		driver.hideKeyboard();
		System.out.println("The printed DistrictName is :"+districtName);

		// select Country
		Thread.sleep(3000);
		String CountryName="India";
		WebElement Country = driver.findElement(By.xpath("//*[@text='India']"));
		Country.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Country.clear();
		Country.sendKeys(CountryName);
		driver.hideKeyboard();
		System.out.println("The printed Country is :"+CountryName);
		
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@text='PROCEED']")).click();
		System.out.println("clicked on PROCEED button 2 ...");
		

	}

	
	public void upDateDocument() throws InterruptedException {
		Thread.sleep(3000);	
		/*driver.findElement(By.xpath("//*[@text='Aadhaar']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@text='upload front adhar again']")).click();
		Thread.sleep(3000);
		String AdharNumberIs="739749337800";
		WebElement AdharNo=driver.findElement(By.xpath("//*[@text='739749337800']"));
		AdharNo.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		AdharNo.clear();
		AdharNo.sendKeys(AdharNumberIs);
		driver.hideKeyboard();*/
		updateAdharFB();
		enterPANDeatils();
		
		
		}
	
	public void updateAdharFB() throws InterruptedException {
		//upload file
				Thread.sleep(3000);	
				driver.findElement(By.xpath("//*[@text='CLICK TO VIEW FILE ']")).click();
				Thread.sleep(3000);	
				
				String file="File";
				driver.findElement(AppiumBy.androidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
								+ file + "\").instance(0))"));
				
				driver.findElement(By.xpath("//*[@text='File']")).click();
				Thread.sleep(3000);	
				driver.findElement(By.xpath("//*[@text='TNPSC Field Surveyor Syllabus 2022 PDF.pdf']")).click();
				Thread.sleep(5000);	
				driver.findElement(By.xpath("//*[@text='CLICK TO VIEW FILE ']")).click();
				
				//
				Thread.sleep(3000);	
				driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup])[7]")).click();
				Thread.sleep(3000);	
			
				String file2="File";
				driver.findElement(AppiumBy.androidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
								+ file2 + "\").instance(0))"));
				
				driver.findElement(By.xpath("//*[@text='File']")).click();
				Thread.sleep(3000);	
				driver.findElement(By.xpath("//*[@text='TNPSC Field Surveyor Syllabus 2022 PDF.pdf']")).click();
				Thread.sleep(5000);	
				driver.findElement(By.xpath("//*[@text='CLICK TO VIEW FILE ']")).click();
				}
	
	public void enterPANDeatils() throws InterruptedException {
		Thread.sleep(3000);	
		//driver.findElement(By.xpath("//*[@text='FKOLF3805M']")).click();
		WebElement Pan = driver.findElement(By.xpath("//*[@text='FKOLF3805M']"));
		Pan.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Pan.clear();
		Pan.sendKeys("FKOLF3805M");
		driver.hideKeyboard();
		Thread.sleep(3000);	
		
	}
	
	public void clickOnProcced() throws InterruptedException {
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@text='PROCEED']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@text='PROCEED']")).click();
	}
	
	public void clickAccountDetails() throws InterruptedException {
		Thread.sleep(3000);	
		String accountDetails=driver.findElement(By.xpath("//*[@text='Account Details']")).getText();
		driver.findElement(By.xpath("//*[@text='Account Details']")).click();
		System.out.println("Clicked on :"+" "+accountDetails);
		
	}
	
	public void enterAccountName() throws InterruptedException {
		Thread.sleep(3000);	
		String accountDetails=driver.findElement(By.xpath("//*[@text='Developer']")).getText();
		WebElement name=driver.findElement(By.xpath("//*[@text='Developer']"));	
		name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		name.clear();
		name.sendKeys("Developer");
		driver.hideKeyboard();
		System.out.println("clicke on :"+" "+accountDetails);
		
	}
	
	public void enterEmailID() throws InterruptedException {
		Thread.sleep(3000);	
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")).click();
		System.out.println("Clicked on edit button...");
		Thread.sleep(3000);	
		WebElement email=driver.findElement(By.xpath("//*[@text='developer@vectorseducation.com']"));
		email.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		email.clear();
		email.sendKeys("developer@vectorseducation.com");
		driver.hideKeyboard();
		//driver.findElement(By.xpath("")).click();
		
		}
	
	public void enterPhoneNumb() throws InterruptedException {
		Thread.sleep(3000);	
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.TextView")).click();
	Thread.sleep(3000);	
	WebElement phoneNum=driver.findElement(By.xpath("//*[@text='9812168599']"));
	phoneNum.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	phoneNum.clear();
	phoneNum.sendKeys("9812168599");
	driver.hideKeyboard();
	
	}
	
	public void chatWithInstitute(String message) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Chat with your institute']")).click();
		System.out.println("Clicked on the Chat with your institute btn...");
		wait(3000);
		driver.findElement(AppiumBy.accessibilityId("Type your question here")).sendKeys(message);
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView")).click();
		System.out.println("The entered text is :"+message);
		
		
	}
	
	public void chatWithAulasTeam(String message) {
		wait(3000);
		scrollAndClick("Chat with aulas team");
		
		System.out.println("Clicked on the Chat with aulas team btn...");
		wait(3000);
		driver.findElement(AppiumBy.accessibilityId("Type your question here")).sendKeys(message);
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"send\"]/android.widget.TextView")).click();
		System.out.println("The entered text is :"+message);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
