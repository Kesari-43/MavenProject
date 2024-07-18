package Facebook_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_page {
//step 1: locate each element using findBy annotation
	
	
WebDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath = "//Button[@name='login']")
	WebElement loginButton;
	
//Create separate method for each components to perform its action
	
	
	public void un() {
		username.sendKeys("Kesari@gmail.com");
	}
	
    public void pwd() {
    	password.sendKeys("weiruofu897908");
	}
	
    public void loginbtn() {
    	loginButton.click();
	}
	
	
    //step3 : initialize each element using pageFactory class inside constructor
    
    public Facebook_Login_page(WebDriver driver) {                      //create constructor to init element
    	
    	PageFactory.initElements(driver, this);                         //pageFactory class to initialize element
    	
    }
    
    
}
