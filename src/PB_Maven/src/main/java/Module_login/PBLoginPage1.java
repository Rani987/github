package Module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage1
{
	@FindBy(xpath="//a[@class='sign-in']") private WebElement signin;
	@FindBy(xpath="//div[text()='My Account']") private WebElement myacc;
	WebDriver driver1;
	public PBLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void clickPBLoginPage1SignIN()
	{
		signin.click();
	}
	public void mouseoverPBLoginPage1UserIcon()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(myacc).perform();
	}
}

