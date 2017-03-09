package SelenieumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinks {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver",
	            "F:/git/TestingSelenium/Selenum_Project/src/lib/chromedriver2.25.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/git/TestingSelenium/Selenum_Project/src/SelenieumProject/links.html");
		driver.manage().window().maximize();
        List<WebElement> linkList=driver.findElements(By.tagName("a"));
        Thread.sleep(2000);
      //now traverse over the list and check
        for(int i=0 ; i<linkList.size() ; i++)
        {
      	  WebElement allLinks =linkList.get(i);
      	  String hyperlink=allLinks.getText();
      	  
      	  if(hyperlink.contains("Google")){
      		  System.out.println("inside if");
      		  allLinks.click();
      		  
      	  }
      	Thread.sleep(5000);
        }
      driver.quit();
	}

}
