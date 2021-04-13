package TestCases;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetAttribute 
{
	WebDriver driver;
	@Test
	public void demo() {
        driver=BrowserFactory.startApplication(driver,"Chrome","https://admin-demo.nopcommerce.com/admin/");
		driver.manage().window().maximize();
		
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		WebElement emailinputbox=driver.findElement(By.xpath("//input[@id='Email']"));
		
		//Capturing text from input Box
		
		System.out.println(emailinputbox.getAttribute("value"));
		System.out.println(emailinputbox.getText());
		System.out.println("--------------------------");
		
		//LOGIN BUTTON
		
		WebElement LoginButton=driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println(LoginButton.getAttribute("type"));
		System.out.println(LoginButton.getAttribute("class"));
		
		System.out.println(LoginButton.getText());
		System.out.println("--------------------------");
		WebElement PageHeader=driver.findElement(By.xpath("//div[@class='page-title']//h1"));
		System.out.println(PageHeader.getText());
		
	}
}
