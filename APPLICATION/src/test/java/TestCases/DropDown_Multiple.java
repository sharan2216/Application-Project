package TestCases;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;

import org.openqa.selenium.*;

public class DropDown_Multiple
{
static WebDriver driver;

public static void ddmethod(WebElement ele,String value)
{
	Select sel=new Select(ele);
	
	List<WebElement>ddlist=sel.getOptions();	
	for(WebElement e:ddlist)
	{
	     if(e.getText().equals(value))
	     {
	    	 e.click();
	    	 break;
	     }
	}
			
}

	public static void main(String[] args) {
		driver=BrowserFactory.startApplication(driver,"Chrome","https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Set<Cookie>cookies=driver.manage().getCookies();
		System.out.println(" Total cookies "+cookies.size());
		
		for(Cookie cookie:cookies)
		{			
			System.out.println(cookie.getClass()+" " +cookie.getValue());
			System.out.println(cookie.getPath());
		}
		
		//driver.findElement(By.xpath("//div[@class='optanon-alert-box-button optanon-button-allow']//a[@class='optanon-allow-all accept-cookies-button']")).click();
		//driver.findElement(By.name("//div[@class='optanon-alert-box-button-middle accept-cookie-container']")).click();;
		WebElement DD_Employees=driver.findElement(By.name("NoOfEmployees"));
		ddmethod(DD_Employees,"16 - 20");
		WebElement DD_Country=driver.findElement(By.name("Country"));
		ddmethod(DD_Country,"Ghana");
		WebElement DD_Industry=driver.findElement(By.name("'Industry"));
		ddmethod(DD_Industry,"Healthcare");
		
		
		
		
		
		
		
	}

}
