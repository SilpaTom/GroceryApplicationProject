package testscript;
import java.io.IOException;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import base.TestNGBase;
import utilities.ExcelUtility;
public class HomeTest extends TestNGBase {
	
	@Test(description ="verify Logout functionality")
	public void verifyLogout() throws IOException {
		
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
	    loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		HomePage homepage=new HomePage(driver);
		homepage.clickAdminIcon();
		homepage.clickLogoutIcon();
			
	}

}
