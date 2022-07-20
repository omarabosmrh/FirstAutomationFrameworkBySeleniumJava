package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;



import data.jsonReader;
import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationWithDDTFileJson extends TestBase {

	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() throws IOException, ParseException {
		
		
		jsonReader jReader = new jsonReader();
		jReader.JsonReader();
			homeopject = new HomePage(driver);
			homeopject.openRegistrationPage();

			registerobject = new UserRegistrationPage(driver);
			registerobject.userRegisteration(jReader.firstname,
					jReader.lastname,jReader.email,jReader.password);
			Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));
			registerobject.userLogout();
			

			homeopject.openLoginPage();
			loginOpject = new loginPage(driver);
			loginOpject.userLogin(jReader.email,jReader.password);
			Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));

			registerobject.userLogout();
			
		}
		
		
		
		
	}

