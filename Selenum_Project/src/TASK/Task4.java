package TASK;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 4.A generic Scraper to Collect the below listed data points from this website : https://www.nyse.com
a.Actual name in listing Inside "Quote" section.
b.Last Trade Time

a)Example Entity Name : Wells Fargo & Company
In the search result page, exact name match after the ticker
Example in this case : "WFC: Wells Fargo & Company" --> 'Wells Fargo & Company' should be matched and clicked to extract above points
b)Example Entity Name : Citigroup INC
In the search result page, exact name match after the ticker
Example in this case : "C: Citigroup INC" --> 'Citigroup INC' should be matched and clicked to extract above points
 */
public class Task4 {

	static WebDriver driver;
	 
	 @BeforeClass
	 public static void start() throws InterruptedException{
		 System.out.println("launching firefox browser");
		 System.setProperty("webdriver.gecko.driver", "F:/git/TestingSelenium/Selenum_Project/src/lib/geckodriver.exe");
	   driver = new FirefoxDriver(); 
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	  
	 @Test
	  public void allData(){
		 try{
			 String str1="Wells Fargo & Company";
			 String str2="Citigroup, Inc.";
				 
			 driver.get("https://www.nyse.com");
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath("//*[@class='site-search-icon']")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys(str2);
			 Thread.sleep(5000);
			 WebElement options = driver.findElement(By.xpath("//*[@class='dropdown-menu']"));
			 List<WebElement> optionsToSelect = options.findElements(By.tagName("li"));
				for(WebElement option : optionsToSelect){
			        String s =option.getText();
			        s=s.substring(s.lastIndexOf(":")+1).trim();
			        System.out.println(s);
			        if(s.equals(str2)) {
			        	System.out.println("Trying to select: ");
			            option.click();
			            break;
			        }
			        
			    }
		 }catch(Exception iex){
			 System.out.println(iex.getMessage());
		 }
	}
	 @AfterClass
	 public static void closeBrowser(){
		 driver.quit();
	 }
	}