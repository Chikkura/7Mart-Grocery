package pageclassforgrocery;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.Select;

import utilities.Waitutility;

public class Searchgrocerypageclass {
	public WebDriver driver;
	Waitutility wait = new Waitutility();

	public Searchgrocerypageclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement clickoninfo; // THIS IS HOMEPAGE REDIRECTION
	@FindBy(xpath = "//a[@onclick=\'click_button(2)']")
	WebElement search;
	@FindBy(xpath = "//input[@id='un']")
	WebElement nameofuser;
	@FindBy(xpath = "//select[@id='ut']")
	WebElement typeofuser;
	@FindBy(xpath = "//button[@value='sr']")
	WebElement microsearch;
	@FindBy(xpath = "//td[text()='Chikku']")
	WebElement searchadmin;

	public void clickAdminInfo() {
		clickoninfo.click();
	}

	public Searchgrocerypageclass clickSearchTab() {
		wait.waitforelmenttoClick(driver, search); // Wait first
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", search); // Then click
		return this;
	}

	public Searchgrocerypageclass searchgrocery(String searchuser, String searchtype) {

		nameofuser.sendKeys(searchuser);
		Select dropdown = new Select(typeofuser);
		dropdown.selectByVisibleText(searchtype);

		return this;
	}

	public Searchgrocerypageclass clickSearchButton() {
		microsearch.click();
		return this;
	}

	public boolean searchisDisplayed() {
		return searchadmin.isDisplayed();
	}

}