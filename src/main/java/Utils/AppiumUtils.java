package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumUtils {
	AppiumDriver driver;

	public AppiumUtils(AppiumDriver driver) {
		//super(driver);
		this.driver = driver;
	}
	
	public Double getFormatedAmount(String amount) {
		Double prize = Double.parseDouble(amount.substring(1));
		return prize;

	}
	
	public void waitForElementToAppear(WebElement ele) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains((ele), "text", "Cart"));
	}
}
