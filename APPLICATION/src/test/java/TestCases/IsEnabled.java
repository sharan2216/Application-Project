package TestCases;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import TestCases.BrowserFactory;

//isDisplayed()  & IsEnabled()

public class IsEnabled 
{
	WebDriver driver;
	
       @Test
		public void demo() {
        driver=BrowserFactory.startApplication(driver,"Chrome","https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fdemo");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//WebElement firstnameField=driver.findElement(By.xpath("//input[@id='FirstName]"));
		WebElement firstnameField=driver.findElement(By.xpath("//input[@name='FirstName']"));
		
		System.out.println("Display Status :"+firstnameField.isDisplayed());
		System.out.println("Enabled Status :"+firstnameField.isEnabled());
		
				

	}

}
