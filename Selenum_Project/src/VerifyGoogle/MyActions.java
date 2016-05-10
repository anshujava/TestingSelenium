package VerifyGoogle;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import VerifyGoogle.ExtentReports.Log;


public class MyActions {
	
     WebDriver driver;
	 
	 public void Launch(String url,String driverType) throws InterruptedException{
		 if(driverType.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver",
		            "F:/EclipseWorkspace/Selenum_Project/src/lib/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get(url);
		    driver.manage().window().maximize();
		    this.driver = driver;  
		    Thread.sleep(5000);
		  } else if(driverType.equals("firefox")){
			  WebDriver driver = new FirefoxDriver();
			  driver.get(url);
			  driver.manage().window().maximize();
			  this.driver = driver;  
			  Thread.sleep(5000);
		  }else{
			  System.setProperty("webdriver.chrome.driver",
			            "F:/EclipseWorkspace/Selenum_Project/src/lib//IEDriverServer.exe");
			  WebDriver driver = new InternetExplorerDriver();
			  driver.get(url);
			  driver.manage().window().maximize();
			  this.driver = driver;  
			  Thread.sleep(5000);
		  }
		}
		public void LoginUser(String username,String pwd,String DriverType,String url) throws InterruptedException{
			Launch(url,DriverType);
			WebElement SelectImage = driver.findElement(By.cssSelector("#gbwa > div.gb_2b > a"));
			if(SelectImage != null){
			    SelectImage.click();
			}
			else{
				Log.VerifyElements(SelectImage, driver);
			}
			Thread.sleep(5000);
			WebElement SelectGmail = driver.findElement(By.cssSelector("#gb23 > span.gb_3"));
			if(SelectGmail != null){
				SelectGmail.click();
			}
			else{
				Log.VerifyElements(SelectGmail, driver);
			}
			Thread.sleep(5000);
			WebElement SelectSiginIn = driver.findElement(By.cssSelector("#gmail-sign-in"));
			if(SelectSiginIn != null){
				SelectSiginIn.click();
			}
			else{
				Log.VerifyElements(SelectSiginIn, driver);
			}
			Thread.sleep(5000);
			WebElement login = driver.findElement(By.id("Email"));
			if(login != null){
				login.sendKeys(username);
			}
			else{
				Log.VerifyElements(login, driver);
			}
			
			Thread.sleep(5000);
			WebElement nextElement = driver.findElement(By.id("next"));
			if(nextElement != null){
				nextElement.click();
			}
			else{
				Log.VerifyElements(nextElement, driver);
			}
			Thread.sleep(5000);
			WebElement password = driver.findElement(By.id("Passwd"));
			if(password != null){
				password.sendKeys(pwd);
			}
			else{
				Log.VerifyElements(password, driver);
			}
			Thread.sleep(5000);
			WebElement okButton = driver.findElement(By.id("signIn"));
			if(okButton != null){
				okButton.click();
			}
			else{
				Log.VerifyElements(okButton, driver);
			}
			
			Thread.sleep(5000);
			
		}

