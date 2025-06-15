package pageclassforgrocery;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Waitutility;

public class Managecategory {
	public WebDriver driver;
	Waitutility waitutility =new Waitutility();
	
	public Managecategory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	/*@FindBy(xpath="//input[@placeholder='Username']")
	WebElement usernamefield;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordfield;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	WebElement signinbutton;*/
	
	
	//@FindBy(xpath="//p[text()='Manage Category']")
	//WebElement clickmanagecategory;
	
	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and contains(@class, 'small-box-footer')]")


	//WebElement clickonmoreInfo;

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement clickonnewcategory;
	@FindBy(xpath="//input[@type='text'and @id='category']")
	WebElement entercategory;
	@FindBy(xpath="//li[@id='134-selectable']")
	WebElement clickonSelectGroups;
	@FindBy(xpath="//input[@id='main_img' and @type='file']")
	WebElement clickonchooseFile;
	@FindBy(xpath="//input[@type='radio' and @value='yes' and @name='top_menu' and @checked='checked']")
	WebElement clickontopmenu;
	@FindBy(xpath="//button[@type='submit' and @name='create']")
	WebElement clickonsave;
	
	
	/* public void managecategory() {
		 clickmanagecategory.click();
	 }
	 public void moreinfo() {
		// waitutility.waitforelmenttoClick(driver, clickonmoreInfo);
		 clickonmoreInfo.click();
	 }*/
	
	 public Managecategory clickOnNewCategory() {
		// waitutility.waitforelmenttoClick(driver, clickonnewcategory);

		    /*JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", clickonnewcategory); 
		    js.executeScript("arguments[0].click();", clickonnewcategory);*/
		 clickonnewcategory.click();
		    return this;
		}

	 public Managecategory entercategory() {
		
		 entercategory.sendKeys("vegetables");
		 return this;
	 }
	
	public Managecategory selectgroups()
	{
		clickonSelectGroups.click();
		return this;
	}
	
	public Managecategory choosefileandtopmenu() {
		clickonchooseFile.sendKeys("C:\\Users\\Chikku\\Downloads\\Resume.pdf");

		 clickontopmenu.click();
		 return this;
	}
	
public Managecategory nowsave() {
	clickonsave.click();
	return this;
}
}
