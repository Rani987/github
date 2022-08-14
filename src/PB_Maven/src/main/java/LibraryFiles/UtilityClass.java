package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

//@AuthorName Shital
//This method is use to get TestData from excel sheet
//need to pass 2 inputs ie. 1. rowIndex, 2. colIndexx
public class UtilityClass 
{
    public static String getTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
    {
    	FileInputStream f=new FileInputStream("G:\\Testing\\automation\\Selenium\\Framework\\Policy_bazar\\ddf1.xlsx");
        Sheet sh=WorkbookFactory.create(f).getSheet("Sheet1");
        String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
        return value;
    }
 //@AuthorName Shital
 //This method is use to capture screenshot of webpage
 //need to pass 2 inputs:  1.webdriver object, 2. int TCID  
   public static void screenshot(WebDriver driver,int TCID) throws IOException
   {
	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest=new File("C:\\Users\\shree\\eclipse-workspace\\PB_Maven\\Screenshots\\TestcaseID"+TCID+".jpg");
	   FileHandler.copy(src,dest);
   }
 //@AuthorName Shital
 //This method is use to get Property/Authorization Details 
 //need to pass 1 input:  Key
   public static String getPFData(String key) throws IOException
   {
	   FileInputStream f=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\PB_Maven\\Property.properties"); 
	   Properties p=new Properties();
	   p.load(f);
	   String value=p.getProperty(key);
	   return value;
	   
   }
    
    
}
