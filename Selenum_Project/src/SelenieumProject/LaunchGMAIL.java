package SelenieumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGMAIL {
	public static void main(String[] args) throws InterruptedException { 
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://google.com"); 
//	driver.manage().window().maximize();
	driver.manage().window().setSize(new Dimension(50,50));
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys("Test");
	Thread.sleep(5000);
	System.out.println(driver.getTitle()); 
	driver.navigate().refresh();
//	driver.quit(); 
	} 
}
