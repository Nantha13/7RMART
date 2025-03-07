package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import AutomationCore.Base;
import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;


public class AdminUserTest extends Base {

	@Test (priority = 1, description = "Add new user to the admin usr page",groups="smoke")
	public void VerifyUserCanAddNewAdminUser() throws IOException {
	    String username=ExcelUtility.getStringdata(1, 0, "LoginPage");	 
	    String password=ExcelUtility.getStringdata(1, 1, "LoginPage");
	    LoginPage login=new LoginPage(driver);
	    login.enterUsernameOnUsernameField(username);
	 	login.enterpasswordOnPasswordField(password);
        login.ClickOnSignInButton();
		AdminUserPage adminuserpage = new AdminUserPage(driver);
		adminuserpage.clickAdminUser();
		adminuserpage.clickManageUser();
		adminuserpage.clickNewButton();
		FakerUtility faker=new FakerUtility();
		String newusername = faker.createUsername();
		String newpassword = faker.createPassword();
		adminuserpage.enterNewUsernameAndPassword(newusername, newpassword);
		adminuserpage.selectUserTypeFromDropdown();
		adminuserpage.clickSaveButton();
		//boolean isAlertCheck=adminuserpage.isAlertDisplayed();
	//	Assert.assertTrue(isAlertCheck,Messages.NEWUSERCREATIONFAILED);
	}

}
