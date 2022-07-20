package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import pages.addTowishListPage;
import pages.productDetailsPage;

public class addToWishListTestCase extends TestBase{

	HomePage homeOBJ;	
	
	// Home >> Search >> Add to wishlist
	
	String productName="Apple MacBook Pro 13-inch";
	SearchPage searchobject;
	productDetailsPage detailsobject;
	addTowishListPage wishlistOBJ;
	
	//1-
	@Test(priority = 1)
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
	
	//2
	@Test(priority = 2)
	public void addtoWishList() throws InterruptedException {
		
		
		//wishlistOBJ = new addTowishListPage(driver);
		detailsobject= new productDetailsPage(driver);
		detailsobject.viewAddtoWishListBtn();
		driver.navigate().to("https://demo.nopcommerce.com"+ "/wishlist");
		wishlistOBJ= new addTowishListPage(driver);
		
	}
	

	//2
	@Test(priority = 3)
	public void RemoveFromWishList() {
		
		
		wishlistOBJ = new addTowishListPage(driver);
		wishlistOBJ.removeProductFromCartwishlist();
		
		Assert.assertTrue(wishlistOBJ.emptyWishList.getText().contains("The wishlist is empty!"));
		
		
	}
	
	
}
