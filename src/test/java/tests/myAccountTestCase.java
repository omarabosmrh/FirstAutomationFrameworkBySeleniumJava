package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;
import pages.myAccountpage;

public class myAccountTestCase extends TestBase {

	
	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;
	myAccountpage myAccountPbject;
    String oldpassword="12345678";
    String newpassword="123456789";
    String firstname="omar";
    String lastname="abosmrh";
    String email="emailemail3333333333333@email.com";
    
	@Test(priority=1)
	public void userCanRegisterSuccessfully() {

		homeopject = new HomePage(driver);
		homeopject.openRegistrationPage();
		registerobject = new UserRegistrationPage(driver);
		//registerobject.openMyAccountPage();
		registerobject.userRegisteration("omar", "abosmrh", "emaiemail3333333333333@email.com", "12345678");
		Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));

	}
	
	@Test(priority=2)
	public void registeredUserCanChangePassword() {
		
		myAccountPbject =new myAccountpage(driver);
		registerobject.openMyAccountPage();
		myAccountPbject.openChangePassword();
		myAccountPbject.changePassword(oldpassword, newpassword);
		
		//Assert.assertTrue(myAccountPbject.resultLbl.getText().contains("Password was changed"));
	}
	
	@Test(priority=3)
	public void RegisteredUserCanLogout() {
		

		registerobject.userLogout();
	}

	@Test(priority=4)
	public void RegisterUserCanLogin() {

		homeopject.openLoginPage();
		loginOpject = new loginPage(driver);
		loginOpject.userLogin(email, newpassword);
		Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));

	}

	@Test(priority=5)
	public void UserLogout() {
		

		registerobject.userLogout();
	}
	
}
