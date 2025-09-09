package utilities;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	public void getScreenshot(WebDriver driver,String failedTestCase) throws IOException
	{
		// typecasted to driver
	TakesScreenshot scrShot = (TakesScreenshot) driver; //TakesScreenshot- interface provided by selenium
	File screenShot = scrShot.getScreenshotAs(OutputType.FILE); //saving the screenshot as file(cntl+s)

	String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());// format-inbuilt method of java
	File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");//create file in  directory//creating a folder
	if (!f1.exists()) {
	f1.mkdirs();// if the folder is not existing creating the folder
	}
	String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
	+ ".png";
	File finalDestination = new File(destination);
	FileHandler.copy(screenShot, finalDestination);//saving the file
	}


}
