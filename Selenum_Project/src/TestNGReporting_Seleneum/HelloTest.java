package TestNGReporting_Seleneum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTest {
	static WebDriver driver;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	            "F:/EclipseWorkspace/Selenum_Project/src/lib/chromedriver.exe");
	     
	
    	driver= new ChromeDriver();
	    driver.get("https://www.google.co.in");
	    driver.manage().window().maximize();
	    if(driver.toString().contains("null"))
	    {

	    System.out.print("All Browser windows are closed ");
	    }
	    else
	    {
	    driver.quit();
	    }

	}

}
