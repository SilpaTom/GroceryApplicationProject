package testscript;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import constant.Constants;
import constant.Messages;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNGBase{
	
	@Test(description = "verify Add News")
	
	public void verifyAddNews() throws IOException {
		 String usernameValue=ExcelUtility.getStringData(1, 0,  Constants.LOGINSHEET);
		 String passwordValue=ExcelUtility.getStringData(1, 1,  Constants.LOGINSHEET);		
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enterUserName(usernameValue);
		 loginpage.enterPassword(passwordValue);
		 loginpage.clickOnSignin();
		 ManageNewsPage mangenewspage=new ManageNewsPage(driver);
		 mangenewspage.clickManageNewsTile();
		 mangenewspage.clickNewButton();
		 mangenewspage.enterEditNewsInput();
		 mangenewspage.enterEditNewsSavebtn();
		boolean isadduseralertdisplayed = mangenewspage.isaddNewsAlertDisplayed();
		Assert.assertTrue(isadduseralertdisplayed,Messages.ADDUSERALERTDISPLAYEDERROR);
		 
	}
	
	@Test(description = "verify Home Button")
	public void verifyHome() throws IOException {
		 String usernameValue=ExcelUtility.getStringData(1, 0,  Constants.LOGINSHEET);
		 String passwordValue=ExcelUtility.getStringData(1, 1,  Constants.LOGINSHEET);		
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enterUserName(usernameValue);
		 loginpage.enterPassword(passwordValue);
		 loginpage.clickOnSignin();
		 ManageNewsPage mangenewspage=new ManageNewsPage(driver);
		 mangenewspage.clickManageNewsTile();
		 mangenewspage.clickhomebtn();	
		 String actual=driver.getCurrentUrl();
		 String expected="https://groceryapp.uniqassosiates.com/admin/home";
		 Assert.assertEquals(actual, expected,Messages.NAVIGATETOHOMEPAGEERROR);
	}
	
	@Test(description = "Verify Search button in Search()")
	public void verifySearchAndSearch() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0,  Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1,  Constants.LOGINSHEET);	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		ManageNewsPage mangenewspage=new ManageNewsPage(driver);
		mangenewspage.clickManageNewsTile();
		mangenewspage.clickSearchButton();
		mangenewspage.enterNewsTitlteInputBox();
		mangenewspage.clickSearchbtnInSeach();
		String actualnewssearched=mangenewspage.isSearchedNewsListedIntable();
		String expectednews="sample news";
		Assert.assertEquals(actualnewssearched,expectednews,Messages.SEARCHEDNEWSNOTFOUNDERROR);
		
		}
	
	@Test(description= "Verify Reset button in Search")
	
	public void verifySearchAndReset() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1,  Constants.LOGINSHEET);		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		ManageNewsPage mangenewspage=new ManageNewsPage(driver);
		mangenewspage.clickManageNewsTile();
		mangenewspage.clickSearchButton();
		mangenewspage.enterNewsTitlteInputBox();
		mangenewspage.clickResetInSearch();
		boolean issearchandmangenewscarddispalyed=mangenewspage.isSearchAndMangeNewsCarddisplayed();
		Assert.assertFalse(issearchandmangenewscarddispalyed,Messages.RESETERROR);
	}

}
