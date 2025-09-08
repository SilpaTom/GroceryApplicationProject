package testscript;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import base.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	
	@Test(priority = 1,description = "login with valid credentials")
	public void verifyLoginWithValidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
	    LoginPage loginpage=new LoginPage(driver);
	    loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		String actual=driver.getCurrentUrl();
		String expected="https://groceryapp.uniqassosiates.com/admin/login";
		Assert.assertEquals(actual, expected,"Login is not sucessfull");
	}
	
	@Test(priority =2 , description = "Login With Valid Username Invalid Password")
		public void verifyLoginWithValidUsernameInvalidpassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
	    loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
	}
	
	@Test(priority = 3 , description = "Login With Invalid Username Valid Password")
	
	public void verifyLoginWithInvalidUsernameValidpassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
	    loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
	}
	@Test(priority = 4,description = "Login With Invalid Username Invalid Password")
	public void verifyLoginWithInvalidUsernameInvalidpassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(4, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(4, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
	    loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
	}
}
