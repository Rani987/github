package FKpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
   public static String getPFdata(String key) throws IOException
   {
	   FileInputStream f=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\FK_Maven\\propertyfile.properties");
	   Properties p=new Properties();
	   p.load(f);
	   String value=p.getProperty(key);
	   return value;
   }
    public static String getTestData(int rowindex,int colindex) throws EncryptedDocumentException, IOException 
    {
    	FileInputStream f=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\FK_Maven\\TestData\\FKData.xlsx");
    	Sheet sh=WorkbookFactory.create(f).getSheet("Sheet1");
    	String value=sh.getRow(rowindex).getCell(colindex).getStringCellValue();
    	return value;
    }
    public static void moveOver(WebDriver driver,WebElement element)
    {
    	//((JavascriptExecutor)driver).executeScript("arguments[0].scollIntoView()",ele2);
    	Actions act=new Actions(driver);
    	act.moveToElement(element).perform();
    }
   public static void captureScreenshot(WebDriver driver,int testcaseId) throws IOException
   {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest=new File("C:\\Users\\shree\\eclipse-workspace\\FK_Maven\\Screenshots\\FKsceenshot"+testcaseId+".jpg");
	  FileHandler.copy(src, dest);
   }
    
}
