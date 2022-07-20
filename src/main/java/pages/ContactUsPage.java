package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends pageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(id = "FullName")
	WebElement fullName ;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id = "Enquiry")
	WebElement enquiry;
	
	@FindBy(css="button.button-1.contact-us-button")
	WebElement submitBTN;
	

	@FindBy(css="div.result")
	public WebElement resultTxt;
	
	//method
	public void opeenContactUsFormAndSendData(String Fname,String mail, String Enqury) {
	
		//
		setTextElement(fullName, Fname);
		setTextElement(email, mail);
		setTextElement(enquiry, Enqury);
		clickButton(submitBTN);
	}
	
	
}
