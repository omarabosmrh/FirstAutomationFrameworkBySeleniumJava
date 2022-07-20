package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import pages.addToComparePage;
import pages.productDetailsPage;

public class addToComparePageTestCase extends TestBase{
	
	//  homepage >>
    
	String FirstproductName="Apple MacBook Pro 13-inch";
	String SecondProductName="Asus N551JK-XO076H Laptop";
	
	
	productDetailsPage detailsobject;
	HomePage homeOBJ;
	addToComparePage addToComparePageOBJ;
	SearchPage searchobject;
	
	@Test(priority = 1)
	public void userCanCompareProducts() throws InterruptedException {
		try {
		//homeOBJ = new HomePage(driver);
		searchobject= new SearchPage(driver);
		detailsobject=new productDetailsPage(driver);
		addToComparePageOBJ= new addToComparePage(driver);
		
		searchobject.productSearchUsingAutoSuggest("macb");
		detailsobject.AddToCompareList();
		Thread.sleep(2000);
		//Assert.assertTrue(detailsobject.productNamebreadCrumb.getText().equalsIgnoreCase(productName));
		//Assert.assertEquals(detailsobject.productNamebreadCrumb.getText(), productName);
		//Assert.assertTrue(detailsobject.productNamebreadCrumb.getText().equalsIgnoreCase(produc2tName));
		searchobject.productSearchUsingAutoSuggest("Asus");
		detailsobject.AddToCompareList();
		Thread.sleep(2000);
		driver.navigate().to("https://demo.nopcommerce.com"+"/compareproducts");
		//detailsobject.openComparisonPage();
			addToComparePageOBJ.compareProducts();
			Assert.assertTrue(addToComparePageOBJ.firstProductName.isDisplayed());
			Assert.assertTrue(addToComparePageOBJ.secondProductName.isDisplayed());
			Thread.sleep(2000);	
		}
		catch(Exception e)
		{
			System.out.println("Error Ocuured"+e.getMessage());
			
		}
	}

		@Test(priority = 2)
		public void userCanClearList() {
			addToComparePageOBJ.clearList();
		  Assert.assertTrue(addToComparePageOBJ.noDataLabel.getText().contains("You have no items to compare."));
	}








}
