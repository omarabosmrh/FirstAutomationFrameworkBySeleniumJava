package steps;

import org.junit.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.SearchPage;
import pages.UserRegistrationPage;
import pages.addProductsToShoppingCart;
import pages.addToComparePage;
import pages.checkoutNextElements;
import pages.checkoutPage;
import pages.loginPage;
import pages.productDetailsPage;
import tests.TestBase;

public class End2EndTests  extends TestBase{

	
	
	
	SearchPage searchOBJ;
	addToComparePage productDetailPageOBJ;
	productDetailsPage detailsobject;
//	addProductsToShoppingCart cartPageOBJ;

addProductsToShoppingCart cartOBJ;

	checkoutPage checkoutOBJ;
	checkoutNextElements nextOBJ;
	
	String productName="Apple MacBook Pro 13-inch";
	

	
	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;




	@Given("^the user is on the home page$")
	public void the_user_is_on_the_home_page() throws Throwable{
		
		Assert.assertTrue(driver.getCurrentUrl().contains("demo.nopcommerce.com"));
		homeopject = new HomePage(driver);
    	homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration("omar", "abosmrh", "mac222@test.com", "12345678");
		homeopject.openLoginPage();
		loginOpject = new loginPage(driver);
		loginOpject.userLogin("mac222@test.com", "12345678");
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String productName) throws InterruptedException{
		searchOBJ= new SearchPage(driver);
		searchOBJ.productSearchUsingAutoSuggest(productName);
		
		
		
		
	}

	@When("^choose to buy Two items$")
	public void choose_to_buy_Two_items() throws InterruptedException {
		
		

		detailsobject= new productDetailsPage(driver);
		detailsobject.addToCart();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.nopcommerce.com"+"/cart");
		//Assert.assertTrue(addToCartOBJ.productSubTotal.getText().equals("$3,600.00"));


		
		
	}

	@When("^move to checkout cart and enter personal details on  checkout page and place the order\\.$")
	public void move_to_checkout_cart_and_enter_personal_details_on_checkout_page_and_place_the_order() throws InterruptedException {
		checkoutOBJ = new checkoutPage(driver);
		cartOBJ = new addProductsToShoppingCart(driver);
		cartOBJ.openCheckout(); 
		checkoutOBJ = new checkoutPage(driver);
		checkoutOBJ.completeorder("", "", "","mac bok",
		        "mac street", "cairo", "123456", "03456567888");
	
		//	checkoutOBJ.completeorder("test", "user", "Egypt",
		//		"tesffft@tesst.com", "test address", "12345678", "22222222", "cairo");
	}

	@Then("^he can view the order and download the invoice$")
	public void he_can_view_the_order_and_download_the_invoice() {
		
		
		
	}

}


	

