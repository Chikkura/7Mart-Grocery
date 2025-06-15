package testscriptforgrocery;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pageclassforgrocery.Homepage;
import pageclassforgrocery.Loginpageclass;
import pageclassforgrocery.Managenews;


public class Managenewstest extends BaseClass {
	Loginpageclass login;
	Homepage home;
	Managenews news;
  @Test
  public void testManageNews() {
	
	  Loginpageclass login = new Loginpageclass(driver);
	  login.loginpage("admin", "admin");
	  home =login.clickSignin();
home.newsmoreinfo();
Managenews news =new Managenews(driver);
news=news.newnews();
news.entertodaysnews().save();


	   
	  boolean isSuccess = news.isDisplayed();
	  Assert.assertTrue(isSuccess, "News not Created Successfully");
  
  }
}