package TestNGReporting_Seleneum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

   public class MyAllActions {
		
		 WebDriver driver;
		 
	 public void Launch(String url,String driverType) throws InterruptedException{
		 if(driverType.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver",
		            "F:/EclipseWorkspace/Selenum_Project/src/lib/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get(url);
		    driver.manage().window().maximize();
		    this.driver = driver;  
		    Thread.sleep(5000);
		  } else if(driverType.equals("firefox")){
			  WebDriver driver = new FirefoxDriver();
			  driver.get(url);
			  driver.manage().window().maximize();
			  this.driver = driver;  
			  Thread.sleep(5000);
		  }else{
			  System.setProperty("webdriver.chrome.driver",
			            "F:/EclipseWorkspace/Selenum_Project/src/lib//IEDriverServer.exe");
			  WebDriver driver = new InternetExplorerDriver();
			  driver.get(url);
			  driver.manage().window().maximize();
			  this.driver = driver;  
			  Thread.sleep(5000);
		  }
		}
	 public void LaunchBrowser(String DriverType,String url,String ExpectedValue) throws InterruptedException{
			try{
			Launch(url,DriverType);
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, ExpectedValue);
			}catch(Exception e)
	        {
	            System.out.println("Exeption in LaunchBrowser "+e.getMessage());
	        }
		}
		public void Search(String searchValue) throws InterruptedException{
			try{
			CloseBrowser();
			Launch("https://www.google.co.in","chrome");	
			WebElement searchText = driver.findElement(By.cssSelector("#lst-ib"));
			if(searchText != null){
				searchText.sendKeys(searchValue);
			}
			else{
				Assert.assertTrue(searchText != null, "Search Box is not available");
			}
			
			Thread.sleep(5000);
			WebElement searchButton = driver.findElement(By.cssSelector("#sblsbb > button"));
			if(searchButton != null){
				searchButton.click();
			}
			else{
				Assert.assertTrue(searchButton != null, "Search Button is not available");
			}
			
			Thread.sleep(5000);
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, searchValue);
			Thread.sleep(5000);
			CloseBrowser();
			
			}catch(Exception e)
	        {
				System.out.println("Exception in Search "+e.getMessage());
	            
	        }
			
		}
	public void CloseBrowser(){
		    
		if(driver.toString().contains("null"))
	    {

	    System.out.print("All closed ");
	    }
	    else
	    {
	    driver.quit();
	    }
		
	}
}
