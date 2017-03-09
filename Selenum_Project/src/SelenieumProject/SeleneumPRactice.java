package SelenieumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleneumPRactice {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
		            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
		    WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com"); 
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Test");
		Thread.sleep(5000);
		System.out.println(driver.getTitle()); 
//		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.manage().deleteAllCookies();
		driver.close();

	}

}
