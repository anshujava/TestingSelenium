package PageObjectModel_DataDriven;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class RegisterUserPage {
	WebDriver driver;    
	
	 By fullName = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input");
	 By chooseRediffId = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[1]");
	 By checkAvailabilityButton = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[2]");
	 By checkAvailabilityErrorMsg = By.xpath("//*[@id='check_availability']/font[1]/b");
	 By availabilityRediffId = By.xpath("//*[@id='recommend_text']/table/tbody/tr[1]/td[2]");
	 By pasword = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input");
	 By retypePassword = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[11]/td[3]/input");
	 By alternativeEmailAddress = By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input");
	 By mobileAreaCode =By.xpath("//*[@id='div_mob']/table/tbody/tr/td[3]/div[2]");
	 By mobile = By.xpath("//*[@id='mobno']");
	 By dob_day = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[1]");
	 By dob_month = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[2]");
	 By dob_year = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[24]/td[3]/select[3]");
	 By gender_m = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[26]/td[3]/input[1]");
	 By gender_f = By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[26]/td[3]/input[2]");
	 By country = By.xpath("//*[@id='country']");
	 By city = By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select");
	
	
    public RegisterUserPage(WebDriver driver){
 
        this.driver = driver;
 
    }
    public String getRegisterPage(){
    	String title = driver.getTitle();
    	 
        return title;

       }
    
    public void FillRegisterPage() throws InterruptedException, IOException{
    	
        Thread.sleep(2000);
    	driver.findElement(fullName).sendKeys("anshuman choudhury");
    	Thread.sleep(2000);
    	driver.findElement(chooseRediffId).sendKeys("anshu");
    	Thread.sleep(2000);
    	driver.findElement(checkAvailabilityButton).click();
    	Thread.sleep(2000);
    	WebElement errorMsg=driver.findElement(checkAvailabilityErrorMsg);
    	if(errorMsg.getText().contains("Sorry, the ID that you are looking for is taken.")){
	    	WebElement rediffId =driver.findElement(availabilityRediffId);
	    	String rediffNewId=rediffId.getText();
	    	Thread.sleep(2000);
	    	driver.findElement(chooseRediffId).clear();
	    	driver.findElement(chooseRediffId).sendKeys(rediffNewId);
	    	driver.findElement(checkAvailabilityButton).click();
    	
    	}
    	    Thread.sleep(2000);
    		driver.findElement(pasword).sendKeys("anshu123");
    		Thread.sleep(2000);
    		driver.findElement(retypePassword).sendKeys("anshu123");
    		Thread.sleep(2000);
    		driver.findElement(alternativeEmailAddress).sendKeys("anshuman11@gmail.com");
    		Thread.sleep(2000);
    		driver.findElement(mobileAreaCode).click();
    		Thread.sleep(2000);
    		
    		List<WebElement> rediffId =driver.findElements(By.xpath("//*[@id='country_id']/ul/li"));
		   		 for(int i=0 ; i<rediffId.size() ; i++)
		            {
		   			if(rediffId.get(i).getText().equals("India (+91)")){
		   				rediffId.get(i).click();
		   				break;
		   			}
		          }
		Thread.sleep(2000);
		driver.findElement(mobile).sendKeys("8095477587");
	    Thread.sleep(2000);
    	driver.findElement(dob_day).click();
    	Thread.sleep(2000);
    	Select selectday = new Select(driver.findElement(dob_day));
    	selectday.selectByVisibleText("07");
    	Thread.sleep(2000);
    	driver.findElement(dob_day).click();
    	
    	Thread.sleep(2000);
     	driver.findElement(dob_month).click();
     	Thread.sleep(2000);
     	Select selectmonth = new Select(driver.findElement(dob_month));
     	selectmonth.selectByVisibleText("APR");
     	Thread.sleep(2000);
     	driver.findElement(dob_month).click();
     	
     	Thread.sleep(2000);
     	driver.findElement(dob_year).click();
     	Thread.sleep(2000);
     	Select selectyear = new Select(driver.findElement(dob_year));
     	selectyear.selectByVisibleText("1981");
     	Thread.sleep(2000);
     	driver.findElement(dob_year).click();
     	
     	Thread.sleep(2000);
     	String genderValue ="FeMale";
     	if(genderValue.equals("Male")){
	     	 driver.findElement(gender_m).click();
	     	}else{
	     	 driver.findElement(gender_f).click();
	     }
     	Thread.sleep(2000);
     	driver.findElement(country).click();
     	Thread.sleep(2000);
     	Select selectcountry = new Select(driver.findElement(country));
     	String CountryValue="India";
     	if(CountryValue.equals("India")){
	     	selectcountry.selectByVisibleText(CountryValue);
	     	Thread.sleep(2000);
	     	driver.findElement(country).click();
	     	Thread.sleep(2000);
	     	driver.findElement(city).click();
	     	Select selectcity = new Select(driver.findElement(city));
	     	Thread.sleep(2000);
	     	selectcity.selectByVisibleText("Bangalore");
	     	Thread.sleep(2000);
	     	driver.findElement(city).click();
     	}else{
     		selectcountry.selectByVisibleText(CountryValue);
	     	Thread.sleep(2000);
	     	driver.findElement(country).click();
	     	Thread.sleep(2000);
     		
     	}
     	String imageUrl = driver.findElement(By.xpath("//*[@id='wrapper']/table[2]/tbody/tr[32]/td[2]/img")).getAttribute("src");
     	 System.out.println("Image source path : \n"+ imageUrl);

       }
}
