package Module_LoginTest;

import java.io.IOException;
import org.testng.Assert;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module_login.PBEnterMobNumPage2;
import Module_login.PBEnterPwdPage3;
import Module_login.PBLoginPage1;
import Module_login.PBMyProfilePage4;
import Module_login.PBProfilePage5;


public class PBLoginTest_Base_Utility_screenshot extends BaseClass
{
	
	Sheet sh;
	PBLoginPage1 login;
	PBMyProfilePage4 myprof;
	PBEnterMobNumPage2 mob;
	PBEnterPwdPage3 pwd;
	PBProfilePage5 prof;
	int TCID;
	 @BeforeClass
	 public void openBrowser() throws EncryptedDocumentException, IOException
	 {
       
	    initializeBrowser();
		login=new PBLoginPage1(driver);
		mob=new PBEnterMobNumPage2(driver);
		pwd=new PBEnterPwdPage3(driver);
		myprof=new PBMyProfilePage4 (driver);
		prof= new PBProfilePage5(driver);
	 }
	 @BeforeMethod
	 public void login() throws InterruptedException, EncryptedDocumentException, IOException
	 {
		TCID=102;
		login.clickPBLoginPage1SignIN();
		mob.setPBEnterMobNumPage2MobNum(UtilityClass.getPFData("MobNum"));
		mob.clickPBEnterMobNumPage2PWD();
		pwd.setPBEnterPwdPage3PWD(UtilityClass.getPFData("Pwd"));
		pwd.clickPBEnterPwdPage3SignIn();
		Thread.sleep(2000);
	 }
	 @Test
	 public void verifyPN() throws EncryptedDocumentException, IOException
	 {
	
		login.mouseoverPBLoginPage1UserIcon();	
		myprof.clickPBMyProfilePage4MyProfile();
		//Thread.sleep(2000);
		prof.switchToProfileWindow();
		String actPN=prof.getPBProfilePage5ProfName();
		String expPN=UtilityClass.getTD(0,1);
		//prof.verifyPBProfilePage5ProfName(sh.getRow(0).getCell(2).getStringCellValue());
	    Assert.assertEquals(actPN,expPN,"Failure:Profile Name not matching");
	 }
	 @AfterMethod
	 public void logout(ITestResult result) throws IOException
	 {
		 if(result.getStatus()==ITestResult.FAILURE)
		 {
			 UtilityClass.screenshot(driver, TCID);
		 }
	 }
	 @AfterClass
	 public void closeBrowser() throws InterruptedException
	 {
		Thread.sleep(4000);
		driver.quit();
	 }
}
