package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage {

   public WebDriver driver;
   PageUtility pageutility=new PageUtility();	
   
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement adminIcon;
	public void clickAdminIcon() {
		pageutility.clickElement(adminIcon);
	}
	
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")WebElement logoutIcon;
	public void clickLogoutIcon() {
		pageutility.clickElement(logoutIcon);
	}
}
