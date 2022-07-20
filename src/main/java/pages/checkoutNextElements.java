package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutNextElements extends pageBase {

	public checkoutNextElements(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "button.button-1.new-address-next-step-button")
	WebElement addressNext;
	
	
	@FindBy(xpath =  "//*[@id=\"shipping-method-buttons-container\"]/button")
	WebElement shippingNextBTN;
	
	
	@FindBy(name = "shippingoption")
	WebElement shippingoption;
	

	
	
	//@FindBy(name = "paymentmethod_1")
	//WebElement paymentmethod;
	
	
	@FindBy(css="button.button-1.payment-method-next-step-button")
	WebElement paymentNStep;
	
	
	@FindBy(css="button.button-1.payment-info-next-step-button")
	WebElement paymentN2Step;
	
	@FindBy(css="button.button-1.confirm-order-next-step-button")
	WebElement confirmOrder;
	
	@FindBy(css="h1")
	WebElement thanks;
	
	
	@FindBy(css="button.button-1.order-completed-continue-button")
	WebElement completeOrder;
	
	
	
	@FindBy(css="a.button-2.print-order-button")
	WebElement PrintInvoiceBTN;
	
	@FindBy(css="a.button-2.pdf-invoice-button")
	WebElement pdfInvoice;
	
	@FindBy(css="button.button-1.order-completed-continue-button")
	WebElement orderCompleted;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a")
	WebElement orderDetails;
	
	public void nextCheckout() throws InterruptedException {
		
		
		clickButton(addressNext);
		Thread.sleep(2000);
		//clickButton(shippingoption);
		//clickButton(shippingNextBTN);
		//Thread.sleep(2000);
		
		//clickButton(paymentmethod);
		//Thread.sleep(2000);

		
		
		
		clickButton(shippingoption);
		Thread.sleep(2000);
		clickButton(shippingNextBTN);
		Thread.sleep(2000);
		
		clickButton(paymentNStep);
		Thread.sleep(2000);
		clickButton(paymentN2Step);
		Thread.sleep(2000);
		
		clickButton(confirmOrder);
		Thread.sleep(2000);
		//clickButton(completeOrder);
		//Thread.sleep(2000);
		
		
		//clickButton(paymentmethod);
		//Thread.sleep(2000);
		
		//clickButton(orderCompleted);
		
		clickButton(orderDetails);
		//print and down invoice
		clickButton(pdfInvoice);
		clickButton(PrintInvoiceBTN);
	
		
	}

}
