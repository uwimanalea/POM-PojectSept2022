package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		
	}
	//element list
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Dashboard_Header_Element;
	@FindBy(how = How.XPATH, using= "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_ELEMENT;;
	@FindBy(how = How.XPATH, using= "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMENT_ELEMENT;
	@FindBy(how = How.XPATH, using= "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTUSTOMER_ELEMENT;
	
	public void varifyDashboardHeader() {
		Assert.assertEquals(Dashboard_Header_Element.getText(), "Dashboard", "wrong page");
		
	}
	public void clickCustomerButton() {
		CUSTOMER_ELEMENT.click();
	
	}
	public void clickAddCustomerButton() {
		ADD_CUSTOMENT_ELEMENT.click();
	}
}
