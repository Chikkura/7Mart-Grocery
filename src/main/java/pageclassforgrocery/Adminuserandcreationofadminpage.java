package pageclassforgrocery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Pageutilities;
import utilities.Waitutility;

public class Adminuserandcreationofadminpage {
	public WebDriver driver;
	Waitutility waitUtility =new Waitutility();
	Pageutilities pageUtility = new Pageutilities();
	public Adminuserandcreationofadminpage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement usernamefield;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordfield;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	WebElement signinbutton;
//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
//WebElement clickoninfo;(this is cut and paste to homepage
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
WebElement clickonnew;
@FindBy(xpath="//input[@id='username']")
WebElement enterusername;
@FindBy(xpath="//input[@id='password']")
WebElement enterpassword;
@FindBy(xpath="//select[@id='user_type']")
WebElement userType;
@FindBy(xpath="//button[@name='Create']")
WebElement saveButton;
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
WebElement alert;



public Adminuserandcreationofadminpage loginpage(String username, String password)
{
	usernamefield.sendKeys(username);
	passwordfield.sendKeys(password);
	waitUtility.waitforelmenttoClick(driver, signinbutton);
	signinbutton.click();
	return this;
}
  /*public Adminuserandcreationofadminpage  clickonuser() {
	  clickoninfo.click();
	  clickonnew.click();
	  return this;
  }*/ //CUT AND PASTE TO HOMEPAGE
  
  public Adminuserandcreationofadminpage  clickonnewuser() {
	 
	  clickonnew.click();
	  return this;
  }
 public Adminuserandcreationofadminpage newUserCreation(String user,String pasword, String newUserType) {
	 enterusername.sendKeys(user);
	 enterpassword.sendKeys(pasword);
	 pageUtility.selectByvisibleText(userType, newUserType);
     waitUtility.waitforelmenttoClick(driver, saveButton);
     saveButton.click();
     return this;
 }

public boolean adminisDisplayed()
{
return alert.isDisplayed();
}
}