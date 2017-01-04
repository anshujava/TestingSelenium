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
		WebDriver driver = new ChromeDriver();
		List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size()); 
//         for (WebElement myElement : links){
//        for (WebElement myElement : links){
//        String link = myElement.getText(); 
//        System.out.println(link);
//        System.out.println(myElement);   
//       if (link.contains("gmail")){
//            myElement.click();
//            Thread.sleep(2000);
//           }
//           //Thread.sleep(5000);
//         } 
        List<WebElement> linkList=driver.findElements(By.tagName("a"));

      //now traverse over the list and check
      for(int i=0 ; i<linkList.size() ; i++)
      {
    	 
          if(linkList.get(i).getAttribute("href").contains("long"))
          {
              linkList.get(i).click();
              break;
          }
      }
	}

}
