package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pageBase {
 
	protected WebDriver driver;
	//this to use scroll bottom of page
	public JavascriptExecutor jse;
	public Select select;
	public Actions action;
	
	// create constructor for intalize
	
	public pageBase(WebDriver driver) {
		// create or intalize pom
		// this keyword= this class that i am in it you will read elements from my page
		PageFactory.initElements(driver, this);
		
	}
	
	
	protected static void clickButton(WebElement button) {
		
		button.click();	
		
	}
	
	protected static void setTextElement(WebElement textElement,String value) {
		
		textElement.sendKeys(value);
		
	}
	
	public void scrollBottom() {
		
		
		jse.executeScript("scrollBy(0,2500)");
		
	}
	
	public void ClearText(WebElement element) {
		
		element.clear();
		
	}
	
	
}
