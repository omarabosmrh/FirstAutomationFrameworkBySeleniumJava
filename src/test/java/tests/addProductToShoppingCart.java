package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;
import pages.addProductsToShoppingCart;
import pages.productDetailsPage;

public class addProductToShoppingCart  extends TestBase{

	
	
	String productName="Apple MacBook Pro 13-inch";
	SearchPage searchobject;
	productDetailsPage detailsobject;
	addProductsToShoppingCart addToCartOBJ;
	
	
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

	
	@Test(priority = 2)
	public void addToCart() throws InterruptedException {
		
		detailsobject= new productDetailsPage(driver);
		detailsobject.addToCart();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.nopcommerce.com"+"/cart");
		//Assert.assertTrue(addToCartOBJ.productSubTotal.getText().equals("$3,600.00"));
		
		
	}
	
	@Test(priority = 3)
public void updatrQuntatityCart() throws InterruptedException {
	
		addToCartOBJ= new addProductsToShoppingCart(driver);
		addToCartOBJ.updateProductQuntatity("4");
		//Assert.assertTrue(addToCartOBJ.productSubTotal.getText().contains("$7,200.00"));
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority = 4)
	public void RemoveFromoCart() throws InterruptedException {
		
		addToCartOBJ= new addProductsToShoppingCart(driver);
		addToCartOBJ.removeItemFromCart();
		Thread.sleep(3000);
		
		
	}
	

}
