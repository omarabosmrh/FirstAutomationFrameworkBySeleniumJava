package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends pageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
		action = new Actions(driver);
		} 
    
	@FindBy(linkText = "Register")
	WebElement registerLink;
	
	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(linkText = "Contact us")
	WebElement contactus;
	
	@FindBy(id = "customerCurrency")
	WebElement changeCurrencyDropDownList;
	
	

	@FindBy(linkText = "Computers")
	WebElement computersMenu;
	
	@FindBy(linkText   = "Notebooks")
	WebElement NoteBooksMenu;
	

	
	//method
	public void openRegistrationPage() {
		//registerLink.click();
		clickButton(registerLink);
	}
	
	public void openLoginPage() {
		
		clickButton(loginLink);
		
		
	}
	public void openContactUsPage() {
		
		
		scrollBottom();
		clickButton(contactus);
	}
	

	
	public void changeCurrency() {
		
		select=new Select(changeCurrencyDropDownList);
		select.selectByVisibleText("Euro");
		
		
	}
	
	
	// hover menu list items and click on notebooks
	public void hoverMenuItems() {
		
		action.moveToElement(computersMenu).moveToElement(NoteBooksMenu).click().build().perform();
		
		
		
	}
}
