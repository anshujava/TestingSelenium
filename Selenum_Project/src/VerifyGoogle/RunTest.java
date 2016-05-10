package VerifyGoogle;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import com.relevantcodes.extentreports.ExtentReports;

public class RunTest {

  static String ExcelAction = "";
  static String ExcelValue = "";
  static String ExcelValue1 = "";
  static String ExcelValue2 = "";
  static String ExcelValue3 = "";
  private enum Actions {
  	    LoginUser,
		VerifyLogin,
		Logout,
		LaunchBrowser,
		Search,
		SignUp,
		VerifyMenu
		
  }
	public static void runTestStep(FileInputStream fis) throws Exception {
		  MyActions act=new MyActions();
		  HSSFWorkbook wb = new HSSFWorkbook(fis);
	      HSSFSheet sheet = wb.getSheet("sheet");
	      for(int count = 1;count<=sheet.getLastRowNum();count++){
	          HSSFRow row = sheet.getRow(count);
	          // Run the test step for the current test data row
	          if(row.getCell(0).toString().equals("True")) {
	          	
	          if(!(row.getCell(count) == null || row.getCell(count).equals(Cell.CELL_TYPE_BLANK))) {
	          	ExcelAction = row.getCell(1).toString();
	          } else {
	          	ExcelAction = "";
	          }

	          if(!(row.getCell(count) == null || row.getCell(count).equals(Cell.CELL_TYPE_BLANK))) {
	          	ExcelValue = row.getCell(2).toString();
	          } else {
	          	ExcelValue = "";
	          }
	          if(!(row.getCell(count) == null || row.getCell(count).equals(Cell.CELL_TYPE_BLANK))) {
	          	ExcelValue1 = row.getCell(3).toString();
	          } else {
	          	ExcelValue1 = "";
	          }
	          if(!(row.getCell(count) == null || row.getCell(count).equals(Cell.CELL_TYPE_BLANK))) {
		          	ExcelValue2 = row.getCell(4).toString();
		          } else {
		          	ExcelValue2 = "";
		          }
	          if(!(row.getCell(count) == null || row.getCell(count).equals(Cell.CELL_TYPE_BLANK))) {
		          	ExcelValue3 = row.getCell(5).toString();
		          } else {
		          	ExcelValue3 = "";
		          }
	          }
	  System.out.println("ExcelAction-"+ExcelAction);
	  Actions actions = Actions.valueOf(ExcelAction); 
		 switch(actions) {
		   
			case LoginUser:
		    	act.LoginUser(ExcelValue,ExcelValue1,ExcelValue2,ExcelValue3);
		    	  break;
				 
			case VerifyLogin:
				act.VerifyLogin(ExcelValue);
				 break;
				 
			case Logout:
				act.Logout();
				 break;
			case LaunchBrowser:
				act.LaunchBrowser(ExcelValue2,ExcelValue3,ExcelValue);
				 break;
				 
			case Search:
				act.Search(ExcelValue);
				 break;
				 
			case SignUp:
			     act.SignUp();
			     break;
			     
			case VerifyMenu:
			     act.VerifyMenu();
			     break;
				 
		 }
	}
	}
}
