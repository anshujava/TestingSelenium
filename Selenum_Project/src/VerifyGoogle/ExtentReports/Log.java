package VerifyGoogle.ExtentReports;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Log {
	static String reportLocation = "F:\\EclipseWorkspace\\Selenum_Project\\src\\VerifyGoogle\\reports\\";
    static String imageLocation = reportLocation+"images";
	static final ExtentReports extent = ExtentReports.get(Log.class);
	public static void assertEquals(WebDriver driver,String expectedResult, String actualResult) {
 
        if(actualResult.equals(expectedResult)) {
        	extent.log(LogStatus.PASS, "Matching Expected Result:"+expectedResult, "Actual Result is :" + actualResult);
        } else {
            extent.log(LogStatus.FAIL, "Expected Result:"+expectedResult,"Actual Result is :"+actualResult+", View Below Details",createScreenshot(driver));
        }
    }
	public static void VerifyElements(WebElement webEle,WebDriver driver) {
		 
        if(webEle.getText() != null){
        	extent.log(LogStatus.PASS, webEle.getText()+"::WebElement is available");
        } else {
        	 extent.log(LogStatus.FAIL, "In script","Web Element Not Found, View Below Details",createScreenshot(driver));
        }
    }
    public static String createScreenshot(WebDriver driver) {
    	 
        UUID uuid = UUID.randomUUID();
     
        // generate screenshot as a file object
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            // copy file object to designated location
            FileUtils.copyFile(scrFile, new File(imageLocation + uuid + ".png"));
        } catch (IOException e) {
            System.out.println("Error while generating screenshot:\n" + e.toString());
        }
        return imageLocation + uuid + ".png";
    }
}
