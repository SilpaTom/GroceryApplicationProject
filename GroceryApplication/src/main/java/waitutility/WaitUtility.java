package waitutility;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static int EXPLICITWAIT=5;
	
	public void waitUntilClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	
	public void waitUntilElementSelected(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.elementToBeSelected(element));// need to select elementToBeSelected(web element)
	}
	
    public void waitUntilElementSelectionStateToBe(WebDriver driver,WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	wait.until(ExpectedConditions.elementSelectionStateToBe(element, false));
	
    }
  
    public void waitUntilElemntIsVisible(WebDriver driver,WebElement element)
    {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
    
    public void waitUntilInvisibilityOfElement(WebDriver driver,WebElement element)
    {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.invisibilityOf(element));
		
	}
    
    public void waitUntilStalenessOfElemnt(WebDriver driver,WebElement element)
    {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
		wait.until(ExpectedConditions.stalenessOf(element));//It waits until a WebElement is no longer attached to the DOM.
		
	}
	
}

