package tests;


import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


import pages.HomePage;
import pages.UserRegistrationPage;
import pages.loginPage;

public class userRegeisterationWithDDTCSVFile extends TestBase {

	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;
	CSVReader reader;

	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() throws CsvValidationException, IOException {

		

		String csv_file = System.getProperty("user.dir")+
				"/src/test/java/data/ecommerseUserData.csv";
		reader = new CSVReader(new FileReader(csv_file));
		String [] csvCell;
		while((csvCell= reader.readNext())!= null) {
			
			String firstName= csvCell[0]; 
			String lastName= csvCell[1];
			String email= csvCell[2];
			String password= csvCell[3];
			homeopject = new HomePage(driver);
			homeopject.openRegistrationPage();

			registerobject = new UserRegistrationPage(driver);
			registerobject.userRegisteration(firstName, lastName,email,password);
			Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));
			registerobject.userLogout();
			

			homeopject.openLoginPage();
			loginOpject = new loginPage(driver);
			loginOpject.userLogin(email, password);
			Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));

			registerobject.userLogout();
			
		}
		
		
		
		
	}



}
