package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import AutomationCore.Base;
import constants.Messages;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
  @Test
  (priority=1,description="verification of user login with valid credentials",retryAnalyzer=retry.Retry.class,groups="smoke")
  public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException {
	  String username=ExcelUtility.getStringdata(1, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(1, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterpasswordOnPasswordField(password);
	  login.ClickOnSignInButton();
	  String expected = "Dashboard | 7rmart supermarket";
	  String actual = driver.getTitle();
	   Assert.assertEquals(actual, expected, Messages.LOGINFAILED);
	  
  }
  @Test 
  (priority=2, description="verification of user login with valid username and  invalid password")
  
  public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
	  String username=ExcelUtility.getStringdata(2, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(2, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterpasswordOnPasswordField(password);
	  login.ClickOnSignInButton();
	  Assert.assertEquals(driver.getTitle(), "Login | 7rmart supermarket", Messages.INVAILDPASSWORDLOGIN);
	    
	  
  }
  @Test  (priority=3,description="verification of user login with invalid username and  valid password")
  
  public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
	  String username=ExcelUtility.getStringdata(3, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(3, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterpasswordOnPasswordField(password);
	  login.ClickOnSignInButton();
	  Assert.assertEquals(driver.getTitle(), "Login | 7rmart supermarket", Messages.INVALIDUSERNAME);
	    
  }
  
  @Test  (priority=4,description="\"verification of user login with invalid username and  invalid password",groups="smoke")
  public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
	  String username=ExcelUtility.getStringdata(4, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(4, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterpasswordOnPasswordField(password);
	  login.ClickOnSignInButton();
	  Assert.assertEquals(driver.getTitle(), "Login | 7rmart supermarket",Messages.INVALIDUSERNAMEANDPASSWORD);
	    
	  
  }
  
  
}
