package Module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBEnterMobNumPage2 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobnum;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement pwd;
	
	public PBEnterMobNumPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPBEnterMobNumPage2MobNum(String Mob)
	{
		mobnum.sendKeys(Mob);
	}
	public void clickPBEnterMobNumPage2PWD()
	{
		pwd.click();
	}
	

}
