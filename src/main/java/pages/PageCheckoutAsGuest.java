package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageCheckoutAsGuest extends pageBase {

	public PageCheckoutAsGuest(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name = "BillingNewAddress.FirstName")
	WebElement FName;	
	
	@FindBy(name = "BillingNewAddress.LastName")
	WebElement LName;
	
	
	@FindBy(name = "BillingNewAddress.Email")
	WebElement email;
	
	
	@FindBy(name = "BillingNewAddress.Company")
	WebElement company;
	
	@FindBy(name = "BillingNewAddress.CountryId")
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
	
	
	@FindBy(name = "shippingoption")
	WebElement shippingoption;
	
	
	@FindBy(css= "button.button-1.shipping-method-next-step-button")
	WebElement shippingNextBTN;
	
	
	@FindBy(name = "paymentmethod_1")
	WebElement paymentmethod;
	
	
	@FindBy(css="button.button-1.payment-method-next-step-button")
	WebElement paymentNStep;
	
	
	@FindBy(css="button.button-1.payment-info-next-step-button")
	WebElement paymentN2Step;
	
	@FindBy(css="button.button-1.confirm-order-next-step-button")
	WebElement confirmOrder;
	
	@FindBy(css="h1")
	WebElement thanks;
	
	
	@FindBy(css="button.button-1.order-completed-continue-button")
	WebElement completeOrder;
	
	
	public void completeorder(String firstname,String lastname,
			                  String Email,String companyname,
			                  String cityname,String addresstxt,
			                  String zipcode,String pnumber) throws InterruptedException {
		
		
		setTextElement(FName, firstname);
		setTextElement(LName, lastname);
		setTextElement(email, Email);
		setTextElement(company, companyname);
		Thread.sleep(2000);
		select = new Select(selectCountry);
		select.selectByIndex(1);
		Thread.sleep(2000);
		setTextElement(city, cityname);
		setTextElement(address, addresstxt);
		setTextElement(PostalCode, zipcode);
		setTextElement(phoneNumber, pnumber);
		clickButton(cointinue);
		Thread.sleep(2000);
		clickButton(shippingoption);
		clickButton(shippingNextBTN);
		Thread.sleep(2000);
		
		clickButton(paymentmethod);
		clickButton(paymentNStep);
		clickButton(paymentN2Step);
		Thread.sleep(2000);
		clickButton(confirmOrder);
		Thread.sleep(2000);
		clickButton(completeOrder);
		Thread.sleep(2000);
		
	}
	
	
}
