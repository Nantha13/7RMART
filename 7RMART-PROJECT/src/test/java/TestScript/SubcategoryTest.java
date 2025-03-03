package TestScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import AutomationCore.Base;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubcategoryTest extends Base {
  
@Test
  public void VerifyUserIsAbleToAddSubcategory() throws AWTException, IOException {
	  String username=ExcelUtility.getStringdata(1, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(1, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterpasswordOnPasswordField(password);
	  login.ClickOnSignInButton();
	  SubCategoryPage subcategory=new SubCategoryPage(driver);
	  subcategory.selectsubcategory() ;
	  subcategory.ClickNewButton();
	  subcategory.selectcategory();
	  String subcategoryname=ExcelUtility.getStringdata(1, 0, "subcategory");
	  subcategory.enterSubCategoryName(subcategoryname);
	  subcategory.uploadImage();
	  subcategory.clickSaveButton();		
	  boolean isAlertdisplayedoncreationsubcategory=subcategory.isAlertDisplayed();
	  Assert.assertTrue(isAlertdisplayedoncreationsubcategory, "subcategory is not created");
		   
		}
  @Test
  public void VerifyUserIsAbleToSearch() throws IOException
  {
	  String username=ExcelUtility.getStringdata(1, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(1, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterpasswordOnPasswordField(password);
	  login.ClickOnSignInButton();
	  SubCategoryPage subcategory=new SubCategoryPage(driver);
	//  WebElement Search=driver.findElement(By.xpath("//a[@onclick='click_button(2)']"));
	// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//  wait.until(ExpectedConditions.elementToBeClickable(Search));
	   
	 //	WebElement dropdown_category = driver.findElement(By.xpath("//select[@name='un']"));
	 //  Select category = new Select(dropdown_category);
	 //	category.selectByIndex(5);
	//  WebElement Subcategory=driver.findElement(By.xpath("//input[@type='text']"));
    //   Search_btn=driver.findElement(By.xpath("//button[@name='Search']"));
   //	Search_btn.click();
	  subcategory.selectsubcategory() ;
	   subcategory.clickSearch();
	   subcategory.Search_selectcategory();
	   subcategory.enterSearch_SubCategoryName("car");
	   subcategory.clickSearch_btn();
	   
	   
	    
	  
  }
		
		
  }

