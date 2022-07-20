package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTestCase extends TestBase {

	
	HomePage homepageobj;
	ContactUsPage contactpageobj;
	
	String fullname="ueriiiu";
	String email="uiuu@jjj.com";
	String enqury="irferier";
	
	@Test
	public void contactusTest() {
		
		homepageobj=new HomePage(driver);
		homepageobj.openContactUsPage();
		contactpageobj=new ContactUsPage(driver);
		contactpageobj.opeenContactUsFormAndSendData(fullname, email, enqury);
		Assert.assertTrue(contactpageobj.resultTxt.getText()
				.contains("Your enquiry has been successfully sent to the store owner."));
		
	}
	
}
