package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends pageBase {

	public ProductReviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="AddProductReview_Title")
	WebElement addProductReviewTitle;
	

	@FindBy(id="AddProductReview_ReviewText")
	WebElement addProductReviewTXT;
	

	@FindBy(id="addproductrating_4")
	WebElement addProductRating;
	
	@FindBy(name = "add-review")
	WebElement submitReviewBTN;
	
	
	@FindBy(css="div.result")
	public WebElement resultTXT;
	
	
	
	public void addReview(String productTitle, String productReviewTXt) {
		
		setTextElement(addProductReviewTitle, productTitle);
		setTextElement(addProductReviewTXT, productReviewTXt);
		clickButton(addProductRating);
		clickButton(submitReviewBTN);
		
	}
	
	
	
}
