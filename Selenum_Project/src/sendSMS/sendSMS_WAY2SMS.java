package sendSMS;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class sendSMS_WAY2SMS {
	WebDriver driver = new HtmlUnitDriver();
	@Before
  public void beforetest() {
		
		driver.get("http://site23.way2sms.com/content/index.html");
		} 
	@After
	public void aftertest() {
		driver.quit(); 
		} 
	@Test 
	public void test() throws InterruptedException { 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		String actualResult= driver.getTitle();
		String expecedResult= "Free SMS, Send Free SMS, Send Free SMS to india, Way2SMS Login, Free SMS Site, Free email alerts, email2SMS, SMS Alerts, send SMS to any Mobile, Mobile to Mobile free SMS";
	    Assert.assertEquals(expecedResult, actualResult);
	    driver.findElement(By.id("username")).sendKeys("9739132696");
	    driver.findElement(By.id("password")).sendKeys("anshuanshu12");
	    Thread.sleep(3000);
	    
	} 
}
