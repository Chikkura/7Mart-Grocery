package testscriptforgrocery;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pageclassforgrocery.Homepage;
import pageclassforgrocery.Loginpageclass;
import pageclassforgrocery.Manageproduct112;
import utilities.ExcelUtility;

public class Manageproduct112test extends BaseClass{

	Loginpageclass login;
	Homepage home;
	Manageproduct112 manage;
	
	
	@Test(retryAnalyzer = retry.Retry.class)
  
  public void mange112() throws IOException {
	  Loginpageclass login =new Loginpageclass(driver);
	  
	  String username = ExcelUtility.readStringData(1, 0 , "LoginPageTest");
		String password = ExcelUtility.readStringData(1, 1 , "LoginPageTest");

		login.loginpage(username, password);
	 
	  
	  
	  
	  home = login.clickSignin();
	  manage = home.mangeproduct112();
	
	  manage.new112().title().categories().weightdetails().pricedetails().save();
	  boolean isAlertsuccess=manage.isAlertDisplayed();
	 		Assert.assertTrue(isAlertsuccess, Constant.ERRORMESSAGE);
	
	  
  }
}
