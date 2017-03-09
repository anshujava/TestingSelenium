package SelenieumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGMAIL {
	public static void main(String[] args) throws InterruptedException { 
		
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver",
	            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
	driver.get("http://google.com"); 
//	driver.manage().window().maximize();
//	driver.manage().window().setSize(new Dimension(50,50));
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys("Test");
	Thread.sleep(5000);
	System.out.println(driver.getTitle()); 
	driver.navigate().refresh();
//	driver.quit(); 
	} 
}
