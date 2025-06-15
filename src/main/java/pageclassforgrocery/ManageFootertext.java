package pageclassforgrocery;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Waitutility;

public class ManageFootertext {
 public WebDriver driver;
 Waitutility wait = new Waitutility();
 public ManageFootertext(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	
 }
 @FindBy(xpath="//input[@placeholder='Username']")
 WebElement usernamefield;
 @FindBy(xpath="//input[@placeholder='Password']")
 WebElement passwordfield;
 @FindBy(xpath="//button[@class='btn btn-dark btn-block']")
 WebElement signinbutton;
 //@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
 //WebElement clickonmoreinfo;
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1' and @class='btn btn-sm btn btn-primary btncss']")
 WebElement editmanagefooter;
 @FindBy(xpath="//textarea[@id='content']")
 WebElement editaddress;
 //scroll
 @FindBy(xpath="//button[@type='submit' and @class='btn btn-block-sm btn-info']")
 WebElement update;
 @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
 WebElement alertmessage;
 
 

public ManageFootertext loginpage(String username, String password)
{
	usernamefield.sendKeys(username);//check the redirection page
	passwordfield.sendKeys(password);
	return this;
}

public ManageFootertext clickSignin()
{
	signinbutton.click();
return this;
}

/*public void morinfoformanagefooter()
{
	clickonmoreinfo.click();//homepage
}*/ 
public ManageFootertext editfooter() {
	editmanagefooter.click();
	return this;
}

public ManageFootertext addresseditor(String address) {
	
	
	editaddress.sendKeys(address);
	return this;
	
}
public ManageFootertext updatenow() {
	update.click();
	return this;
}
public boolean isDisplayed()
{
	
	return alertmessage.isDisplayed();
}
}