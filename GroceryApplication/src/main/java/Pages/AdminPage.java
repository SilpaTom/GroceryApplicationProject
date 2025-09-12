package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.PageUtility;


public class AdminPage {
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
	
   public AdminPage(WebDriver driver) {
	  this.driver=driver; 
	  PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminmoreinfo;
   public void clickAdminMoreifo() 
   {
	pageutility.clickElement(adminmoreinfo);
   }
   
   @FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
   public void clickNewButton()
   {
	pageutility.clickElement(newbutton);
   }
   
   @FindBy(xpath = "//input[@id='username']") WebElement username_input;
   public void enterUsername(String randomname )
   {
	pageutility.sendDataToElement(username_input, randomname);
   }
   
   @FindBy(xpath = "//input[@id='password']")WebElement password_input;
   public void enterPassword(String randompassword )
   {
	pageutility.sendDataToElement(password_input, randompassword);
   }
   
   @FindBy(xpath = "//select[@name='user_type']")WebElement usertypedropdown;
   public void selectUserTypedropdwon(String userType) 
   {
	pageutility.selectDataWithVisibleText(usertypedropdown, userType); 
	
   }
   
   @FindBy(xpath = "//button[@name='Create']")WebElement savebutton;
   public void clickSaveButtob() 
   {
	pageutility.clickElement(savebutton);
	 
   }
   
 //assertion web element and method
   @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement addUserAlert;
  public boolean isAlertDisplayed()
  {
	 return addUserAlert.isDisplayed();
  }
  
}
