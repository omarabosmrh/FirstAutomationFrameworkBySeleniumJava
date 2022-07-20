package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import pages.UserRegistrationPage;
import pages.addProductsToShoppingCart;
import pages.checkoutNextElements;
import pages.checkoutPage;
import pages.loginPage;
import pages.productDetailsPage;

public class checkoutTestCase extends TestBase {

	// reg >> search >> ad to cart >> checkout .
	
	
	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;
	String productName="Apple MacBook Pro 13-inch";
	SearchPage searchobject;
    productDetailsPage detailsobject;
    addProductsToShoppingCart cartOBJ;
    checkoutPage checkoutOBJ;
    checkoutNextElements nextOBJ;
    
   
    
    
    @Test(priority = 1)
	public void userCanRegisterSuccessfully() {

    	homeopject = new HomePage(driver);
    	homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration("omar", "abosmrh", "mac222@test.com", "12345678");
	//	Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));

	}
    
    
    @Test(priority = 2)
	public void RegisterUserCanLogin() {

		homeopject.openLoginPage();
		loginOpject = new loginPage(driver);
		loginOpject.userLogin("mac222@test.com", "12345678");
		//Assert.assertTrue(registerobject.logoutLink.getText().contains("Log out"));

	}

    
    
	
	
	@Test(priority = 3)
	public void userCanSearchWithAutoSuggest() throws InterruptedException {
		try {
		searchobject= new SearchPage(driver);
		searchobject.productSearchUsingAutoSuggest("macb");
		detailsobject=new productDetailsPage(driver);
		//Assert.assertTrue(detailsobject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsobject.productNamebreadCrumb.getText(), productName);
		}
		catch(Exception e)
		{
			System.out.println("Error Ocuured"+e.getMessage());
			
		}	
		
	} 
  
	@Test(priority = 4)
	public void checkout() throws InterruptedException {
		
		
	
		// productDetailsPage detailsobject;
		 //   addProductToShoppingCart cartOBJ;
		  //  checkoutPage checkoutOBJ;
		
		
		
		detailsobject.addToCart();
		driver.navigate().to("https://demo.nopcommerce.com"+"/cart");
		cartOBJ = new addProductsToShoppingCart(driver);
		cartOBJ.openCheckout(); 
		checkoutOBJ = new checkoutPage(driver);
		checkoutOBJ.completeorder("", "", "","mac bok",
                "mac street", "cairo", "123456", "03456567888");
		
			
	}
	
	
	
}