		public void VerifyLogin(String value) throws InterruptedException{
			try{
			WebElement name =driver.findElement(By.cssSelector("#gb > div.gb_qd.gb_le > div.gb_La.gb_le.gb_R.gb_ke.gb_da.gb_T > div.gb_7d.gb_R.gb_le.gb_ee > div > span"));
		    Log.assertEquals(driver, value, name.getText());
			}   catch(Exception e)
        {
            System.out.println("in VerifyLogin Assertion error. "+e.getMessage());
        }			
	    }
		public void Logout() throws InterruptedException{
			WebElement userImage = driver.findElement(By.cssSelector("#gb > div.gb_qd.gb_le > div.gb_La.gb_le.gb_R.gb_ke.gb_da.gb_T > div.gb_Pb.gb_le.gb_R > div.gb_Ta.gb_Rb.gb_le.gb_R > div.gb_2b.gb_Va.gb_le.gb_R > a > span"));
			if(userImage != null){
				userImage.click();
			}
			else{
				Log.VerifyElements(userImage, driver);
			}
			Thread.sleep(5000);
			WebElement logoutButton = driver.findElement(By.cssSelector("#gb_71"));
			if(logoutButton != null){
				logoutButton.click();
			}
			else{
				Log.VerifyElements(logoutButton, driver);
			}
			Thread.sleep(5000);
			driver.close();
			driver.quit();
			
		}
		public void LaunchBrowser(String DriverType,String url,String ExpectedValue) throws InterruptedException{
			try{
			Launch(url,DriverType);
			String actualTitle = driver.getTitle();
			Log.assertEquals(driver, ExpectedValue, actualTitle);
			}catch(Exception e)
	        {
	            System.out.println("in LaunchBrowser Assertion error. "+e.getMessage());
	        }
		}
		public void Search(String searchValue) throws InterruptedException{
			try{
				
			WebElement searchText = driver.findElement(By.cssSelector("#lst-ib"));
			if(searchText != null){
				searchText.sendKeys(searchValue);
			}
			else{
				Log.VerifyElements(searchText, driver);
			}
			
			Thread.sleep(5000);
			WebElement searchButton = driver.findElement(By.cssSelector("#sblsbb > button"));
			if(searchButton != null){
				searchButton.click();
			}
			else{
				Log.VerifyElements(searchButton, driver);
			}
			
			Thread.sleep(5000);
			String actualTitle = driver.getTitle();
			Log.assertEquals(driver, searchValue, actualTitle);
			Thread.sleep(5000);
			driver.quit();
			
			}catch(Exception e)
	        {
				System.out.println("in Search Assertion error. "+e.getMessage());
	            
	        }
			
		}
		public void SignUp() throws InterruptedException{
			try{
				WebElement SingUpBtn
                     = driver.findElement(By.cssSelector("#modalWrapper > div > div > a"));
				if(SingUpBtn != null){
					SingUpBtn.click();
				}
				else{
					Log.VerifyElements(SingUpBtn, driver);
				}
		
				WebElement emailAddress
                = driver.findElement(By.cssSelector("#MERGE0"));
				WebElement fristName
                = driver.findElement(By.cssSelector("#contactUsForm > fieldset > div.content-contactform > div:nth-child(3) > div > input"));
				WebElement lastName
                = driver.findElement(By.cssSelector("#contactUsForm > fieldset > div.content-contactform > div:nth-child(4) > div > input"));
				WebElement postalCode
                = driver.findElement(By.cssSelector("#contactUsForm > fieldset > div.content-contactform > div:nth-child(5) > div > input"));
				WebElement bdayMM
                = driver.findElement(By.cssSelector("#BIRTHDAY2-month"));
				WebElement bdayDD
                = driver.findElement(By.cssSelector("#BIRTHDAY2-day"));
				WebElement foramtText
                = driver.findElement(By.cssSelector("#contactUsForm > fieldset > div.content-contactform > div:nth-child(7) > div > label:nth-child(4)"));
				WebElement foramtHtml
                = driver.findElement(By.cssSelector("#contactUsForm > fieldset > div.content-contactform > div:nth-child(7) > div > label:nth-child(2)"));
				WebElement olderThan13
                = driver.findElement(By.cssSelector("#contactUsForm > fieldset > div.content-contactform > div:nth-child(8) > div > label"));
				WebElement termsCond
                = driver.findElement(By.cssSelector("#contactUsForm > fieldset > div.content-contactform > div:nth-child(9) > div > label"));
				
				emailAddress.sendKeys("anshujava@gmail.com");
				fristName.sendKeys("anshuman");
				lastName.sendKeys("choudhruy");
				postalCode.sendKeys("56017");
				bdayMM.sendKeys("04");
				bdayDD.sendKeys("07");
				foramtText.click();
				foramtHtml.click();
				olderThan13.click();
				termsCond.click();
				CloseBrowser();
				
				
			}catch(Exception e)
	        {
				System.out.println("in SignUp . "+e.getMessage());
	            
	        }
		}
	public void VerifyMenu() throws InterruptedException{
			try{
				Launch("http://www.thecheesecakefactory.com/","chrome");
				Thread.sleep(8000);
//				WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#closeBtn")));
				WebElement closeBtn = driver.findElement(By.cssSelector("#closeBtn"));
				System.out.println("cls btn::"+closeBtn.getText());
				if(closeBtn.getText() != null){
					closeBtn.click();
				}
				else{
					Log.VerifyElements(closeBtn, driver);
				}
				Thread.sleep(8000);
				WebElement MenuLink = driver.findElement(By.xpath("//a[contains(@href, '/menu/')]"));
				if(MenuLink.getText() != null){
					MenuLink.click();
				}
				else{
					Log.VerifyElements(MenuLink, driver);
				}
				Thread.sleep(8000);
				WebElement DesertLink = driver.findElement(By.xpath("//a[contains(@href, '/menu/desserts/')]"));
				if(DesertLink.getText() != null){
					DesertLink.click();
				}
				else{
					Log.VerifyElements(DesertLink, driver);
				}
				Thread.sleep(8000);
				WebElement cheseCakesLink = driver.findElement(By.xpath("//a[contains(@href, '/menu/desserts/cheesecakes/')]"));
				if(cheseCakesLink.getText() != null){
					cheseCakesLink.click();
				}
				else{
					Log.VerifyElements(cheseCakesLink, driver);
				}
				Thread.sleep(8000);
				List <WebElement> allValue = driver.findElements(By.xpath("//a[contains(@href, '/menu/desserts/cheesecakes/')]"));
				System.out.println(allValue.size());

				 for(int i=0 ; i<allValue.size() ; i++)
				    {
				       
				        	System.out.println(""+allValue.get(i).getText());
				       
				    }
				 CloseBrowser();
				
			}catch(Exception e)
	        {
				System.out.println("in VerifyMenu error. "+e.getMessage());
	            
	        }
			
		}
		public void CloseBrowser(){
			    
				driver.quit(); 
			
		}
		
}
