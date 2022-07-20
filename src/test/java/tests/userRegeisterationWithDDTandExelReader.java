package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationWithDDTandExelReader extends TestBase {

	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;
	
	@DataProvider(name="ExcelData")
	public Object [] [] userRegisterData() throws IOException{
		//get data from excel
		ExcelReader er= new ExcelReader();
			return er.getExelData();
		
	}
	

	@Test(priority = 1, alwaysRun = true, dataProvider = "ExcelData")
	public void userCanRegisterSuccessfully(String firstname,String lastname ,String email ,String password) {

		homeopject = new HomePage(driver);
		homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration(firstname,lastname ,email , password);
		Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));
// logout
		registerobject.userLogout();

// login again
		homeopject.openLoginPage();
		loginOpject = new loginPage(driver);
		loginOpject.userLogin(email,password);
		Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));
		// logout
				registerobject.userLogout();
	
	}

}
