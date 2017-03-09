package PageObjectModel_DataDriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	WebDriver driver;    
	 
    public RediffHomePage(WebDriver driver){
 
        this.driver = driver;
 
    }
 
    
    public String getHomePage(){
    	String title = driver.getTitle();
    	 System.out.println("title=="+title);
        return title;

       }
    public void ClickCreateRediffAccount(){
    	
    	 List<WebElement> linkList=driver.findElements(By.linkText("Create a Rediffmail account"));
        
    	 for(int i=0 ; i<linkList.size() ; i++)
         {
    		 if(linkList.get(i).toString().contains("Create a Rediffmail account"))
             {
                 linkList.get(i).click();
                 break;
             }
         }
        }
    public void ClickSignIn(){
    	
   	 List<WebElement> linkList=driver.findElements(By.linkText("Sign in"));
       
   	 for(int i=0 ; i<linkList.size() ; i++)
        {
   		 if(linkList.get(i).toString().contains("Sign in"))
            {
   			    System.out.println("inside signin");
                linkList.get(i).click();
                System.out.println("clicked");
                break;
            }
        }
       }
 
}
