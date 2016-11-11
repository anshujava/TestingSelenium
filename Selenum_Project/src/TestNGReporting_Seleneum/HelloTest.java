package TestNGReporting_Seleneum;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.AssertionFailedError;

public class HelloTest {
	static WebDriver driver;
	/**
	 * @param args
	 * @throws IOException 
	 */

	public void google() throws IOException{
		try{
		System.setProperty("webdriver.chrome.driver",
	            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
	     
	
    	driver= new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch google
		driver.get("http://www.google.co.in");
		
		
		Assert.assertEquals(driver.getTitle(),"G00gle");
		}
		
		catch(Exception  t){
			System.out.println("Exception is ::"+t.getMessage());
			
			}
		
		}

	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		
		  System.out.println("statu-->"+testResult.getStatus());
			Date date = new Date();
	        // Specify the desired date format
	        String DATE_FORMAT = "dd-MMM-yyyy_HH_mm_ss";
	        // Create object of SimpleDateFormat and pass the desired date format.
	        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	        String dt = sdf.format(date);
	        if(testResult.getStatus() == ITestResult.FAILURE){
			String filePath ="F:\\git\\TestingSelenium\\Selenum_Project\\test-output\\failure_"+dt+".jpg";
			System.out.println(filePath);
		    Reporter.log("object not found"+"<br>");        
		    //Take screen shot and give path in the report
		    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshot, new File(filePath));  
		    Reporter.log("<a href=\"" +"file:///"+ filePath+ "\">Screenshot</a>"); // give path in the report
	        }
			driver.quit();
	       
	}
	
}
