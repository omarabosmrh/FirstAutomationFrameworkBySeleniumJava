package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage  extends pageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="small-searchterms")
	WebElement searchBox;
	
	@FindBy(css="button.button-1.search-box-button")
	WebElement searchBtn;
	
	@FindBy(id="ui-id-1")
	List<WebElement> productList;
	
	@FindBy(linkText ="Apple MacBook Pro 13-inch")
	WebElement productTitle;
	
	public void productSearch(String productname) {
		
		setTextElement(searchBox, productname);
		clickButton(searchBtn);
		
		
	}
	
	public void openProductDetailsPage() {
		
		clickButton(productTitle); 
		
		
	}
	public void productSearchUsingAutoSuggest(String searchtxt) throws InterruptedException {
		
		setTextElement(searchBox, searchtxt);
		Thread.sleep(3000);
		// to click on first suggestion
		productList.get(0).click();
		
		
	}
	
	
	
}
