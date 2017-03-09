package Sample_project_data_diven_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WordPress_LoginPage {
	WebDriver driver;

	By username=By.xpath(".//*[@id='user_login']");
	By password=By.xpath(".//*[@id='user_pass']");
	By loginButton=By.xpath(".//*[@id='wp-submit']");
	
	public WordPress_LoginPage(WebDriver driver) throws IOException
	{
	this.driver=driver;
	readExel();
	}
	 static String userid ="";
	 static String pass ="";
	 public static void readExel() throws IOException {
		  FileInputStream fis = new FileInputStream("F:\\git\\TestingSelenium\\Selenum_Project\\src\\Sample_project_data_diven_POM\\details.xls");
		  HSSFWorkbook wb = new HSSFWorkbook(fis);
	      HSSFSheet sheet = wb.getSheet("Sheet1");
	      for(int count = 1;count<=sheet.getLastRowNum();count++){
	    	  HSSFRow row = sheet.getRow(count);
	          if(row.getCell(0).toString().equals("TRUE")) {
	        	  if(!(row.getCell(count) == null || row.getCell(count).equals(Cell.CELL_TYPE_BLANK))) {
	        		  userid = row.getCell(1).toString();
	    	          } else {
	    	          userid = "";
	    	          }
	          	  if(!(row.getCell(count) == null || row.getCell(count).equals(Cell.CELL_TYPE_BLANK))) {
	          		pass = row.getCell(2).toString();
	    	          } else {
	    	        pass = "";
	    	          }
	          }
	    	  
	      }
	 }
	public void loginToWordpress()
	{
	System.out.println("userid="+userid); 
	System.out.println("pass="+pass); 
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	 
	}
	 
	 
	 
	public void clickOnLoginButton()
	{
	driver.findElement(loginButton).click();
	}
}


