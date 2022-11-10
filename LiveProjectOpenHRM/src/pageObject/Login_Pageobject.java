package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Pageobject {

	
	@FindBy (xpath="//input[@placeholder='Username']")
	public static WebElement Username;
	
	@FindBy (xpath="//input[@placeholder='Password']")
	public static WebElement Password;
	
	@FindBy (xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public static WebElement Summit;
}
