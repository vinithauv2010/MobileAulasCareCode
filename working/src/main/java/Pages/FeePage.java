package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class FeePage extends AndriodGestures  {
	
	public AndroidDriver driver;
	public SchedulePage SP;
		
		public FeePage (AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		

	public void modeOfPayment(String mF) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='"+mF+"']")).click();
		//Generate Payment Request,Add Offline Payment,Transactions,All Students
		System.out.println("Cliked on Generate Payment Request btn...");
	}
public void individualFeeReq(String studentName,String amount) {
	wait(3000);
	selectClass();
	clickOnSearchNameorMobile(studentName);
	enterAmount(amount);
	enterDiscriotion();
	
	
}

public void selectClass() {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Select Class']")).click();
	//driver.hideKeyboard();
	wait(3000);
	driver.findElement(By.xpath("//*[@text='6353 class - ABC']")).click();
	System.out.println("Cliked on 6353 class - ABC class...");
}

public void clickOnSearchNameorMobile(String studentName) {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Search name / mobile number']")).sendKeys(studentName);
	wait(3000);
	//ramesh student 
	driver.findElement(By.xpath("//*[@text='"+studentName+"']")).click();
	driver.hideKeyboard();
	System.out.println("Selected student name is :"+studentName);
	
}

public void enterAmount(String amount) {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Enter amount']")).sendKeys(amount);
	driver.hideKeyboard();
	System.out.println("Selected amount is :"+amount);
}

public void selectDueDate() {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Set due date']")).click();
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Set due date']")).click();
}

public void enterDiscriotion() {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Enter description']")).sendKeys("Hello");
	wait(3000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	wait(3000);
	System.out.println("..Clciked on back button");
	
	
}


public void generateClassFeeReq(String amount) {
	wait(3000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
	selectClass();
	enterAmount(amount);
	enterDiscriotion();
	
}

public void selectTransactionDetails() {
	wait(3000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	driver.hideKeyboard();
	System.out.println("selected one of the transaction details....");
	
}

public void selectPaidDate() {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Set payment date']")).click();
	wait(3000);
	}

public void selectModeOfPayment(String paymentMode) {
	wait(3000);
	scrollToText("Type your transaction ID");
	driver.findElement(By.xpath("//*[@text='"+paymentMode+"']")).click();
	//Cash,Debit/Credit card,UPI,Bank transfer,Cheque
	if(paymentMode.equalsIgnoreCase("Debit/Credit card")) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Type your transaction ID']")).sendKeys("123456789");
		System.out.println("The transaction id is entered...");
		
	}
	else if(paymentMode.equalsIgnoreCase("UPI")) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Type your transaction ID']")).sendKeys("123456789");
		System.out.println("The transaction id is entered...");
		
	}
	else if(paymentMode.equalsIgnoreCase("Bank transfer")) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Type your transaction ID']")).sendKeys("123456789");
		System.out.println("The transaction id is entered...");
		
	}
	
	else if(paymentMode.equalsIgnoreCase("Cheque")) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Type your cheque Number']")).sendKeys("123456789");
		System.out.println("The transaction id is entered...");
		
	}
	System.out.println("The mode of payment is "+paymentMode);
}
public void AddOffilePayment(String studentName,String paymentMode) {
	wait(3000);
	selectClass();
	clickOnSearchNameorMobile(studentName);
	selectTransactionDetails();
	selectModeOfPayment(paymentMode);
	
	
	
}











}
