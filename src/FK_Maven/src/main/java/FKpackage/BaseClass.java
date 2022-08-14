package FKpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass 
{
	public WebDriver driver;
	public  void openFKBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\FK_Maven\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
