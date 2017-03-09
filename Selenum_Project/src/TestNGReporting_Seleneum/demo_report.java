package TestNGReporting_Seleneum;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;	

public class demo_report {
	WebDriver driver;
	@Test
	public void testGoogle() throws IOException{
		try{
		System.setProperty("webdriver.chrome.driver",
	            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
	     
	
	   driver= new ChromeDriver();
		
		driver.get("http://www.google.co.in");
		AssertJUnit.assertEquals(driver.getTitle(),"Goohgle");
		
		
		}catch(Exception t){
			System.out.println("Exception is="+t.getMessage());
			
			
		}
	
	}	
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult result) throws Exception {
		
		String methodName = result.getName();
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		if (!result.isSuccess()) {
			Date date = new Date();
	        // Specify the desired date format
	        String DATE_FORMAT = "dd-MMM-yyyy_HH_mm_ss";
	        // Create object of SimpleDateFormat and pass the desired date format.
	        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	        String dt = sdf.format(date);
			String filePath ="F:\\git\\TestingSelenium\\Selenum_Project\\test-output\\failure_"+dt+".jpg";
			System.out.println("path is =="+filePath);
		    Reporter.log(methodName +" Failed "+"<br>");        
		    //Take screen shot and give path in the report
		    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshot, new File(filePath));  
		    Reporter.log("<td><a href=\"" +"file:///"+ filePath+ "\">Screenshot</a></td>"); // give path in the report
		    Reporter.setCurrentTestResult(null); 
		}
			driver.quit();
	       
	}
	
}
