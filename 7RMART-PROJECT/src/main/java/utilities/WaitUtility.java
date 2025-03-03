 package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static int IMPLICITWAIT=10;
	public static int EXPLICITWAIT=10;

public void waitForElementToBeClickable1(WebDriver driver,WebElement element)
{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	  wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void waitForalertIsPresent(WebDriver driver,WebElement element)
{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	  wait.until(ExpectedConditions.elementToBeSelected(element));
}

public void waitForattributeToBe(WebDriver driver,WebElement element)
{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	  wait.until(ExpectedConditions.attributeToBe(element, null, null));
}
public void waitForattributeContains(WebDriver driver,WebElement element)
{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	  wait.until(ExpectedConditions.attributeContains(element, null, null));
}

public void waitelementToBeSelected(WebDriver driver,WebElement element)
{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(EXPLICITWAIT));
	  wait.until(ExpectedConditions.elementToBeSelected(element));
}

public void waitelementToBeVisibled(WebDriver driver,WebElement element)
{
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOf(element));
}

public void Implicitwait(WebDriver driver) {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITWAIT));
}
public void Fluentwait(WebDriver driver,WebElement element,String attribute,String attributevalue,int total)
{
	
	
Wait<WebDriver> fluentwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(total))

.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

fluentwait.until(ExpectedConditions.attributeContains(element, attribute, attributevalue));
}

}
