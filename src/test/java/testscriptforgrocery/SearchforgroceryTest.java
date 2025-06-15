package testscriptforgrocery;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageclassforgrocery.Homepage;
import pageclassforgrocery.Loginpageclass;
import pageclassforgrocery.Managenews;
import pageclassforgrocery.Searchgrocerypageclass;

public class SearchforgroceryTest extends BaseClass {
	Loginpageclass login;
	Homepage home;
	Searchgrocerypageclass search;
  @Test
  public void userpswd() {
	  
  
	  
	  Loginpageclass login = new Loginpageclass(driver);
	  login.loginpage("admin", "admin");
	  home = login.clickSignin(); 
	  home.clickAdminInfo();
	  Searchgrocerypageclass search = new Searchgrocerypageclass(driver);
	  search.clickSearchTab().searchgrocery("Chikku", "Admin")  .clickSearchButton();
	  
	 
	  
	 boolean isChikkuDisplayed = search.searchisDisplayed();
	 Assert.assertTrue(isChikkuDisplayed, "Chikku not Displayed");
  }

}