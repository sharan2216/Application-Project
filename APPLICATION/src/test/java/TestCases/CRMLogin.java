package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

 
public class CRMLogin extends Credentials {
	WebDriver driver;
	
	@Test
	public void loginmethod()
	{
				{
				driver=BrowserFactory.startApplication(driver,"Chrome","http://automationpractice.com/index.php?controller=authentication&back=my-account");
				
				driver.manage().window().maximize();
				driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				//System.out.println("TITLE IS : "+driver.getTitle());
				driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys("sharan88btm@gmail.com");
				driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Apache@2216");
				driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
				//System.out.println(super.credentials().get("admin"));
				
			}
			
	}

}
