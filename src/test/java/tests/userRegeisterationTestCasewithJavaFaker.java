package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationTestCasewithJavaFaker extends TestBase {

	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;
	Faker fakeData= new Faker();
	String firstname= fakeData.name().firstName();
    String lastname = fakeData.name().lastName();
    String email= fakeData.internet().emailAddress();
    String password= fakeData.number().digits(8).toString();
    
    
	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() {

		homeopject = new HomePage(driver);
		homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration(firstname,lastname,email,password);
		Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));
		registerobject.userLogout();
		homeopject.openLoginPage();
		loginOpject = new loginPage(driver);
		loginOpject.userLogin(email,password);
		Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));		
		registerobject.userLogout();
	}

}