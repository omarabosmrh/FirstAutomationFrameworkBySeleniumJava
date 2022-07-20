package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.loadProperities;
import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationUsingDDTandProperitiesFile extends TestBase {

	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;
	
	String fn=loadProperities.userData.getProperty("firstname");
	String ln=loadProperities.userData.getProperty("lastname");
	String em=loadProperities.userData.getProperty("email");
	String pass=loadProperities.userData.getProperty("password");
	

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() {

		homeopject = new HomePage(driver);
		homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration(fn,ln,em,pass);
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
		loginOpject.userLogin(em, pass);
		Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));

	}

}

