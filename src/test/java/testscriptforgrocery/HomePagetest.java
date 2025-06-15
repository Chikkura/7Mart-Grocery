package testscriptforgrocery;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pageclassforgrocery.Homepage;
import pageclassforgrocery.Loginpageclass;

public class HomePagetest extends BaseClass {
 
 Homepage home;
  
	 /*public void verifyloginforgrocery() {
	 Homepage loginandlogout =new Homepage(driver);
	  loginandlogout.loginpage("admin", "admin");
	  loginandlogout.homepage();
	 System.out.println(driver.getTitle());*/
 

	 @Test
	 
	 public void verifyloginforgrocery() {
		    home= new Homepage(driver);
		  
		   home.loginpage("admin", "admin").homepage();

		    String expectedTitle = "Login | 7rmart supermarket";
		    String actualTitle = driver.getTitle();
		    Assert.assertEquals(actualTitle, expectedTitle, Constant.ERRORMESSAGE2);
		}
}