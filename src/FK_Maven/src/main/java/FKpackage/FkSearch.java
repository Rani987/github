package FKpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FkSearch 
{
 @FindBy(xpath="//input[@class='_3704LK']") private WebElement search;
 @FindBy(xpath="//button[@class='L0Z3Pu']") private WebElement searchbutton;
 @FindBy(xpath="((//div[@class='_2kHMtA'])[1]//span)[3]")private WebElement star;
 @FindBy(xpath="(//div[text()='₹19,790'])[1]")private WebElement prize;
 
 WebDriver driver1;
 public FkSearch(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	 driver1=driver;
 }
 
 public void setFkSearchSearch() throws EncryptedDocumentException, IOException
 {
	 search.sendKeys(UtilityClass.getTestData(0,0));
 }
 public void clickFkSearchButton()
 {
	 searchbutton.click();
 }
 public void moveOverFkStar()
 {
	 UtilityClass.moveOver(driver1, star);
 }
 public String getFKMobPrize()
 {
	 String value=prize.getText();
	 return value;
 }
}
