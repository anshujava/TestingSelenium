package TestNGReporting_Seleneum;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class MyAutomationScript {
	WebDriver driver;
	 String filename ="";	
	@BeforeTest
	
	 public void Launch() throws InterruptedException{
		
			System.setProperty("webdriver.chrome.driver",
		            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
		    driver = new ChromeDriver();
		   
		    driver.manage().window().maximize();
		 
		    Thread.sleep(5000);
		 
		}
	@Test(priority=0)
  public void VerifyGoogle() throws Exception {
	  FileInputStream fis = new FileInputStream("F:\\git\\TestingSelenium\\Selenum_Project\\src\\TestNGReporting_Seleneum\\LoginVerifyGoogle_Data.xls");
      RunTest.runTest(fis,driver);
	 
  }
  @AfterMethod
	
	public void takeScreenShotOnFailure(ITestResult result) throws Exception {
	   
		String methodName = result.getName();
		System.out.println(methodName);
		System.out.println("result.isSuccess()=="+result.isSuccess());
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		if (!result.isSuccess()) {
			Date date = new Date();
	        // Specify the desired date format
	        String DATE_FORMAT = "dd-MMM-yyyy_HH_mm_ss";
	        // Create object of SimpleDateFormat and pass the desired date format.
	        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	        String dt = sdf.format(date);
			String filePath =".\\test-output\\";
			filename="failure_"+dt+".jpg";
			System.out.println("path is =="+filePath+filename);
		    Reporter.log(methodName +" Failed "+"<br>");        
		    //Take screen shot and give path in the report
		    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshot, new File(filePath+filename));  
		    Reporter.log("<td><a href="+filename+">Screenshot</a></td>"); // give path in the report
		    Reporter.setCurrentTestResult(null); 
		   
		   
		}else{
			filename = null;
		}
			driver.quit();
	
	       
	}
 
 
}
