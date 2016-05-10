package seleniumtest;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AntTest {
	WebDriver driver;
 @Before
 public void setUp()  {
	 System.setProperty("webdriver.chrome.driver",
	            "F:/EclipseWorkspace/ANT_SELENUM/lib/chromedriver.exe");
	    driver = new ChromeDriver();
	 driver.get("http://www.google.co.in/");
	 driver.manage().window().maximize();
 }

 @Test
 public void testGoogleSearch() throws InterruptedException {
	    String searchValue="How to cook chicken";
	    WebElement searchText = driver.findElement(By.cssSelector("#lst-ib"));
		searchText.sendKeys(searchValue);
		Thread.sleep(3000);
		WebElement searchButton = driver.findElement(By.cssSelector("#sblsbb > button"));
		searchButton.click();
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, searchValue);
 }

 @After
 public void tearDown() throws InterruptedException {
	 Thread.sleep(3000);
 driver.quit();
 }

}

