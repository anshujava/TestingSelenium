package TestNGReporting_Seleneum;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;

  public class RunTest {
	  static String ExcelAction = "";
	  static String ExcelValue = "";
	  static String ExcelValue1 = "";
	  static String ExcelValue2 = "";
	  static String ExcelValue3 = "";
	  
	  private enum Actions {
			LaunchBrowser,
			Search
			
	  }

 public static void runTest(FileInputStream fis,WebDriver driver) {
	 MyAllActions act=new MyAllActions();
	 try {
	  HSSFWorkbook wb = new HSSFWorkbook(fis);
      HSSFSheet sheet = wb.getSheet("sheet");
      for(int count = 1;count<=sheet.getLastRowNum();count++){
          HSSFRow row = sheet.getRow(count);
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
        	  System.out.println("ExcelAction:::"+ExcelAction);
  	          Actions actions = Actions.valueOf(ExcelAction); 
  			  switch(actions) {
  				case LaunchBrowser:
					act.LaunchBrowser(ExcelValue2,ExcelValue,driver);
				    break;
  					 
  				case Search:
  					act.Search(ExcelValue,driver);
  					break;
  					 
  			 }
          }
      }
      
 }    
	 catch(InterruptedException ie){		 
		 System.out.println("Exception is :::"+ie.getMessage());
      }
	 catch(IOException ioe){
	 System.out.println("Exception is :::"+ioe.getMessage());
     }
	 catch(NullPointerException e){
		 System.out.println("Exception is :::"+e.getMessage());
     }
	 
  }
 
  }
