package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.AdminPage;
import Pages.LoginPage;
import base.TestNGBase;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNGBase{
	@Test
	public void verifyAddUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enterUserName(usernameValue);
		 loginpage.enterPassword(passwordValue);
		 loginpage.clickOnSignin();
		AdminPage adminpage=new AdminPage(driver);
		adminpage.clickAdminMoreifo();
		FakerUtility fakerUtility = new FakerUtility();
		String randomname=fakerUtility.createRandomUserName();
		String randompassword=fakerUtility.createRandomPassword();
		String userType=ExcelUtility.getStringData(1, 2,"HomePage");
		adminpage.clickNewButton();
		adminpage.enterUsername(randomname);
		adminpage.enterPassword(randompassword);
		adminpage.selectUserTypedropdwon(userType);
		adminpage.clickSaveButtob();
		
	}

}
