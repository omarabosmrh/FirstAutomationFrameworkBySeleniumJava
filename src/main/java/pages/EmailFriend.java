package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriend extends pageBase {

	public EmailFriend(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(id = "FriendEmail")
	WebElement emailFriendTXT ;
	
	@FindBy(id="PersonalMessage")
	WebElement personalMessageTXT;
	
	@FindBy(name="send-email")
	WebElement sendEmailBTN;
	
	@FindBy(css="button.button-1.contact-us-button")
	WebElement submitBTN;
	

	@FindBy(css="div.result")
	public WebElement messageNotification;
	
	
	public void sendEmailToFriend(String friendEmail,String personalMessager) {
		
		//
		setTextElement(emailFriendTXT, friendEmail);
		setTextElement(personalMessageTXT, personalMessager);
		
		clickButton(sendEmailBTN);
	}

}
 