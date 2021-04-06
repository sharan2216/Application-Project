package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import TestCases.BrowserFactory;

public class LoginApp {
	WebDriver driver;
	@Test
	public void loginmethod()
	{
				{
				driver=BrowserFactory.startApplication(driver,"Chrome","https://www.google.co.in/?gws_rd=ssl");
				//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.co.in/?gws_rd=ssl");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//System.out.println("TITLE IS : "+driver.getTitle());
				driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Godzilla vs Kong");
				
			}
			
	}

}
