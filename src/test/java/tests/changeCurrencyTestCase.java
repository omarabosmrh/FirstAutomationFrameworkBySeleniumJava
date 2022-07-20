package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import pages.productDetailsPage;


public class changeCurrencyTestCase extends TestBase {

	

	HomePage homeobj;
	productDetailsPage productDetailsObj;
	String productName="Apple MacBook Pro 13-inch";
	SearchPage searchobject;
	
	
	
	@Test(priority = 1)
	public void userCanChangeCurrency() throws InterruptedException {
		homeobj = new HomePage(driver);
		homeobj.changeCurrency();
	}
	
	
	
	
	
	@Test(priority = 2)
	public void userCanSearchWithAutoSuggest() throws InterruptedException {
		try {
		searchobject= new SearchPage(driver);
		searchobject.productSearchUsingAutoSuggest("macb");
		productDetailsObj=new productDetailsPage(driver);
		Assert.assertTrue(productDetailsObj.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsobject.productNamebreadCrumb.getText(), productName);
		
		Assert.assertTrue(productDetailsObj.productPriceLabel.getText().contains("€"));
		
		System.out.println(productDetailsObj.productPriceLabel.getText());
		
		}
		
		catch(Exception e)
		{
			System.out.println("Error Ocuured"+e.getMessage());
			
		}	
		
	}
	
	
}
