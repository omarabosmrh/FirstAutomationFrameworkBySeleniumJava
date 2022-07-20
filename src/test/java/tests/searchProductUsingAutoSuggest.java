package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;
import pages.productDetailsPage;

public class searchProductUsingAutoSuggest extends TestBase{

	
	String productName="Apple MacBook Pro 13-inch";
	SearchPage searchobject;
	productDetailsPage detailsobject;
	
	@Test
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
}
