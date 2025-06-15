package pageclassforgrocery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Waitutility;

public class Homepage {
	
		public WebDriver driver;
		Waitutility wait =new Waitutility();
		public Homepage(WebDriver driver)
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
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
		WebElement clickoninfo;//this is the adminpage clickon infoo xpath
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")
		WebElement clickonmoreinfonews;//this is the managenews xpath
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")
		 WebElement clickonmoreinfo;//this is for managefooter
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")
		 WebElement clickonmoreinfocontact;//managecontact
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product' and @class='small-box-footer'] ")
		WebElement manageproduct112;

		public Homepage loginpage(String username, String password)
		{
			usernamefield.sendKeys(username);
			passwordfield.sendKeys(password);
			wait.waitforelmenttoClick(driver, signinbutton);
			signinbutton.click();
			return this;
			
		 }
		
		@FindBy(xpath="//a[@class='nav-link' and @data-toggle='dropdown']")
		WebElement clickonusername;
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']")
		WebElement clickonlogout;
		
		public Homepage homepage()
		{
			clickonusername.click(); 
			wait.waitforelmenttoClick(driver, clickonlogout);
			clickonlogout.click();
			return this;
		}
		
		public Adminuserandcreationofadminpage clickonuser() {
			  clickoninfo.click();
					  return new Adminuserandcreationofadminpage(driver);
		  }
		
		
	    public Searchgrocerypageclass clickAdminInfo() {
	        clickoninfo.click();
	        return new Searchgrocerypageclass(driver);
	    }
		
	    public Managenews newsmoreinfo()
		{
			clickonmoreinfonews.click();
			return new Managenews(driver);
		}
	    public ManageFootertext morinfoformanagefooter()
	    {
	    	clickonmoreinfo.click();
	    	return new ManageFootertext(driver);
	    }
	    
	    public Managecontactus moreinfo()
	    {
	   	 clickonmoreinfocontact.click();
	   	 return new Managecontactus(driver);
	    }

		public Manageproduct112 mangeproduct112() {
			manageproduct112.click();
			 return new Manageproduct112(driver);
		}
		}