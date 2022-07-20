package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductReviewPage;
import pages.SearchPage;
import pages.UserRegistrationPage;
import pages.loginPage;
import pages.productDetailsPage;

public class AddProductReviewTestCase extends TestBase {

	
	
	//1- home page >> Reg >> >> search >> add review
	
	
	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;

	String productName="Apple MacBook Pro 13-inch";
	SearchPage searchobject;
	productDetailsPage detailsobject;
	
	ProductReviewPage productReviewOBj;
	
	// 1
	@Test(priority = 0)
	public void userCanRegisterSuccessfully() {

		homeopject = new HomePage(driver);
		homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration("omar", "abosmrh", "omaromar012@gmail.com", "12345678");
		Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));

	}
	
	
	//2
	


	
	//3
	
	
	
	@Test(priority = 2)
	public void userCanSearchWithAutoSuggest() throws InterruptedException {
		try {
		searchobject= new SearchPage(driver);
		searchobject.productSearchUsingAutoSuggest("macb");
		detailsobject=new productDetailsPage(driver);
		Assert.assertTrue(detailsobject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsobject.productNamebreadCrumb.getText(), productName);
		}
		catch(Exception e)
		{
			System.out.println("Error Ocuured"+e.getMessage());
			
		}	
		
	}
	
	
	//4
	
	@Test(priority = 3)
	public void addReview() {
		
		homeopject = new HomePage(driver);
		detailsobject= new productDetailsPage(driver);
		detailsobject.clickReviewLink();
		productReviewOBj = new ProductReviewPage(driver);
		productReviewOBj.addReview("mac book", "apple");		
	Assert.assertTrue(productReviewOBj.resultTXT.getText().contains("Product review is successfully added"));
	System.out.println(productReviewOBj.resultTXT.getText());
	}
	
	
}
