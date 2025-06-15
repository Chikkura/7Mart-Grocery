package testscriptforgrocery;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constant.Constant;
import pageclassforgrocery.Homepage;
import pageclassforgrocery.Loginpageclass;

@Test
public class Logintestgrocery extends BaseClass {
	Homepage home;
	@Test
	public void verifyloginforgrocery() {
		Loginpageclass login = new Loginpageclass(driver);
		login.loginpage("admin", "admin");
		home=login.clickSignin();
		boolean dashboardisLoaded = login.isDashboardDisplayed();
		Assert.assertTrue(dashboardisLoaded, Constant.ERRORMESSAGE);

	}

	@Test(dataProvider = "credentials")
	public void wronguserandcrctpassword(String username, String password) {
		Loginpageclass login = new Loginpageclass(driver);
		login.loginpage(username, password);
		home = login.clickSignin();
	}

	@Test
	@Parameters({ "username", "password" })
	public void crctusernadwrongpswd(String userName, String Password)

	{
		Loginpageclass login = new Loginpageclass(driver);
		login.loginpage(userName, Password);
		home = login.clickSignin();
	}

	@Test
	public void wrngusernadwrongpswd() {
		Loginpageclass login = new Loginpageclass(driver);
		login.loginpage("chikku", "admin123");
		home = login.clickSignin();
		boolean alertIsDisplayed = login.isAlertisDisplayed();
		Assert.assertTrue(alertIsDisplayed, Constant.ERRORMESSAGE1);
	}

	@DataProvider(name = "credentials")
	public Object[][] testData() {
		Object data[][] = { { "admin", "admin" }, { "admin", "admin" }, { "admin", "123" } };
		return data;

	}

}