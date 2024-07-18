package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page {
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement firstProduct;
	
	public void select_shoe() {
		firstProduct.click();
		}
	
	public Amazon_SearchResult_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
