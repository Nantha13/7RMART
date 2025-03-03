package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SubCategoryPage {


	public WebDriver driver;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//p[text()='Sub Category']") private WebElement SubcategoryMenu;
	@FindBy(xpath="//a[@onclick='click_button(1)']") private WebElement New_btn ;
	@FindBy(xpath="//select[@id='cat_id']") private WebElement dropdown_category ;
	//Select category = new Select(dropdown_category);	
	@FindBy(xpath="//input[@id='subcategory']") private WebElement Subcategory ;
	@FindBy(xpath="//input[@id='main_img']") WebElement UploadFile;
	@FindBy(xpath="//button[@name='create']")  WebElement Save;
	@FindBy(xpath="//a[@type='button']") WebElement cancel;
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement Search;
	@FindBy(xpath="//select[@name='un']") WebElement dropdowncategory ;
	@FindBy(xpath="//input[@type='text']") WebElement Search_Subcategory;
	@FindBy(xpath="//button[@name='Search']") WebElement Search_btn;
	@FindBy(xpath="//button[@data-dismiss='alert']") WebElement Alert_subcategory;
	
	
	 public void selectsubcategory() {
		 SubcategoryMenu.click();
	 }
	 
	 public void ClickNewButton() {
		 New_btn.click();
	 }
	 public void selectcategory() {
		 Select category = new Select(dropdown_category);	
		 category.selectByIndex(5);
	 }
	 public void enterSubCategoryName(String subcategoryname )
		{
		 Subcategory.sendKeys(subcategoryname);
		}
		
	 public void uploadImage()
		{
		 UploadFile.sendKeys("C:\\Users\\USER\\eclipse-workspace\\7RMART-PROJECT\\src\\test\\resources\\flower.jpg");
		}
	 
		// UploadFile.sendKeys("C:\\Users\\USER\\eclipse-workspace\\7RMART-PROJECT\\src\\test\\resources\\flower.jpg");
	   // cancel.click(); 
	 public void clickSaveButton()
		{
		 Save.click();
		}
	 
	 public void clickSearch()
		{
		 Search.click();
		}
	 public void Search_selectcategory() {
		 Select category = new Select(dropdowncategory);
		 category.selectByVisibleText("Toys");
	 }
	 public void enterSearch_SubCategoryName(String subcategoryname )
		{
		 Search_Subcategory.sendKeys(subcategoryname);
		}
	 
	 public void clickSearch_btn()
		{
		 Search_btn.click();
		}
	 public boolean isAlertDisplayed()
		{
			return Alert_subcategory.isDisplayed();
		}
	 
}
	 
		 
