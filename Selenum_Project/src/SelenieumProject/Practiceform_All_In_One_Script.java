package SelenieumProject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

public class Practiceform_All_In_One_Script {
	static WebDriver driver ; 
	
	@BeforeClass
	
	public static void setUpChrome() {
		System.setProperty("webdriver.chrome.driver",
	            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
		System.out.println("Chrome Configured");
		
	}
	
	@Before
	
	public void LaunchChrome() throws Exception {
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/"); 
//		driver.get("http://localhost:8080/Demo_Project/Selenium_Framework_Practiceform.html"); 
		System.out.println("Chrome Launched");
	}
	
	
	@Test
	public void VerifyAllFieldSet()  {
		try {
			//Verify Link
			Thread.sleep(10000);
			List<WebElement> linksList=driver.findElements(By.tagName("a"));
			 for(int i=0 ; i<linksList.size() ; i++)
		        {
		      	  WebElement allLinks =linksList.get(i);
		      	  String hyperlink=allLinks.getText();
		      	  
		      	  if(hyperlink.contains("This is a link")){
		      		  allLinks.click();
		      		  
		      	  }
		        }
			 Thread.sleep(10000);
			 String title = driver.getTitle();
			 Assert.assertEquals("Selenium Framework | Practiceform", title);
			 String originalHandle = driver.getWindowHandle();
			 for(String handle : driver.getWindowHandles()) {
			        if (!handle.equals(originalHandle)) {
			            driver.switchTo().window(handle);
			            driver.close();
			        }
			    }

			driver.switchTo().window(originalHandle);
			
			Thread.sleep(10000);
			//verify textArea
			driver.findElement(By.id("vfb-10")).clear();
			driver.findElement(By.id("vfb-10")).sendKeys("Entering in TextArea");
			Thread.sleep(10000);
			//verify textbox
			driver.findElement(By.id("vfb-9")).clear();
			driver.findElement(By.id("vfb-9")).sendKeys("Entering in TextBox");
			
			ScrollUPDown("Down");
			Thread.sleep(10000);
			//verify checkbox
			List<WebElement> checkNames=driver.findElements(By.xpath("//input[@type='checkbox']"));
			for (int i = 0; i < checkNames.size(); i++)
			{
				Thread.sleep(5000);
				checkNames.get(i).click();
			} 
			//verify radio button
			List<WebElement> radioNames=driver.findElements(By.xpath("//input[@type='radio']"));
			for (int i = 0; i < radioNames.size(); i++)
			{
				Thread.sleep(5000);
				radioNames.get(i).click();
			} 
			//verify Date Field
			driver.findElement(By.id("vfb-8")).sendKeys("04/15/2016"); //date format-> mm/dd/yyyy
			Thread.sleep(5000);
			driver.findElement(By.id("vfb-8")).sendKeys(Keys.ESCAPE);  
			Thread.sleep(5000);
			//type url
			driver.findElement(By.id("vfb-11")).clear();
			driver.findElement(By.id("vfb-11")).sendKeys(driver.getCurrentUrl());
			ScrollUPDown("Down");
			Thread.sleep(5000);
			
			//verify dropdown box
			List<String> lsOpt = new ArrayList<String> ();
			lsOpt.add("Option 1");
			lsOpt.add("Option 2");
			lsOpt.add("Option 3");
			WebElement mySelectElement = driver.findElement(By.id("vfb-12"));
			Select dropdown= new Select(mySelectElement);
			List<WebElement> allOptions = dropdown.getOptions();
			int flag=0;
			for(int i =0;i<allOptions.size();i++){
				for(int j =0;j<lsOpt.size();j++){
					
					if(allOptions.get(i).getText().equals(lsOpt.get(j).toString())){
						flag=1;
						System.out.println(allOptions.get(i).getText()+" - drop down options matched ");
					}
					
				}
				if(flag==0){
					System.out.println(allOptions.get(i).getText()+" ,oops... drop down options not matched ");
				}
				flag=0;
			}
			
			dropdown.selectByValue("Option 3");
			Thread.sleep(5000);
			ScrollUPDown("Down");
			//verification number
			String textVal=driver.findElement(By.cssSelector("#item-vfb-2 > ul > li.vfb-item.vfb-item-secret > span > label")).getText();
			textVal = textVal.substring(textVal.length()-2);
			driver.findElement(By.id("vfb-3")).sendKeys(textVal);  
			Thread.sleep(5000);
			driver.findElement(By.id("vfb-4")).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	@Test
	public void VerifyFormFields()  {
		try {
			Thread.sleep(10000);
//			//Verify New Browser Window
			driver.findElement(By.id("button1")).click();
			Thread.sleep(10000);
			 String originalHandle = driver.getWindowHandle();
			 for(String handle : driver.getWindowHandles()) {
			        if (!handle.equals(originalHandle)) {
			            driver.switchTo().window(handle);
			            driver.manage().window().maximize();
			            
			            WebElement home = driver.findElement(By.xpath("//*[@id='main-nav']/li[1]/a/span"));
			            if(home.isDisplayed()){
			            	home.click();
			            	Thread.sleep(10000);
			            }
			            
			            driver.close();
			        }
			    }

			driver.switchTo().window(originalHandle);
			//Verify New pop up Window
			
			driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[1]/div/p[3]/button")).click();
			Thread.sleep(10000);
			 String mainHandle = driver.getWindowHandle();
			 for(String handles : driver.getWindowHandles()) {
			        if (!handles.equals(mainHandle)) {
			            driver.switchTo().window(handles);
			            driver.close();
			        }
			    }
			 driver.switchTo().window(mainHandle);
			
			//Verify new Tab in Browser
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[1]/div/p[4]/button")).click();
			Thread.sleep(10000);
			 String NewHandle = driver.getWindowHandle();
			 for(String allhandle : driver.getWindowHandles()) {
			        if (!allhandle.equals(NewHandle)) {
			            driver.switchTo().window(allhandle);
			            driver.manage().window().maximize();
			            
			            WebElement home = driver.findElement(By.xpath("//*[@id='main-nav']/li[1]/a/span"));
			            if(home.isDisplayed()){
			            	home.click();
			            	Thread.sleep(10000);
			            }
			            
			            driver.close();
			        }
			    }

			driver.switchTo().window(NewHandle);
			
		//Verify Broken Link	
			
			List<WebElement> allLinkList=driver.findElements(By.tagName("a"));
			 for(int i=0 ; i<allLinkList.size() ; i++)
		        {
		      	  WebElement allBrokenLinks =allLinkList.get(i);
		      	  String hyperlink=allBrokenLinks.getText();
		      	  if(hyperlink.equals("Find me I have nothing in me!!")){
		      		String url = allBrokenLinks.getAttribute("href");
			      	  if(url==null){
			      	  System.out.println("broken link");
			      	  } 
		      	  }
		      	  
		        }	
			//verify random value
			 WebElement home = driver.findElement(By.xpath("//p[contains(text(), 'I will have random ID')]"));
			 String pId=home.getAttribute("id").toString();
			 System.out.println("id="+pId);
			//verify java script alert
			driver.findElement(By.xpath("//*[@id='alert']")).click();
			Thread.sleep(5000);
			Alert alt = driver.switchTo().alert();
			alt.accept();
			ScrollUPDown("Down");
			//verify java script Timming alert
			driver.findElement(By.xpath("//*[@id='timingAlert']")).click();
			Thread.sleep(5000);
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
			Thread.sleep(30000);
			WebElement val = driver.findElement(By.xpath("//*[@class='timer']"));
			if(val.getText().equals("Buzz Buzz")){
				System.out.println("'Buzz Buzz' Found");
			}else{
				System.out.println("'Buzz Buzz' not available");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	@After
	public void closeBrowser() throws Exception {
		Thread.sleep(10000);
		System.out.println("close browser After");
		driver.close();
	}

	@AfterClass
	public static void QuitDriver() {
		System.out.println("Quit DRiver AfterClass");
		driver.quit();
		
	}

	@Ignore
	public void executionIgnored() {
		System.out.println("@Ignore: This execution is ignored");
	}
	public static void ScrollUPDown(String val){
		
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 if(val.equals("Down")){
			 jse.executeScript("window.scrollBy(0,250)", "");	//Scroll Down
		 }else{
		 jse.executeScript("window.scrollBy(0,-250)", "");	//Scroll Up
		 }
	}
}
