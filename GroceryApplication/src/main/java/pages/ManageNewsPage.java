package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {
	
		public WebDriver driver;
		PageUtility pageutility=new PageUtility();
		
	   public ManageNewsPage(WebDriver driver)
	   {
		  this.driver=driver; 
		  PageFactory.initElements(driver, this);	
	   }
	   
	   @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']")WebElement managenewstile;
	   public void clickManageNewsTile() {
			pageutility.clickElement(managenewstile);
	   }
	   
	  @FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbtn;
	  public void clickNewButton()
	  {
		 pageutility.clickElement(newbtn);
	  }
	  @FindBy(xpath = "//textarea[@placeholder='Enter the news']")WebElement editnewsinput;
	  public void enterEditNewsInput()
	  {	
		
		 pageutility.sendDataToElement(editnewsinput,"sample news");
	  }
	  
	  @FindBy(xpath = "//button[@name='create']")WebElement editnewssavebtn;
	  public void enterEditNewsSavebtn()
	  {
		pageutility.clickElement(editnewssavebtn);
	  } 
	  
	  @FindBy(xpath = "//a[text()='Home']")WebElement homebtn;
	  public void clickhomebtn()
	  {
		  pageutility.clickElement(homebtn);
	  }
	  
	  @FindBy(xpath = "//a[@href='javascript:void(0)']")WebElement searchbtn;
	  public void clickSearchButton() 
	  {
		  pageutility.clickElement(searchbtn);
	  }
	  
	  @FindBy(xpath = "//input[@placeholder='Title']")WebElement newstitlteinputbox;
	  public void enterNewsTitlteInputBox()
	  {
		pageutility.sendDataToElement(newstitlteinputbox,"Sample news");
	  }
	  
	  @FindBy(xpath = "//button[text()='Search']")WebElement searchbtnInSearch;
	  public void clickSearchbtnInSeach() 
	  {
				 
		  pageutility.clickElement(searchbtnInSearch);
	  }
	  
	  @FindBy(xpath = "//a[text()='Reset']")WebElement resetbtn;
	  public void clickResetInSearch() {
		
		pageutility.clickElement(resetbtn);
	  }
	  //assertion web elements and methods
	  
	  @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement addNewsAlert;
	  
	  public boolean isaddNewsAlertDisplayed() 
	     {
			return addNewsAlert.isDisplayed();
		  }
	  
	  @FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]") WebElement fistcelloftable;
	  public String isSearchedNewsListedIntable() {
	  return fistcelloftable.getText();
		  }
   
	  @FindBy(xpath = "//form[@role='form' ]") WebElement searchandmangenewscard;
	  	public boolean isSearchAndMangeNewsCarddisplayed() {
		return searchandmangenewscard.isDisplayed();
		  }
	  

	}

