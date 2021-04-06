package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver,String browsername,String appURL)
	{
		if(browsername.equals("Chrome"))//89.0.4389.114
		{
	        System.out.println("browser started");
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		if(browsername.equals("iexplore"))
		{
			System.setProperty("webdriver.iexplore.driver","./Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		if(browsername.equals("geckodriver"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("Browser doesn't exist");
		}
		return driver;
	  }
	
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}


}
