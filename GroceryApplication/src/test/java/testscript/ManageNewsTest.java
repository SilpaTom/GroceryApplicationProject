package testscript;
import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ManageNewsPage;
import base.TestNGBase;
import constant.Constants;
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
		Assert.assertTrue(isadduseralertdisplayed,"user is not able to add news");
		 
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
		 Assert.assertEquals(actual, expected," user is not able to navigate to home page");
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Waits for up to 10 seconds
		String actualnewssearched=mangenewspage.isSearchedNewsListedIntable();
		String expectednews="sample news";
		Assert.assertEquals(actualnewssearched,expectednews," user cannot see the searched news");
		
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
		Assert.assertFalse(issearchandmangenewscarddispalyed, "user is not able to reset");
	}

}
