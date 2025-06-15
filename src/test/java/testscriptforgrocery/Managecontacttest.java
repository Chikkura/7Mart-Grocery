package testscriptforgrocery;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pageclassforgrocery.Homepage;
import pageclassforgrocery.Loginpageclass;
import pageclassforgrocery.Managecontactus;

public class Managecontacttest extends BaseClass{
	Loginpageclass login;
	Homepage home;
	Managecontactus contactus;
  @Test
  public void managecontactus() {
	 /* Managecontactus contact =new Managecontactus(driver);
	  contact.loginpage("admin","admin");
	  contact.clickSignin();
	  contact.moreinfo();
	  contact.editcontactus();
	  contact.addressedit("V.V ROad, TVM");
	  contact.clickonupdate();*/
	  
	  Loginpageclass login = new Loginpageclass(driver);
	  login.loginpage("admin","admin");
	  home = login.clickSignin();
	  home.moreinfo();
	  Managecontactus contact =new Managecontactus(driver);
	  contact.editcontactus().addressedit("V.V ROad, TVM").clickonupdate();
	  
	  
	  
	  
	  boolean isSuccess = contact.isAlertDisplayed();
	 Assert.assertTrue(isSuccess,"Contact Not Updated Successfully"); 
}
}