package pageclassforgrocery;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutilities;
import utilities.Waitutility;

public class  Managecontactus {
 public WebDriver driver;
 Waitutility waitUtility =new Waitutility();
 Pageutilities pageUtility = new Pageutilities();
 
 public  Managecontactus(WebDriver driver)
 {
	this.driver =driver;
	PageFactory.initElements(driver, this);
	 
 }

 //@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")
 //WebElement clickonmoreinfocontact;//homepage
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")
 WebElement editcontact;
@FindBy(xpath="//textarea[@name='address']")
WebElement editonaddress;
@FindBy(xpath="//input[@id='del_limit']")
WebElement updatedeliverylimit;
@FindBy(xpath="//button[@class='btn btn-block-sm btn-info' and @name='Update']")
WebElement update;
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
WebElement contactUpdateSuccessMsg;




/* public void moreinfo()
 {
	 clickonmoreinfocontact.click();
 }*/
 public Managecontactus editcontactus()
 {
	 editcontact.click();
	 return this;
 }
 public Managecontactus addressedit(String address )
 {
	 editonaddress.clear();
	 editonaddress.sendKeys(address);
	 pageUtility.scrollBy(driver); 
	 return this;
 }
 public Managecontactus clickonupdate()
 {
	 updatedeliverylimit.clear();
	 updatedeliverylimit.sendKeys("100");
	 
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", update);
	return this;
	 
 }
public boolean isAlertDisplayed()
{
	return contactUpdateSuccessMsg.isDisplayed();//webelmnt.method
	
	}
}