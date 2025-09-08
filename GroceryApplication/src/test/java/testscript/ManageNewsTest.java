package testscript;
import java.io.IOException;
import org.testng.annotations.Test;
import Pages.LoginPage;
import Pages.ManageNewsPage;
import base.TestNGBase;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNGBase{
	
	@Test(description = "verify Add News")
	
	public void verifyAddNews() throws IOException {
		 String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		 String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");		
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enterUserName(usernameValue);
		 loginpage.enterPassword(passwordValue);
		 loginpage.clickOnSignin();
		 ManageNewsPage mangenewspage=new ManageNewsPage(driver);
		 mangenewspage.clickManageNewsTile();
		 mangenewspage.clickNewButton();
		 mangenewspage.enterEditNewsInput();
		 mangenewspage.enterEditNewsSavebtn();
		 
	}
	
	@Test(description = "verify Home Button")
	public void verifyHome() throws IOException {
		 String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		 String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");		
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enterUserName(usernameValue);
		 loginpage.enterPassword(passwordValue);
		 loginpage.clickOnSignin();
		 ManageNewsPage mangenewspage=new ManageNewsPage(driver);
		 mangenewspage.clickManageNewsTile();
		 mangenewspage.clickhomebtn();	
	}
	@Test(description = "Verify Search button in Search()")
	public void verifySearchAndSearch() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		ManageNewsPage mangenewspage=new ManageNewsPage(driver);
		mangenewspage.clickManageNewsTile();
		mangenewspage.clickSearchButton();
		mangenewspage.enterNewsTitlteInputBox();
		mangenewspage.clickSearchbtnInSeach();
		}
	
	@Test(description= "Verify Reset button in Search")
	
	public void verifySearchAndReset() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignin();
		ManageNewsPage mangenewspage=new ManageNewsPage(driver);
		mangenewspage.clickManageNewsTile();
		mangenewspage.clickSearchButton();
		mangenewspage.enterNewsTitlteInputBox();
		mangenewspage.clickResetInSearch();
	}

}
