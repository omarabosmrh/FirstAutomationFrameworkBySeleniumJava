package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addTowishListPage extends pageBase {

	public addTowishListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="button.remove-btn")
	WebElement removeFromWishListBTN;
	
	@FindBy(css="td.product")
	WebElement productName;
	
	@FindBy(css="h1")
	WebElement WishListHeader;
	
	@FindBy(id="updatecart")
	WebElement updateCartBTN;
	
	@FindBy(css="div.no-data")
	public WebElement emptyWishList;
	
	@FindBy(css="input")
	WebElement select;
	
	public void removeProductFromCartwishlist() {

		clickButton(removeFromWishListBTN);
		//clickButton(updateCartBTN);
				
	}


}
