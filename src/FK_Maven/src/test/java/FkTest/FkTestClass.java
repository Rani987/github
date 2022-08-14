package FkTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FKpackage.BaseClass;
import FKpackage.FkSearch;
import FKpackage.LoginFk;
import FKpackage.UtilityClass;

public class FkTestClass extends BaseClass
{
	LoginFk login;
	FkSearch sear;
	int testcaseid;
	@BeforeClass
	public void initializeFk() throws IOException, InterruptedException
	{
		openFKBrowser();
		login=new LoginFk(driver);
		sear=new FkSearch(driver);
		testcaseid=100;
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		login.setLoginFkMob();
		login.setLoginFkPass();
		login.clickLoginFkLog();
		sear.setFkSearchSearch();
		sear.clickFkSearchButton();
		Thread.sleep(3000);
	}
	@Test
	public void rating() throws InterruptedException, IOException
	{
		sear.moveOverFkStar();
		Thread.sleep(3000);
		UtilityClass.captureScreenshot(driver, testcaseid);
		String actprize=sear.getFKMobPrize();
		String expprize=UtilityClass.getTestData(0, 1);
		Assert.assertEquals(actprize, expprize);
	}
	@AfterMethod
	public void logOut()
	{
		
	}
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
	
}
