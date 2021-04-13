package TestCases;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class FindElements {

	WebDriver driver;
	@Test
	public void demo() {
        driver=BrowserFactory.startApplication(driver,"Chrome","https://www.snapdeal.com/");
        
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 950);");
		*/
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 
		
		//Return Single Element
	  //WebElement ele=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	  // System.out.println(ele.getText());
	   // searchbox.sendKeys("ABC");
		
	   //Return first element bcoz its findElement --not findElements 
	   WebElement ele1=driver.findElement(By.xpath("//div[@class='leftNavigationLeftContainer expandDiv']"));//div[@class='footer-upper']//a
	
	   System.out.println(ele1.getText());
	   
	   //Throws error NoSuchElementFound Exception	   
	  // WebElement ele2=driver.findElement(By.xpath("//button[@class='button-1 Login-box-button']"));
	  // System.out.println(ele2.getText());
	   
	   List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	   System.out.println(links.size());
	  for(WebElement e:links)
	  {
		  System.out.println(e.getText());
	  }
     
	}

}
