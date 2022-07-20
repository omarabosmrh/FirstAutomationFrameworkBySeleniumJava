package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends pageBase {

	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="Email")
	WebElement emailTxtBx;
	
	@FindBy(id="Password")
	WebElement passwordTxtBox;
	
	@FindBy(css="button.button-1.login-button")
	WebElement loginBtn;
	
	public void userLogin(String email,String password) {
		
		setTextElement(emailTxtBx, email);
		setTextElement(passwordTxtBox, password);
		clickButton(loginBtn);
		
	}

}
