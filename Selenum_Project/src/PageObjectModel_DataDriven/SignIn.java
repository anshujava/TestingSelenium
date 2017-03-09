package PageObjectModel_DataDriven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignIn {
	WebDriver driver;    
	
	
	 By loginName = By.xpath("//*[@id='login1']");
	 By loginPwd = By.xpath("//*[@id='password']");
	 By goButton= By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input");
	 By verifyLogin = By.xpath("/html/body/div[4]/div[1]/div/div[2]/span/cite/a");
	 By writeMail = By.xpath("//*[@id='boxscroll']/li[1]/a");
	 By toMailId = By.xpath("//*[@id='TO_IDcmp2']");
	 By subject = By.xpath("//*[@id='rd_compose_cmp2']/ul/li[4]/input");
	 By mailBody = By.cssSelector("body");
	 By sendbtn = By.xpath("//*[@id='rd_compose_cmp2']/div[1]/a[1]");
	 
    public SignIn(WebDriver driver){
 
        this.driver = driver;
 
    }
 
    
    public String getSignInPage(){
    	String title = driver.getTitle();
        return title;

       }
    public void Login() throws InterruptedException{
    	Thread.sleep(2000);
    	driver.findElement(loginName).sendKeys("anshujava");
    	Thread.sleep(2000);
    	driver.findElement(loginPwd).sendKeys("an5858");
    	Thread.sleep(2000);
    	driver.findElement(goButton).click();
    	Thread.sleep(15000);
    	String loginName = driver.findElement(verifyLogin).getText();
    	Assert.assertTrue(loginName.contains("Anshuman Choudhury"));
    	Thread.sleep(2000);
    	driver.findElement(writeMail).click();
    	Thread.sleep(5000);
    	driver.findElement(toMailId).sendKeys("anshujava@rediffmail.com");
    	Thread.sleep(5000);
    	driver.findElement(subject).sendKeys("Regarding your health");
    	Thread.sleep(5000);
    	WebElement element = driver.findElement(mailBody);
    	element.click();
    	Thread.sleep(5000);
    	element.sendKeys("hello");
    	
    	Thread.sleep(5000);
    	driver.findElement(sendbtn).click();
    }
}
