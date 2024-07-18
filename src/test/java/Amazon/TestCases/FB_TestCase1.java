package Amazon.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Facebook_Pages.Facebook_Login_page;

public class FB_TestCase1 {

	@Test
	public void login_to_facebook_using_valid_creds() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//create object of page class and called methods
		Facebook_Login_page fb=new Facebook_Login_page(driver);
		fb.un();
		fb.pwd();
		fb.loginbtn();
		
		
		
	}
    
	
	
	
	}

