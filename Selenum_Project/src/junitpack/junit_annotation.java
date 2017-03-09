package junitpack;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit_annotation {
	WebDriver driver ; 
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("BeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver",
	            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html"); 
	}

	@Test
	public void balanceForAccount() throws InterruptedException {
		
		System.out.println("Test First" );
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("test1"); 
		Thread.sleep(2000); 
	}

	@Test
	public void testOneDeposit() throws InterruptedException { 
		System.out.println("Test 2nd" );
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("test2"); 
		Thread.sleep(2000); 
	}

	@Test
	public void testManyDeposits() throws InterruptedException {
		
		System.out.println("Test 3rd" );
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("test3"); 
		Thread.sleep(2000); 
		
	}

	@Test
	public void testOneWithdraw() throws InterruptedException {
		
		System.out.println("Test 4th" );
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("test4"); 
		Thread.sleep(2000); 
	}

	@Test
	public void testManyWithdraws() throws InterruptedException {
		
		System.out.println("Test 5th" );
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("test5"); 
		Thread.sleep(2000); 
	}

	@After
	public void tearDown() throws Exception {
	
		System.out.println("tearDown After");
		driver.quit();
	}

	@AfterClass
	public static void AfterClass() {
		
		System.out.println("AfterClass");
	}

	@Ignore
	public void executionIgnored() {
		System.out.println("@Ignore: This execution is ignored");
	}
}
