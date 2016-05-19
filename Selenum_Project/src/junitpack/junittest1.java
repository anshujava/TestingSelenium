package junitpack;
import org.junit.Test; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class junittest1 {
	WebDriver driver;
	@Test public void test() throws InterruptedException { 
		 System.setProperty("webdriver.chrome.driver",
		            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver.exe");
		  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest1 executed"); 
		Thread.sleep(2000); 
		System.out.print("junittest1 class is executed"); 
		driver.quit(); 
		}
	} 