package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	//login data
	String userName=" demo@techfios.com"; 
	  String Password = "abc123";
	  
	@Test
public void validUserShouldBeAbleToLogin() {
	 driver=BrowserFactory.init();
	 
	 LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	 loginpage.insertUserName(userName);
	 loginpage.insertPassword(Password);
	 loginpage.clickSignin();
	 
	 DashboardPage dashboardPage= PageFactory.initElements(driver, DashboardPage.class);
	 dashboardPage.varifyDashboardHeader();
	 
	 
	 BrowserFactory.tearDown();
	}
}
