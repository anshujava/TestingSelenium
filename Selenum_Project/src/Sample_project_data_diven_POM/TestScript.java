package Sample_project_data_diven_POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript {
	WebDriver driver;
	@Test
	public void verifyValidLogin() throws InterruptedException, IOException
	{
	 
	System.setProperty("webdriver.chrome.driver",
            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
    driver = new ChromeDriver();
   
    driver.manage().window().maximize();
	 
	
	driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	Thread.sleep(2000);
	WordPress_LoginPage login=new WordPress_LoginPage(driver);
	 
	login.loginToWordpress(); 
	 
	login.clickOnLoginButton();
	 
	 
	driver.quit();
	 
	}
	 
}
