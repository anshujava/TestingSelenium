package junitpack;
import org.junit.*;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class junittest2 { 
	WebDriver driver ; 
	
	@Before
	public void setup () { 
		
		System.setProperty("webdriver.chrome.driver",
	            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html"); 
		} 
	@After
	public void aftertest() 
	{ 
		driver.quit();
		} 
	@Test 
	public void test1() throws InterruptedException{ 
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest2 class-test1"); 
		System.out.print("\njunittest2 class-test1 method is executed"); 
		Thread.sleep(2000); 
		} 
	@Ignore
	@Test 
	public void test2() 
			throws InterruptedException { 
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("junittest2 class-test2"); 
		Thread.sleep(2000); 
		System.out.print("\njunittest2 class-test2 method is executed");
		} 
	} 
