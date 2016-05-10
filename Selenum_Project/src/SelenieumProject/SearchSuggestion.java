package SelenieumProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchSuggestion {
 
WebDriver driver;
 
 @BeforeTest
 public void start(){
   driver = new FirefoxDriver(); 
   driver.get("http://www.google.com");
   driver.manage().window().maximize();
 }
  
 @Test
  public void SearchSuggestion(){
	 try{
	 driver.findElement(By.name("q")).sendKeys("stackoverflow");  
	 Thread.sleep(5000);
//	 driver.findElement(By.xpath("//ul[@role='listbox']//div[.='stackoverflow jobs']")).click();
	 List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']"));
	 for(int i=0;i<options.size();i++){
         System.out.println("all list::"+options.get(i).getText());
     }
	 driver.quit();
	 }catch(InterruptedException iex){
		 System.out.println("Exception in::"+iex.getMessage());
		 
	 }
}
  
}
