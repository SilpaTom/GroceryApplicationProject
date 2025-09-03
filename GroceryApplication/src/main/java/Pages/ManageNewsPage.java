package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageNewsPage {
	
		public WebDriver driver;
		
	   public ManageNewsPage(WebDriver driver)
	   {
		  this.driver=driver; 
	   }
	   
	   public void clickManageNewsTile() {
		   WebElement managenewstile=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
			managenewstile.click();
	   }
	  public void clickNewButton() {
		  WebElement newbtn=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
			newbtn.click();
	  }
	  
	  public void enterEditNewsInput() {
	  WebElement editnewsinput=driver.findElement(By.xpath("//textarea[@id='news']"));
	  editnewsinput.sendKeys("sample news");
	  }
	  
	  public void enterEditNewsSavebtn() {
		WebElement editnewssavebtn=driver.findElement(By.xpath("//button[@name='create']"));
		editnewssavebtn.click();
	  } 
	  
	  public void clickhomebtn() {
	  WebElement homebtn=driver.findElement(By.xpath("//a[text()='Home']"));
	  homebtn.click();
	  }
	  
	  public void clickSearchButton() {
		  WebElement searchbtn=driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
		searchbtn.click();
	  }
	  public void enterNewsTitlteInputBox() {
		WebElement newstitlteinputbox=driver.findElement(By.xpath("//input[@placeholder='Title']"));
		newstitlteinputbox.sendKeys("Sample news");
	  }
	  
	  public void clickSearchbtnInSeach() {
		  WebElement searchbtnInSearch=driver.findElement(By.xpath("//button[text()='Search']"));
		  searchbtnInSearch.click();
	  }
	  
	  public void clickResetInSearch() {
		WebElement resetbtn=driver.findElement(By.xpath("//a[text()='Reset']"));
		resetbtn.click();
	  }
}
