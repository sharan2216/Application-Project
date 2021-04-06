package TestCases;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Credentials 
{
	WebDriver driver;
	@Test
	public void loginmethod()
	{
		driver=BrowserFactory.startApplication(driver,"Chrome","http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//System.out.println("TITLE IS : "+driver.getTitle());
		
	//	String credntial_Customer=Credentials.credentials().get("customer");
		driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys(getUsername("customer"));
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(getPassword("customer"));
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
	public static HashMap<String,String> credentials()
	{
		
		HashMap<String,String> hmap=new HashMap<String,String>();
		hmap.put("customer","sharan88btm@gmail.com:Apache@2216");
		hmap.put("admin","sharan88btm@gmail.com:Apache@2216");
		hmap.put("distributor","sharan88btm@gmail.com:Apache@2216");
		hmap.put("seller","sharan88btm@gmail.com:Apache@2216");
		hmap.put("deliverboy","sharan88btm@gmail.com:Apache@2216");
		return hmap;
		
	}
	public  String getUsername(String role)
	{
		String username=Credentials.credentials().get(role);
		return username.split(":")[0];
	}
	public  String getPassword(String role)
	{
		String password=Credentials.credentials().get(role);
		return password.split(":")[1];
	}
	
	
	
}
