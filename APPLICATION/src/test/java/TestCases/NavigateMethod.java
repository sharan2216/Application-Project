package TestCases;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestCases.BrowserFactory;

public class NavigateMethod {

	WebDriver driver;
	@Test
	public void demo() {
        driver=BrowserFactory.startApplication(driver,"Chrome","https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		driver.navigate().to("https://www.snapdeal.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		

	}

}
