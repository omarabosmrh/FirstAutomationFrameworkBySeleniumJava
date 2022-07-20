package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationTestCase extends TestBase {

	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() {

		homeopject = new HomePage(driver);
		homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration("omar", "abosmrh", "omaromar@gmail.com", "12345678");
		Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));

	}

	@Test(dependsOnMethods = ("userCanRegisterSuccessfully"))

	public void RegisteredUserCanLogout() {

		registerobject.userLogout();

	}

	@Test(dependsOnMethods = ("RegisteredUserCanLogout"))
	public void RegisterUserCanLogin() {

		homeopject.openLoginPage();
		loginOpject = new loginPage(driver);
		loginOpject.userLogin("omaromar@gmail.com", "12345678");
		Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));

	}

}
