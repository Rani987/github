package FKpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFk 
{
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")private WebElement Mob;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")private WebElement pass;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement log;
	
	public LoginFk(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLoginFkMob() throws IOException
	{
		Mob.sendKeys(UtilityClass.getPFdata("MobNum"));
	}
	
	public void setLoginFkPass() throws IOException
	{
		pass.sendKeys(UtilityClass.getPFdata("pwd"));
	}
	
	public void clickLoginFkLog() throws IOException
	{
		log.click();
	}
}
