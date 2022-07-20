package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productDetailsPage extends pageBase{

	public productDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	
	}
	
	@FindBy(css="strong.current-item")
	public WebElement productNamebreadCrumb;

	@FindBy(css="button.button-2.email-a-friend-button")
	public WebElement emailFriend;
	
	@FindBy(linkText = "shopping cart")
	WebElement goToShoppingCart;
	
	
	@FindBy(css="span.price-value-4")
	public WebElement productPriceLabel;
	
	@FindBy(linkText="Add your review")
	 WebElement AddReview;
	
	@FindBy(id="add-to-wishlist-button-4")
	WebElement addToWishListBTN;
    
	@FindBy(linkText = "wishlist")
	WebElement wishlistLinkPage;
	
	//@FindBy (className = "button-2 add-to-compare-list-button")
	//WebElement addAssusToCompareList;
	
	@FindBy(linkText = " product comparison")
	WebElement productComparison;
	
	@FindBy(css = "button.button-2.add-to-compare-list-button")
	WebElement addToCompareListBTN;
	
	@FindBy(css= "button.button-1.add-to-cart-button")
	WebElement addToCartBTN;
	
	public void sendemail() {
		
		
		clickButton(emailFriend);
	}
	
	public void clickReviewLink() {
		
		clickButton(AddReview);
	}
	
	
	public void viewAddtoWishListBtn() {
		
		clickButton(addToWishListBTN);
		clickButton(wishlistLinkPage);
	}
	
	public void AddToCompareList() {

		
		clickButton(addToCompareListBTN);
}
	

	public void openComparisonPage() {
		clickButton(productComparison);
	}
	
public void addToCart() {
		
		clickButton(addToCartBTN);
		clickButton(goToShoppingCart);
	}


	}
