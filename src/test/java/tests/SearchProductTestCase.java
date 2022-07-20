package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;
import pages.productDetailsPage;

public class SearchProductTestCase  extends TestBase{

	
	String productName="Apple MacBook Pro 13-inch";
	SearchPage searchobject;
	productDetailsPage detailsobject;
	
	@Test
	public void userCanSearchForProducts() {
		searchobject= new SearchPage(driver);
		detailsobject= new productDetailsPage(driver);
		searchobject.productSearch(productName);
		searchobject.openProductDetailsPage();
		Assert.assertTrue(detailsobject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsobject.productNamebreadCrumb.getText(), productName);
		
		
	}
	
}
