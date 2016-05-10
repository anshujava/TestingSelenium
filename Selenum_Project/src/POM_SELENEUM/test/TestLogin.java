package POM_SELENEUM.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import POM_SELENEUM.pages.*;

public class TestLogin {
	WebDriver driver;
	Login objLogin;
    HomePage objHomePage;
  
  @BeforeTest
  public void setup(){
	  
      driver = new FirefoxDriver();

      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      driver.get("http://demo.guru99.com/V4/");

  }
  
  @Test
  public void test_Home_Page_Appear_Correct(){
	  
      //Create Login Page object

  objLogin = new Login(driver);

  //Verify login page title

  String loginPageTitle = objLogin.getLoginTitle();

  Assert.assertTrue(loginPageTitle.toLowerCase().contains(" bank"));

  //login to application

  objLogin.loginTo("mgr123", "mgr!23");

  // go the next page

  objHomePage = new HomePage(driver);

  //Verify home page

  Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
