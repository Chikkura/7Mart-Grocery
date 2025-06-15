package testscriptforgrocery;

import org.testng.annotations.Test;

import pageclassforgrocery.Homepage;
import pageclassforgrocery.Loginpageclass;
import pageclassforgrocery.Managecategory;

public class Managecategorytest extends BaseClass  {
	Loginpageclass login;
	Homepage home;
	Managecategory category;
	
  @Test
  public void loginforgroceryapp() {
	
	  Loginpageclass login = new Loginpageclass(driver);
	  login.loginpage("admin", "admin");
	  home =login.clickSignin();
	 // home.managecategory();
	  //home.moreinfooncategory();
	  category.clickOnNewCategory();
	  category.entercategory();
	  category.selectgroups();
	  category.choosefileandtopmenu();
	  category.nowsave();
  }
}
