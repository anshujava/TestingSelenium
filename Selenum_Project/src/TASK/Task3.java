package TASK;

import java.io.FileWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3 {
/*
 3. A generic Scraper to Collect the below listed data points from this website : https://www.infogreffe.com

a.REGISTERED OFFICE
b.TRADING NAME
c.REGISTRATION

Example Entity Names :
a)CAISSE REGIONALE DE CREDIT AGRICOLE MUTUEL DU FINISTERE
b)IMERYS
 */
	static WebDriver driver;
	 
	 @BeforeClass
	 public static void start(){
		 System.out.println("launching firefox browser");
		 System.setProperty("webdriver.gecko.driver", "F:/git/TestingSelenium/Selenum_Project/src/lib/geckodriver.exe");
	   driver = new FirefoxDriver(); 
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	 }
	  
	 @Test
	  public void allData(){
		 try{
			 String str1="IMERYS";
			 String st1[]=str1.split(" ");
			 String str2="CAISSE REGIONALE DE CREDIT AGRICOLE MUTUEL DU FINISTERE";
			 String st2[]=str2.split(" ");
			 String REGISTERED_OFFICE ="";
			 String TRADING_NAME ="";
			 String REGISTRATION ="";
			 driver.get("https://www.infogreffe.com");
			 driver.manage().window().maximize();
			 driver.findElement(By.xpath(".//*[@id='phrase']")).sendKeys(str1);
			 driver.findElement(By.xpath(".//*[@id='formRecherche']/input")).click();
			 Thread.sleep(25000);
			 List<WebElement> linkList=driver.findElements(By.tagName("a"));
			//now traverse over the list and check
			for(int i=0 ; i<linkList.size() ; i++)
			{   
			    if(linkList.get(i).getText().startsWith(st1[0]))
			    {    Thread.sleep(2000);
			        linkList.get(i).click();
			        break;
			    }
			}
			 Thread.sleep(20000);
			 JavascriptExecutor jse = (JavascriptExecutor) driver;
			 jse.executeScript("window.scrollBy(0,250)", "");
			 WebElement regOff = driver.findElement(By.xpath(".//*[@id='showHideContent']/div[1]/div[2]/table/tbody/tr/td[1]/div[1]"));
			if(regOff!=null){
				REGISTERED_OFFICE=regOff.getText().replaceAll("View the plan", "");
			}else{
				REGISTERED_OFFICE = "REGISTERED_OFFICE not found";
			}
					
			 WebElement trade_name = driver.findElement(By.xpath(".//*[@id='showHideContent']/div[1]/div[2]/table/tbody/tr/td[1]/div[4]"));
			 if(trade_name!=null){
				 TRADING_NAME=trade_name.getText();
			 }else{
				 TRADING_NAME="TRADING_NAME not found";
			 }
			 WebElement reg = driver.findElement(By.xpath(".//*[@id='showHideContent']/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/div[1]/p"));
			 if(reg!=null){
				 REGISTRATION=reg.getText();
			 }else{
				 REGISTRATION="REGISTRATION not found";
			 }		
				
				
				
			System.out.println("REGISTERED_OFFICE="+REGISTERED_OFFICE); 
			System.out.println("TRADING_NAME="+TRADING_NAME); 
			System.out.println("REGISTRATION="+REGISTRATION); 
		 }catch(Exception iex){
			 System.out.println(iex.getMessage());
		 }
	}
	 @AfterClass
	 public static void closeBrowser(){
//		 driver.quit();
	 }
	}