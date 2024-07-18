package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page {
	
WebDriver driver;	

	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	@FindBy(name="password")
	WebElement Pass;
	
	@FindBy(id="signInSubmit")
	WebElement SignInBtn;
	
	
	public void uname() {
		userName.sendKeys("8180837559");
	}
	
	public void continue_method() {
		continueBtn.click();
	}
	
    public void pwd() {
    	                                                                                                                                                                     Pass.sendKeys("6BdiZ7k#0987");
	}
   
    public void signIn() {
    	SignInBtn.click();
}

    public Amazon_Login_Page (WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }}
