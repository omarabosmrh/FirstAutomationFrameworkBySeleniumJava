package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class userRegeistration  extends TestBase{


	HomePage homepageOBJ;
	UserRegistrationPage RegOBJ;



	@Given("^the user in the home page$")
	public void the_user_in_the_home_page() {

		homepageOBJ= new HomePage(driver);
		homepageOBJ.openRegistrationPage();

	}

	@When("^i click on register link$")
	public void i_click_on_register_link(){
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
	}

//
//	@When("^i entered user data$")
//	public void i_entered_user_data(){
//		RegOBJ= new UserRegistrationPage(driver);
//		RegOBJ.userRegisteration("omar", "gomaa", "omaaaar@gmail.com", "12345678");
//
//	}
	
	@When("^i entered \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_entered(String firstname, String lastname, String email, String password) {
		RegOBJ= new UserRegistrationPage(driver);
		RegOBJ.userRegisteration(firstname,lastname,email,password); 
	}


	@Then("^the registeration page displayed successfully$")
	public void the_registeration_page_displayed_successfully(){
		RegOBJ.userLogout();

	}

}
