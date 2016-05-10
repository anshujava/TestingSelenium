package TestNGReporting_Seleneum;

import java.io.FileInputStream;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyAutomationScript {
  @Test
  public void VerifyGoogle() throws Exception {
	  FileInputStream fis = new FileInputStream("F:\\EclipseWorkspace\\Selenum_Project\\src\\TestNGReporting_Seleneum\\LoginVerifyGoogle_Data.xls");
      RunTest.runTest(fis);
	 
  }
}
