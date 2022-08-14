package Module_login;

import java.util.ArrayList;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PBProfilePage5 
{
    @FindBy(xpath="//div[@class='sc-ckVGcZ kWpXlQ']")private WebElement profname;
    WebDriver driver1;
    public PBProfilePage5 (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver1=driver;
    }
    public void switchToProfileWindow()
    {
    	Set<String> allIds=driver1.getWindowHandles();
    	ArrayList<String> al=new ArrayList<String>(allIds);
    	driver1.switchTo().window(al.get(1));
    }
    
//    public void verifyPBProfilePage5ProfName(String expText)
//    {
//    	String actText=profname.getText();
//    	
//    			if(actText.equals(expText))
//    			{
//    				System.out.println("Pass");
//    			}
//    			else
//    			{
//    				System.out.println("Fail");
//    			}
//    }
    public String getPBProfilePage5ProfName()
    {
    	String actPN=profname.getText();
    	return actPN;
    }
}

