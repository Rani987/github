package Module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBEnterPwdPage3 
{
 @FindBy(xpath="//input[@name='password']")private WebElement pwd;
 @FindBy(xpath="//span[text()='Sign in']")private WebElement signin;
 
 public PBEnterPwdPage3 (WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void setPBEnterPwdPage3PWD(String password)
 {
	 pwd.sendKeys(password);
 }
 public void clickPBEnterPwdPage3SignIn()
 {
	 signin.click();
 }
 
}
