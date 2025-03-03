package AutomationCore;

import org.testng.annotations.Test;
import com.beust.jcommander.Parameters;

import utilities.ScreenshotUtility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Base{
	public WebDriver driver;
	
  @BeforeMethod
 
  public void initializeBrowser() {
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

	/*    if(browser.equalsIgnoreCase("Chrome"))
	    {
	    	driver=new ChromeDriver();
	    }
	    else if(browser.equalsIgnoreCase("Firefox"))
	    {
	    	driver=new FirefoxDriver();
	    }
	    else  if(browser.equalsIgnoreCase("Edge"))
	    {
	    	driver=new EdgeDriver();
	    }
	    else
	    {
	    	throw new Exception("invalid browser");
	    }
	      */

 @AfterMethod
  public void driverQuit(ITestResult itestresult) throws IOException {
	 if(itestresult.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtility screenShot=new ScreenshotUtility();
			screenShot.getScreenshot(driver, itestresult.getName());
		}

	 
	 
 // driver.quit();
 }  
}

