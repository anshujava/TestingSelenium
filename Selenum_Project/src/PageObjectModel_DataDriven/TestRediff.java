package PageObjectModel_DataDriven;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class TestRediff {
	WebDriver driver;
	RediffHomePage objhomepage;
	SignIn objSignInPage;
//	RegisterUserPage objregpage;
	
	@BeforeTest
	  public void setup() throws InterruptedException{
		  
		System.setProperty("webdriver.chrome.driver",
	            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
	    driver = new ChromeDriver();
	   
	    driver.manage().window().maximize();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 
	   Thread.sleep(2000);

	  }
	
	 @Test
	 
	  public void testHomePageClickCreateAccount() throws InterruptedException, IOException{
		//Test homepage 
//			 objhomepage= new RediffHomePage(driver);
//			 String homepageTitle = objhomepage.getHomePage();
//			 System.out.println("homepageTitle="+homepageTitle);
//			 Thread.sleep(2000);
//			 Assert.assertTrue(homepageTitle.contains("Rediff.com"));
//			 objhomepage.ClickSignIn();
//			 objhomepage.ClickCreateRediffAccount();
		//Test Register Page and Create Account 
//			 objregpage = new RegisterUserPage(driver);
//			 String regpageTitle = objregpage.getRegisterPage();
//			 Thread.sleep(2000);
//			 Assert.assertTrue(regpageTitle.contains("Rediffmail Free Unlimited Storage"));
//			 objregpage.FillRegisterPage();
		 
		 
		 //Test SignInPage
		 objSignInPage= new SignIn(driver);
		 String signInPageTitle = objSignInPage.getSignInPage();
		 System.out.println("signInPageTitle="+signInPageTitle);
		 Assert.assertTrue(signInPageTitle.contains("Rediffmail"));
		 Thread.sleep(2000);
		 objSignInPage.Login();
	 }
	

	  @AfterMethod
	  public void afterTest() {
//		  driver.quit();
	  }
}
