package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountpage extends pageBase {

	public myAccountpage(WebDriver driver) {
		super(driver);

	}

	@FindBy(linkText="Change password")
	WebElement changepPasswordLink;
	
	
	@FindBy(id="OldPassword")
	WebElement oldPasswordTxt;
	
	
	@FindBy(id="NewPassword")
	WebElement newPasswordTxt;
	
	@FindBy(id="ConfirmNewPassword")
	WebElement confirmPasswordTxt;
	
	@FindBy(css="button.button-1.change-password-button")
	WebElement changePasswordBtn;
	
	@FindBy(css="div.result")
	public WebElement resultLbl;
	
	@FindBy(css="span.close")
	public WebElement close;
	
	

	public void openChangePassword() {

 		clickButton(changepPasswordLink);

	}
	
	public void changePassword(String oldPassword, String newPassword) {
		
		setTextElement(oldPasswordTxt, oldPassword);
		setTextElement(newPasswordTxt, newPassword);
		setTextElement(confirmPasswordTxt, newPassword);
		clickButton(changePasswordBtn);
		
		clickButton(close);
		
		
	}

}
