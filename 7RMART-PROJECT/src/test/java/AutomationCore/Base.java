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

public class Base {
	public WebDriver driver;
	

	@BeforeMethod(alwaysRun = true)
	@org.testng.annotations.Parameters("browser")
	public void initializeBrowser(String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();

		}
		else
		{
			throw new Exception("An Invalid Browser");
		}
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void driverQuit(ITestResult itestresult ) throws IOException {//ITestResult interface manage all the test results
		if(itestresult.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtility screenShot=new ScreenshotUtility();
			screenShot.getScreenshot(driver, itestresult.getName());
		}
		//driver.quit();
	}
}
