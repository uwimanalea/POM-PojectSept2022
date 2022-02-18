package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	
	//login data
		String userName=" demo@techfios.com"; 
		  String password = "abc123";
		 @Test 
	public void validUserShouldBeAbleToCreateCustomer() {
		driver= BrowserFactory.init();
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignin();
		
		DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.varifyDashboardHeader();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
	
		
		AddCustomerPage addCustomerpage= PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerpage.verifyAddContactPage();
		addCustomerpage.insertFullName("selenium sept2021");
		addCustomerpage.insertCompany("ttechfios");
		addCustomerpage.insertEmail("abc@techfios.com");
		 }
}
