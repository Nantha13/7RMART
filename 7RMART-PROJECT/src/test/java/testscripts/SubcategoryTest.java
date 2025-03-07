package testscripts;

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
import constants.Messages;
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
//	  boolean isAlertdisplayedoncreationsubcategory=subcategory.isAlertDisplayed();
//	  Assert.assertTrue(isAlertdisplayedoncreationsubcategory, "subcategory is not created");
	  boolean isAlertDisplayedForSubcategoryCreation=subcategory.AlertIsDisplayedSubCategoryCreation();
	  Assert.assertTrue(isAlertDisplayedForSubcategoryCreation, Messages.SUBCATEGORYCREATEFAILED);
		   
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
	  subcategory.selectsubcategory() ;
	   subcategory.clickSearch();
	   subcategory.Search_selectcategory();
	   subcategory.enterSearch_SubCategoryName("car");
	   subcategory.clickSearch_btn();
	   
	   
	    
	  
  }
		
		
  }

