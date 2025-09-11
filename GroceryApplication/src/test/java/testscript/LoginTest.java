package testscript;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;
import base.TestNGBase;
import constant.Constants;
import constant.Messages;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase {
	
	// retry is applied here as this is a flaky test case

	@Test(priority = 1, description = "login with valid credentials",retryAnalyzer = retry.Retry.class)
	public void verifyLoginWithValidCredentials() throws IOException {
		String usernameValue = ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue = ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		String expected = "https://groceryapp.uniqassosiates.com/admin";
		Assert.assertEquals(actual, expected, Messages.VALIDCREDENTIALERROR);

	}

	@Test(priority = 2, description = "Login With Valid Username Invalid Password")
	public void verifyLoginWithValidUsernameInvalidpassword() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(2, 0, Constants.LOGINSHEET);
		String passwordValue = ExcelUtility.getStringData(2, 1, Constants.LOGINSHEET);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		boolean isloginalertdisplayed = loginpage.isLoginAlertDisplayed();
		Assert.assertTrue(isloginalertdisplayed,Messages.INVALIDUSERNAMEVALIDPASSWORDERROR);
 
	}

	@Test(priority = 3, description = "Login With Invalid Username Valid Password")

	public void verifyLoginWithInvalidUsernameValidpassword() throws IOException {
		String usernameValue = ExcelUtility.getStringData(3, 0, Constants.LOGINSHEET);
		String passwordValue = ExcelUtility.getStringData(3, 1, Constants.LOGINSHEET);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		boolean isloginalertdisplayed = loginpage.isLoginAlertDisplayed();
		Assert.assertTrue(isloginalertdisplayed,"Login With Invalid Username Valid Password functionality failed");

	}

	@Test(priority = 4, description = "Login With Invalid Username Invalid Password")
	public void verifyLoginWithInvalidUsernameInvalidpassword() throws IOException {
		String usernameValue = ExcelUtility.getStringData(4, 0, Constants.LOGINSHEET);
		String passwordValue = ExcelUtility.getStringData(4, 1, Constants.LOGINSHEET);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		boolean isloginalertdisplayed = loginpage.isLoginAlertDisplayed();
		Assert.assertTrue(isloginalertdisplayed,"Login With Invalid Username Invalid Password functionality failed");

	}
}
