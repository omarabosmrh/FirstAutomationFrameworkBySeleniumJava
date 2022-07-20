package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailFriend;
import pages.HomePage;
import pages.SearchPage;
import pages.UserRegistrationPage;
import pages.loginPage;
import pages.productDetailsPage;

public class EmailFriendTestCase  extends TestBase {

	//1-user regestration
	//2- search product
	//3- email friend
	//4-logout
	
	
	HomePage homeopject;
	UserRegistrationPage registerobject;
	loginPage loginOpject;

	String productName="Apple MacBook Pro 13-inch";
	SearchPage searchobject;
	productDetailsPage detailsobject;
	
	EmailFriend emailobj;
	
	
	//1
	@Test(priority = 1, alwaysRun = true)
	public void userCanRegisterSuccessfully() {

		homeopject = new HomePage(driver);
		homeopject.openRegistrationPage();

		registerobject = new UserRegistrationPage(driver);
		registerobject.userRegisteration("omar", "abosmrh", "omarrrr@gmail.com", "12345678");
		Assert.assertTrue(registerobject.successRegeistration.getText().contains("Your registration completed"));

	}

	//2
	
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
	
	
	//3
	@Test(priority = 3)
	public void regUserCanSendProductTFriend() {
		
		detailsobject.sendemail();
		emailobj = new EmailFriend(driver);
		emailobj.sendEmailToFriend("tttt@test.com", "hello check this ");
		Assert.assertTrue(emailobj.messageNotification.getText().contains("Your message has been sent."));
	}
//4-logout	
	@Test(priority = 4)

	public void RegisteredUserCanLogout() {

		registerobject.userLogout();

	}


}
