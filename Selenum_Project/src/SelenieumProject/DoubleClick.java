package SelenieumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException { 
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		 WebElement ele = driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		  
		  //To generate double click action on "Double-Click Me To See Alert" button.
		  Actions action = new Actions(driver);
		  action.doubleClick(ele);
		  action.perform();
		  
		  Thread.sleep(3000);
		  String alert_message = driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		  System.out.println(alert_message);
		 
	}
}
