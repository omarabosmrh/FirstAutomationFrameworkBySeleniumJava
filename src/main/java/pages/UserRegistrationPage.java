package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends pageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
    // find all input required
	@FindBy(id="gender-male")
	WebElement genderRDoBtn;
	
	@FindBy(id="FirstName")
	WebElement fnTxtBox;
	
	
	@FindBy(id="LastName")
	WebElement lnTxtBox;
	
	@FindBy(id="Email")
	WebElement emailTxtBox;
	
	@FindBy(id="Password")
	WebElement passwordTxtBox;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmpaswordTxtBox;
	
	
	@FindBy(id="register-button")
	WebElement registerBtn;
	
	@FindBy(css = "div.result")
	public WebElement successRegeistration;
	
	@FindBy(css="a.ico-logout")
	public WebElement logoutLink;
	
	@FindBy(linkText="My account")
	WebElement myAccountLink;
	
	
	public void userRegisteration(String firstname,String lastname,String email,String password) {
		
		//genderRDoBtn.click();  // refactoring
		clickButton(genderRDoBtn);
		//fnTxtBox.sendKeys(firstname);
		setTextElement(fnTxtBox, firstname);
		//lnTxtBox.sendKeys(lastname);
		setTextElement(lnTxtBox, lastname);
		//emailTxtBox.sendKeys(email);
		setTextElement(emailTxtBox, email);
		
		//passwordTxtBox.sendKeys(password);
		setTextElement(passwordTxtBox, password);
		//confirmpaswordTxtBox.sendKeys(password);
		setTextElement(confirmpaswordTxtBox, password);
		//registerBtn.click();
			clickButton(registerBtn);
	}
	
	
	public void userLogout() {
		
		clickButton(logoutLink);
		
	}
	
	public void openMyAccountPage() {
		
		clickButton(myAccountLink);
		
		
	}
	
	
}
