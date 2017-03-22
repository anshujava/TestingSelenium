package SelenieumProject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
	System.setProperty("webdriver.gecko.driver", "F:/git/TestingSelenium/Selenum_Project/src/lib/geckodriver.exe");
	driver = new FirefoxDriver(); 
   driver.get("http://www.google.com");
   driver.manage().window().maximize();
 }
  
 @Test
  public void SearchSuggestion(){
	 try{
	 List<String> ls = new ArrayList<String>();
	 String s ="how to cook rice";
	 driver.findElement(By.name("q")).sendKeys(s);  
	 Thread.sleep(5000);
	 List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']"));
	 for(int i=0;i<options.size();i++){
      String sar[]=options.get(i).getText().split("\\n");
      for(int j =0;j<sar.length;j++){
    	
    	ls.add(sar[j]);
      }
     
     }
	 System.out.println(ls);
	 Object str = findClosestMatch(ls,s);
	 System.out.println("match=="+str);
	 driver.findElement(By.xpath("//*[text()='"+str+"']")).click();
	 Thread.sleep(3000);
//	 driver.quit();
	 }catch(InterruptedException iex){
		 System.out.println("Exception in::"+iex.getMessage());
		 
	 }
}
 /*
  * http://stackoverflow.com/questions/12244810/string-approximation-fetching-the-nearest-matched-string-from-dictionary
  * string best matching java example
  */
 public static Object findClosestMatch(Collection<String> collection, Object target) {
     int distance = Integer.MAX_VALUE;
     Object closest = null;
     for (Object compareObject : collection) {
         int currentDistance = StringUtils.getLevenshteinDistance(compareObject.toString(), target.toString());
         if(currentDistance < distance) {
             distance = currentDistance;
             closest = compareObject;
         }
     }
     return closest;
 }
}
