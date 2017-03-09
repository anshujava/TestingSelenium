package SelenieumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTAB {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
//		  WebDriver driver = new FirefoxDriver();  
		
		 WebDriver driver = new FirefoxDriver();
	        //Maximize browser window   
	        driver.manage().window().maximize();  
	        //Go to URL  
	        driver.get("http://www.google.com");  
	        //Set  timeout  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  
	        // Open new tab  
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");  
	        //Go to URL  
	        driver.get("http://www.gmail.com");  
	        //Set new tab timeout  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	        // Do some operation          
	      
	  
	        // Switch first tab  
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");  
	        driver.switchTo().defaultContent();  
	        Thread.sleep(2000);  
	        driver.quit();

	}

}
