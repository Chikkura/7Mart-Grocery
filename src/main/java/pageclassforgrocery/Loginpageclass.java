package pageclassforgrocery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageclass {
public WebDriver driver;
public Loginpageclass(WebDriver driver)
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
@FindBy(xpath="//li[text()='Dashboard']")
WebElement dashboard;
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
WebElement alert;


public Loginpageclass loginpage(String username, String password)
{
	usernamefield.sendKeys(username);//check the redirection page
	passwordfield.sendKeys(password);
		return this;
}

public Homepage clickSignin()//check the redirection 
{
	signinbutton.click();
	return new Homepage(driver);//its directed to Homepage
}
 public boolean isDashboardDisplayed()
 {
	 
	 return dashboard.isDisplayed();
 }
public boolean isAlertisDisplayed()
{
	return alert.isDisplayed();
}
}