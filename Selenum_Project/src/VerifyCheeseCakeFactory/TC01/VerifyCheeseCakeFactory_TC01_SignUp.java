package VerifyCheeseCakeFactory.TC01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import VerifyGoogle.RunTest;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.GridType;

public class VerifyCheeseCakeFactory_TC01_SignUp {
	static final ExtentReports extent = ExtentReports.get(VerifyCheeseCakeFactory_TC01_SignUp.class);
	static String reportLocation = "F:\\git\\TestingSelenium\\Selenum_Project\\src\\VerifyCheeseCakeFactory\\TC01\\reports\\";
	static String ScriptName = VerifyCheeseCakeFactory_TC01_SignUp.class.getSimpleName();
	public static void main(String[] args) throws FileNotFoundException {
	  try {
		   
		    extent.init(reportLocation + ScriptName+".html", true, DisplayOrder.BY_OLDEST_TO_LATEST, GridType.STANDARD);
	        extent.config().documentTitle("Report To Verify CheeseCakeBakeryFactory PAage");
	        extent.config().reportHeadline("Test Report for CheeseCakeBakeryFactory Test<b>Reports</b>");
	        extent.startTest("Test Case ","This test is Launch CheeseCakeBakeryFactory and Verify");
	        FileInputStream fis = new FileInputStream("F:\\git\\TestingSelenium\\Selenum_Project\\src\\VerifyCheeseCakeFactory\\TC01\\TC01_SignUp_Data.xls");
	        RunTest.runTestStep(fis);
	        extent.endTest();
	        
	       } catch (Exception e) {
	       System.out.println(e.toString());
	   }
  }
}
