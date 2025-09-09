package Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public WebDriver driver;	
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);//this is to refer the current class method. 
	//PageFactory is class
	}
	
	@FindBy(xpath = "//input[@name='username']")WebElement username;
	public void enterUserName(String usernameValue) {
	//WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys(usernameValue);
	}
	
	@FindBy(xpath = "//input[@name='password']")WebElement password;
	public void enterPassword(String passwordValue) {
	//WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(passwordValue);
	}
    
	@FindBy(xpath = "//button[text()='Sign In']")WebElement loginBtn;
	public void clickOnSignin() {
	//WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
	loginBtn.click();
	}
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")WebElement loginAlert;
	public boolean isLoginAlertDisplayed() {
		
		return loginAlert.isDisplayed();
	}
	
}
