package Module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage4 
{
  @FindBy(xpath="//span[text()=' My profile ']") private WebElement myprofile;
  
  public PBMyProfilePage4(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void clickPBMyProfilePage4MyProfile()
  {
	  myprofile.click();
  }
}
