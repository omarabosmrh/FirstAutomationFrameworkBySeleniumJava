package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class checkoutPage extends pageBase {

	public checkoutPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css = "button.button-1.checkout-as-guest-button")
	WebElement checkoutAsGuest;
	
	@FindBy(css = "button.button-1.register-button")
	WebElement checkoutAsRegiester;
	

	@FindBy(name = "BillingNewAddress.FirstName")
	WebElement FName;	
	
	@FindBy(name = "BillingNewAddress.LastName")
	WebElement LName;
	
	
	@FindBy(name = "BillingNewAddress.Email")
	WebElement email;
	
	
	@FindBy(xpath= "//*[@id=\"BillingNewAddress_Company\"]")
	WebElement company;
	
	@FindBy(xpath  = "//*[@id=\"BillingNewAddress_CountryId\"]")
	WebElement selectCountry;
	
	@FindBy(name = "BillingNewAddress.City")
	WebElement city;
	
	@FindBy(name = "BillingNewAddress.Address1")
	WebElement address;
	
	@FindBy(name = "BillingNewAddress.ZipPostalCode")
	WebElement PostalCode;	
	
	@FindBy(name = "BillingNewAddress.PhoneNumber")
	WebElement phoneNumber;
	
	@FindBy(name = "save")
	WebElement cointinue;
	
	

	
	public void completeorder(String firstname,String lastname,
			                  String Email,String companyname,
			                  String cityname,String addresstxt,
			                  String zipcode,String pnumber) throws InterruptedException {
		
		
		setTextElement(FName, firstname);
		setTextElement(LName, lastname);
		setTextElement(email, Email);
		Thread.sleep(2000);
		setTextElement(company, companyname);
		Thread.sleep(2000);
		select = new Select(selectCountry);
		select.selectByVisibleText("Egypt");
		Thread.sleep(2000);
		setTextElement(city, cityname);
		setTextElement(address, addresstxt);
		setTextElement(PostalCode, zipcode);
		setTextElement(phoneNumber, pnumber);
		clickButton(cointinue);
		Thread.sleep(2000);
			
	}
	
	

}
