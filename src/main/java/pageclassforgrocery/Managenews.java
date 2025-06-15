package pageclassforgrocery;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Waitutility;

public class Managenews {
 WebDriver driver;
 Waitutility wait = new Waitutility();
  public Managenews(WebDriver driver)
  {
	 this.driver =driver;
	 PageFactory.initElements(driver, this);
	  
  }
 /* @FindBy(xpath="//input[@placeholder='Username']")
	WebElement usernamefield;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordfield;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	WebElement signinbutton;*/
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
	//WebElement clickonmoreinfonews;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger' and @href='https://groceryapp.uniqassosiates.com/admin/news/add']")
	WebElement clickonnew;
	@FindBy(xpath="//textarea[@id='news']")
	WebElement enterthenews;
	@FindBy(xpath="//button[@type='submit' and @name='create']")
	WebElement clickonsavebutton;
	@FindBy(xpath = "//div[contains(@class,'alert-success')]")
	WebElement successAlert;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement successMessage;
	
	/*public Managenews loginpage(String username, String password)
	{
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		return this;
	}

	public Managenews clickSignin()
	{
		signinbutton.click();
		return this;
	}*/
	
	
	
	public  Managenews newnews()
	{
		wait.waitforelmenttoClick(driver, clickonnew);
		clickonnew.click();
		return this;
	}
	
  public Managenews entertodaysnews()
  {
	  enterthenews.sendKeys("Breaking news-ImportantUpdate-28th May");
	  return this;
  }
  public Managenews save() {
	  clickonsavebutton.click();
	  return this;
  }
  public boolean isDisplayed()
  {
	  
	  return successMessage.isDisplayed();
  }
}


