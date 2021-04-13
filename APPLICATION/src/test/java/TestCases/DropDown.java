package TestCases;
	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import java.util.*;

	//SelectByVisibleText()
	//SelectByIndex()
	//SelectByValue()
	public class DropDown 
	{
		WebDriver driver;
		@Test
		public void demo() {
	        driver=BrowserFactory.startApplication(driver,"Chrome","https://www.opencart.com/");
			driver.manage().window().maximize();
			
			//driver.get("https://www.opencart.com/");
			driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			//WebElement RegisterButton=driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
			
			//RegisterButton.click();
			//driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
			//WebElement drpCOUNTRY=driver.findElement(By.id("input-country"));
			WebElement drpCOURSE=driver.findElement(By.id("course"));
            Select sel=new Select(drpCOURSE);
            //sel.selectByVisibleText("Python");
            //sel.selectByValue("3");
            //sel.selectByIndex(3);
            
            List<WebElement>list1=sel.getOptions(); 
            for(WebElement ele:list1)
            {
            	String StrElement=ele.getText();
                System.out.println(StrElement);
            	if(StrElement.equals("Dot Net"))
            	{
            		ele.click();
            		break;
            	}
            
            }
            
}
}