package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addToComparePage extends pageBase {

	public addToComparePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css="a.clear-list")
	WebElement clearList ;
	
	@FindBy(css="div.no-data")
	public WebElement noDataLabel;
	
	@FindBy(css="table.compare-products-table")
	WebElement compareTable;
	
	@FindBy(tagName = "tr")
	List<WebElement> allRows;
	
	@FindBy(tagName = "td")
	List<WebElement> allCols;
	
	@FindBy(linkText  = "Apple MacBook Pro 13-inch")
	public WebElement firstProductName;
	

	@FindBy(linkText = "Asus N551JK-XO076H Laptop")
	public WebElement secondProductName;
	

	
	
	
	public void clearList() {
		
		clickButton(clearList);
	} 
	
	
	
	
	public void compareProducts() {
		
		System.out.println(allRows.size()+"\t");
		//System.out.println(allCols.size()+"\t");
		
		for(WebElement row : allRows) {
			System.out.println(row.getText()+"\t");
			
			for(WebElement col:allCols) {
				
				System.out.println(col.getText()+"\t");
			}
		
			
		}
		
		
	}
	
	

}
