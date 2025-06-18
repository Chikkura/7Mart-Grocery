package pageclassforgrocery;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Pageutilities;
import utilities.Waitutility;

public class Manageproduct112 {
	public WebDriver driver;
	Pageutilities page = new Pageutilities();
	Waitutility wait = new Waitutility();

	public Manageproduct112(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add' and @onclick='click_button(1)']")
	WebElement new112;
	@FindBy(xpath = "//input[@id='title']")
	WebElement title;
	@FindBy(xpath = "//input[@value='Veg' and @checked='checked']")
	WebElement producttype;
	@FindBy(xpath = "//select[@id='cat_id']")
	WebElement category;
	@FindBy(xpath = "//select[@id='sub_id']")
	WebElement subcategory;
	@FindBy(xpath = "//input[@id='purpose1']")
	WebElement pricetype;
	@FindBy(xpath = "//input[@id='m_weight']")
	WebElement weightvalue;
	@FindBy(xpath = "//select[@id='w_unit']")
	WebElement weightunit;
	@FindBy(xpath = "//input[@id='max_weight']")
	WebElement maxqty;
	@FindBy(xpath = "//input[@id='w_price']")
	WebElement price;
	@FindBy(xpath = "//input[@id='w_stock']")
	WebElement stockavail;
	@FindBy(xpath = "//input[@type='radio' and @value='yes' and @name='stock' and @checked='checked']")
	WebElement stockYesRadioButton;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement imagechosen;
	@FindBy(xpath = "//input[@type='radio' and @value='yes' and @name='featured']")
	WebElement featured;
	@FindBy(xpath = "//input[@type='radio' and @value='no' and @name='combo']")
	WebElement combopack;
	@FindBy(xpath = "//button[@type='submit' and @name='create' and text()='Save']")
	WebElement saveButton112;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alert;

	public Manageproduct112 new112() {

		new112.click();
		return this;
	}

	public Manageproduct112 title() {
		title.sendKeys("Vegetables");
		return this;
	}

	public Manageproduct112 categories() {
		category.click();
		subcategory.click();
		return this;

	}

	public Manageproduct112 weightdetails() {
		weightvalue.sendKeys("2");
		Select unit = new Select(weightunit);
		unit.selectByVisibleText("kg");
		maxqty.sendKeys("4");
		return this;
	}

	public Manageproduct112 pricedetails() {
		price.sendKeys("80");
		stockavail.sendKeys("yes");
		return this;
	}

	public Manageproduct112 save() {
		page.scrollBy(driver);
		JavascriptExecutor scriptExecuter = (JavascriptExecutor) driver;
		scriptExecuter.executeScript("window.scrollBy(0,2000)", "");
		wait.waitforelmenttoClick(driver, saveButton112);
		scriptExecuter.executeScript("arguments[0].click();", saveButton112);
		saveButton112.click();
		return this;
	}

	public boolean isAlertDisplayed() {

		return alert.isDisplayed();
	}
}
