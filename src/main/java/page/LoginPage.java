package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;


public LoginPage(WebDriver driver) {
	this.driver=driver;
	
}

//element list
//WebElement userNameElement =driver.findElement(By.xpath("//*[@id=\"username\"]"));
//By userNameField = By.xpath("//*[@id=\"username\"]");
//@FindBy(how= How.XPATH,using="//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;

@FindBy(how= How.XPATH,using="//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;
@FindBy(how = How.XPATH, using= "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
@FindBy(how = How.XPATH, using= "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_ELEMENT;;

//INDIVIDUAL METHODS or technics
public void insertUserName(String userName) {
	USERNAME_ELEMENT.sendKeys(userName);
	
}
public void insertPassword(String Password) {
	PASSWORD_ELEMENT.sendKeys(Password);
}
public void clickSignin() {
	SIGNIN_ELEMENT.click();
}
//combined technic
//single method decralation as individual, which will be a little complicated
/*public void performLogin(String userName,String Password ) {
	USERNAME_ELEMENT.sendKeys();
	PASSWORD_ELEMENT.sendKeys();
	SIGNIN_ELEMENT.clear();
}*/
}
