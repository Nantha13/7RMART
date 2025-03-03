package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(linkText = "Admin")  private WebElement admin;
	@FindBy(linkText = "Logout")  private WebElement logout;
	@FindBy(xpath="//button[text()='Sign In']") private WebElement signin;
	
	
	 public void ClickOnAdmin_btn() {
		 admin.click(); 
		 
	 }  
	 
	 public void ClickOnLogout_btn() {
		
		 logout.click(); 
	 }  
	 
	 public boolean isSignInButtonDisplayed()
		{
			return signin.isDisplayed();
		}
	
	
	
	
	
}
