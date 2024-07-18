package Amazon_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page {

	@FindBy(id="twotabsearchtextbox")
	WebElement search_TF;
	
	public void searching() {
		search_TF.sendKeys("shoe"+Keys.ENTER);
		
	}
	
	public Amazon_Home_Page (WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
}
