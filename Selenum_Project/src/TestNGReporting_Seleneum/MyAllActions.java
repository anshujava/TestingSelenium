package TestNGReporting_Seleneum;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

   public class MyAllActions {
	
	
	
	 public void LaunchBrowser(String url,String ExpectedValue,WebDriver driver) throws InterruptedException, IOException{
			try{
			Thread.sleep(5000);
			driver.get(url);
			Thread.sleep(5000);
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, ExpectedValue);
			}catch(Exception e)
	        {
				
	            System.out.println("Exeption in LaunchBrowser "+e.getMessage());
	        }
		}
	
		public void Search(String searchValue,WebDriver driver) throws InterruptedException, IOException{
			
			try{
//			CloseBrowser(driver);
			Thread.sleep(5000);
			driver.get("https://www.google.co.in");	
			Thread.sleep(5000);
			WebElement searchText = driver.findElement(By.cssSelector("#lst-ib"));
			if(searchText != null){
				searchText.sendKeys(searchValue);
			}
			else{
				Assert.assertTrue(searchText != null,"Search Box is not available");
			}
			
			Thread.sleep(5000);
			WebElement searchButton = driver.findElement(By.cssSelector("#sblsbb > button"));
			if(searchButton != null){
				searchButton.click();
			}
			else{
				Assert.assertTrue(searchButton != null,"Search Button is not available");
			}
			
			Thread.sleep(5000);
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, searchValue);
			Thread.sleep(5000);
//			CloseBrowser(driver);
			
			}catch(Exception e)
	        {
				
				System.out.println("Exception in Search "+e.getMessage());
				
				
	        }
			
		}
	public void CloseBrowser(WebDriver driver){
		    
		if(driver.toString().contains("null"))
	    {

	    System.out.print("All closed ");
	    }
	    else
	    {
	    driver.close();
	    }
		
	}
	 
}
