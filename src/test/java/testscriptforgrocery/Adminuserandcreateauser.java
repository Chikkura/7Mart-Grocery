package testscriptforgrocery;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pageclassforgrocery.Adminuserandcreationofadminpage;
import pageclassforgrocery.Homepage;

public class Adminuserandcreateauser extends BaseClass {
	Homepage home;
	Adminuserandcreationofadminpage admin;
	
	
  @Test
  public void creationofadmin() {
	  
	/*Adminuserandcreationofadminpage admin =new Adminuserandcreationofadminpage(driver);
	  admin.loginpage("admin", "admin");
	  admin.clickonuser(); 
	  admin.clickonnewuser();
	  admin.newusercreation("Chikku", "Chikku@123","Admin");*/
	  home = new Homepage(driver);
      home.loginpage("admin", "admin").clickonuser();
      

      
      admin = new Adminuserandcreationofadminpage(driver);
	
	  admin
      .clickonnewuser()
      .newUserCreation("Chikku", "Chikku@123", "Admin");
	  boolean Chikku = admin.adminisDisplayed();
	  Assert.assertTrue(Chikku, Constant.ERRORMESSAGE3);
  }
 
  
}