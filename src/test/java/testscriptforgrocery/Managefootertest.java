package testscriptforgrocery;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import pageclassforgrocery.Homepage;
import pageclassforgrocery.ManageFootertext;

public class Managefootertest extends BaseClass {
	Homepage home;
	ManageFootertext footer;
  @Test
  public void managefooter() {
	  
	  
	  home =new Homepage(driver);
	  home.loginpage("admin", "admin").morinfoformanagefooter();
	  ManageFootertext footer = new ManageFootertext(driver);
	  footer.editfooter().addresseditor("TVM").updatenow();
	  boolean isFooterTextUpdatedSuccessfully = footer.isDisplayed();
	  Assert.assertTrue(isFooterTextUpdatedSuccessfully, "Footer not updated successfully");
  }
}