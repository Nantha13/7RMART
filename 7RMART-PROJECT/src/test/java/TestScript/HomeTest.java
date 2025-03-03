package TestScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import AutomationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base{
@Test
	 public void verifyUserIsAbleToLogout() throws IOException {
  
  String username=ExcelUtility.getStringdata(1, 0, "LoginPage");	 
  String password=ExcelUtility.getStringdata(1, 1, "LoginPage");
  LoginPage login=new LoginPage(driver);
  login.enterUsernameOnUsernameField(username);
  login.enterpasswordOnPasswordField(password);
  login.ClickOnSignInButton();
  HomePage home=new HomePage(driver);
  home.ClickOnAdmin_btn();
  home.ClickOnLogout_btn();
  boolean isSignInButtonDisplayed=home.isSignInButtonDisplayed();
  Assert.assertTrue( isSignInButtonDisplayed, "Logout failed");

  
 

  
  
  
}
}