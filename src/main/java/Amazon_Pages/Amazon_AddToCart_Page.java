package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_AddToCart_Page {

	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement ProceedToBuy;
	
	public void product_Add_To_Cart() {
		addtocart.click();
		
	}
	
	public void Proceed() {
		ProceedToBuy.click();
	}
	
	public Amazon_AddToCart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
