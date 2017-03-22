package TASK;


import java.io.FileWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {
/*
 2.Scrape the following data and store them in a 
 JSON Format from the 
 url : http://insiders.morningstar.com/trading/board-of-directors.action?t=MSFT&region=usa&culture=en-US

a.Director Name
b.Director Age
c.Director Details
 */
	static WebDriver driver;
	 
	 @BeforeClass
	 public static void start(){
		 System.out.println("launching firefox browser");
		 System.setProperty("webdriver.gecko.driver", "F:/git/TestingSelenium/Selenum_Project/src/lib/geckodriver.exe");
	   driver = new FirefoxDriver(); 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 }
	  
	 @Test
	  public void allDetails(){
		 try{
			 JSONObject obj = new JSONObject();
			 JSONArray jsonArray = new JSONArray();
			 driver.get("http://insiders.morningstar.com/trading/board-of-directors.action?t=MSFT&region=usa&culture=en-US");
			 driver.manage().window().maximize();
			 List <WebElement> Directors = driver.findElements(By.xpath("//*[@class='colx1']//h2"));
			 List <WebElement> Details = driver.findElements(By.xpath("//*[@class='colx1']//p"));
			for(int i =0;i<Directors.size();i++){
				WebElement allDirectors =Directors.get(i);
		      	String dircetorName=allDirectors.getText();
		      	String dircetorNames[] = dircetorName.split(",");
		      	WebElement allDirectorsDetails =Details.get(i);
		      	String dircetorDetails=allDirectorsDetails.getText();
		      	jsonArray.add(dircetorNames[0]);
		        jsonArray.add(dircetorNames[1].trim());
		        jsonArray.add(dircetorDetails);
		        obj.put("All Details", jsonArray);
		        
			}
			FileWriter file = new FileWriter("F:\\Director_Details.json");
	        file.write(obj.toJSONString());
            file.flush();
		 }catch(Exception iex){
			 System.out.println(iex.getMessage());
		 }
	}
	 @AfterClass
	 public static void closeBrowser(){
		 driver.quit();
	 }
	}