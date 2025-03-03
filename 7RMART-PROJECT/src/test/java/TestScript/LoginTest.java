package TestScript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import AutomationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
  @Test 
  (priority=1,description="verification of user login with valid credentials")
  public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException {
	  String username=ExcelUtility.getStringdata(1, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(1, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterUsernameOnUsernameField(password);
	  login.ClickOnSignInButton();
	 
  
	  
	  
  }
  @Test  (priority=2, description="verification of user login with valid username and  invalid password")
  
  public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
	  String username=ExcelUtility.getStringdata(2, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(2, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterUsernameOnUsernameField(password);
	  login.ClickOnSignInButton();
	  
	  
	  
  }
  @Test  (priority=3,description="verification of user login with invalid username and  valid password")
  
  public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException {
	  String username=ExcelUtility.getStringdata(3, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(3, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterUsernameOnUsernameField(password);
	  login.ClickOnSignInButton();
	  
	  
	  
  }
  
  @Test  (priority=4,description="\"verification of user login with invalid username and  invalid password")
  public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
	  String username=ExcelUtility.getStringdata(4, 0, "LoginPage");	 
	  String password=ExcelUtility.getStringdata(4, 1, "LoginPage");
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameOnUsernameField(username);
	  login.enterUsernameOnUsernameField(password);
	  login.ClickOnSignInButton();
	  
	  
	  
	  
  }
  
  
}
