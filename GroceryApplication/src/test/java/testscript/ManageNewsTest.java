package testscript;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.TestNGBase;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNGBase{
	
	@Test
	
	public void verifyAddNews() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginBtn.click();
		WebElement managenewstile=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
		managenewstile.click();
		WebElement newbtn=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		newbtn.click();
		WebElement editnewsinput=driver.findElement(By.xpath("//textarea[@id='news']"));
		editnewsinput.sendKeys("sample news");
		WebElement editnewssavebtn=driver.findElement(By.xpath("//button[@name='create']"));
		editnewssavebtn.click();
		WebElement alertclosebutton=driver.findElement(By.xpath("//button[@class='close']"));
		alertclosebutton.click();
	}
	
	@Test
	public void verifyHome() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginBtn.click();
		WebElement managenewstitle=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
		managenewstitle.click();
		WebElement homebtn=driver.findElement(By.xpath("//a[text()='Home']"));
		homebtn.click();
	}
	@Test
	public void verifySearchAndSearch() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginBtn.click();
		WebElement managenewstitle=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
		managenewstitle.click();
		WebElement searchbtn=driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
		searchbtn.click();
		WebElement newstitlteinputbox=driver.findElement(By.xpath("//input[@placeholder='Title']"));
		newstitlteinputbox.sendKeys("Sample news");
		WebElement searchbtn2=driver.findElement(By.xpath("//button[text()='Search']"));
		searchbtn2.click();
	}
	
	@Test
	
	public void verifySearchAndReset() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginBtn.click();
		WebElement managenewstitle=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
		managenewstitle.click();
		WebElement searchbtn=driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
		searchbtn.click();
		WebElement newstitlteinputbox=driver.findElement(By.xpath("//input[@placeholder='Title']"));
		newstitlteinputbox.sendKeys("Sample news");
		WebElement resetbtn=driver.findElement(By.xpath("//a[text()='Reset']"));
		resetbtn.click();
	}

}
