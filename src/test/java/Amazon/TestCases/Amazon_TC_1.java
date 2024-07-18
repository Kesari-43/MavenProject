package Amazon.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Pages.Amazon_Home_Page;
import Amazon_Pages.Amazon_Login_Page;


public class Amazon_TC_1 {

	@Test
	public void login_to_amazon_search() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//create object of page class and called methods
		
		Amazon_Login_Page a1= new Amazon_Login_Page(driver);
		a1.uname();
		a1.continue_method();
		a1.pwd();
		a1.signIn();
		
		Amazon_Home_Page a2=new Amazon_Home_Page(driver);
		a2.searching();
		

		
		//assertion
		//SS
		//DDT
		
		
		
	}}