package SelenieumProject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	static WebDriver driver;
	public static void main (String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		
		List<WebElement> linkNames=driver .findElements(By.tagName("a"));
		driver.manage().window().maximize();
		for(int i =0; i<linkNames.size();i++){
			
			WebElement allLinks =linkNames.get(i);
	      	  String hyperlink=allLinks.getText();
	      	  
	      	  if(hyperlink.contains("Today's Deals")){
	      		  allLinks.click();
	      		  break;
	      	  }
				
			}
		List<WebElement> checkNames=driver.findElements(By.xpath("//input[@type='checkbox' and @value='']"));
		for (int i = 0; i != 3; i++)
		{
			Thread.sleep(5000);
			checkNames.get(i).click();
		    Thread.sleep(5000);
		    checkNames=driver.findElements(By.xpath("//input[@type='checkbox' and @value='']"));
		} 
		Thread.sleep(10000);
	   driver.findElement(By.cssSelector("#FilterItemView_sortOrder_dropdown > div > span.a-declarative > span > span > span > span")).click();
	   Thread.sleep(10000);
	    Actions actions = new Actions(driver);
	    for(int i = 1; i <= 3; i++){
	    actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
	    }
	    actions.sendKeys(Keys.ENTER).build().perform();//press enter
	    Thread.sleep(10000);
		 WebElement addcart = driver.findElement(By.xpath("//*[@id='100_dealView_0']/div/div[2]/div/div[8]/div/span/span/span/button"));
		 
			addcart.click();
	       Thread.sleep(10000);
			driver.close();
			driver.quit();
			System.out.println("driver closed");
		}
		
		
	

}
