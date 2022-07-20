package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addProductsToShoppingCart  extends pageBase {

	public addProductsToShoppingCart(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css="a.product-name")
	WebElement productName;
	
	@FindBy(name ="itemquantity11218")
	public WebElement itemquantity;
	
	@FindBy(css="button.button-2.update-cart-button")
	WebElement updateCart;
	
	@FindBy(css="span.product-subtotal")
	public WebElement productSubTotal;
	
	@FindBy(css="button.remove-btn")
	WebElement removeBTN;
	
	@FindBy(name ="checkout")
	WebElement checkoutBTN;
	
	
	@FindBy(name ="termsofservice")
	WebElement termsCheckBox;
	
	



public void removeItemFromCart() {
	
	clickButton(removeBTN);
	//clickButton(updateCart);
}

public void updateProductQuntatity(String quantity) throws InterruptedException {
	ClearText(itemquantity);
	setTextElement(itemquantity, quantity);
	clickButton(updateCart);
}

public void openCheckout() {
	
	clickButton(termsCheckBox);
	clickButton(checkoutBTN);
	//driver.navigate().to("https://demo.nopcommerce.com"+"/cart");
	
}

}