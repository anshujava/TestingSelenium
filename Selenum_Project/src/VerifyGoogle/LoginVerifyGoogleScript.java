package VerifyGoogle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.GridType;

public class LoginVerifyGoogleScript {
	static final ExtentReports extent = ExtentReports.get(LoginVerifyGoogleScript.class);
	static String reportLocation = "F:\\git\\TestingSelenium\\Selenum_Project\\src\\VerifyGoogle\\reports\\";
	static String ScriptName = LoginVerifyGoogleScript.class.getSimpleName();
	public static void main(String[] args) throws FileNotFoundException {
	  try {
		   
		    extent.init(reportLocation + ScriptName+".html", true, DisplayOrder.BY_OLDEST_TO_LATEST, GridType.STANDARD);
	        extent.config().documentTitle("Report To Verify Google");
	        extent.config().reportHeadline("Test Report for Google Test<b>Reports</b>");
	        extent.startTest("Test Case ","This test is Launch Google and Verify");
	        FileInputStream fis = new FileInputStream("F:\\git\\TestingSelenium\\Selenum_Project\\src\\VerifyGoogle\\LoginVerifyGoogle_Data.xls");
	        RunTest.runTestStep(fis);
	        extent.endTest();
	        
	       } catch (Exception e) {
	       System.out.println(e.toString());
	   }
  }
}
