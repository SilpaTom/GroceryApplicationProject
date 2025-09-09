package testscript;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import base.TestNGBase;
import constant.Constants;
import utilities.ExcelUtility;
public class HomeTest extends TestNGBase {
	
	@Test(description ="verify Logout functionality")
	public void verifyLogout() throws IOException {
		
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1,  Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
	    loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		HomePage homepage=new HomePage(driver);
		homepage.clickAdminIcon();
		homepage.clickLogoutIcon();
		String actual=driver.getCurrentUrl();
		String expected="https://groceryapp.uniqassosiates.com/admin/login";
		Assert.assertEquals(actual,expected, "logout is not successful");
			
	}

}
