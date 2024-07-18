package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page {

	
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement WishListBtn;
	
	@FindBy(xpath="(//input[@name='submissionURL'])[1]")
	WebElement SelectAdd;
	
	public void Wishlist() {
		WishListBtn.click();
	}
	
	public void Select_Address() {
		SelectAdd.click();
	}
	
	public Amazon_Product_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}}
