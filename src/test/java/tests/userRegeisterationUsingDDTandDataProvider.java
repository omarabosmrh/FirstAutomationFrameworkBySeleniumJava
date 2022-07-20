package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationUsingDDTandDataProvider extends TestBase {

	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;

	@DataProvider(name = "testData")
	public static Object[][] userData() {

		return new Object[][] { { "omar", "smrh", "omarsmrh4@gmail.com", "12345678" },

				{ "omar1", "smrh1", "omarsmrh5@gmail.com", "12345679" } };
	}

	@Test(priority = 1, alwaysRun = true , dataProvider = "testData")
	public void userCanRegisterSuccessfully(String Fname, String Lname, String Email, String Password) {

		homeopject = new HomePage(driver);
		homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		//registerobject.userRegisteration("omar", "abosmrh", "omaromar@gmail.com", "12345678");
		registerobject.userRegisteration(Fname , Lname, Email,Password);
		Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));
		registerobject.userLogout();
		homeopject.openLoginPage();
		loginOpject = new loginPage(driver);
		loginOpject.userLogin(Email, Password);
		Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));
		registerobject.userLogout();
	}

}
