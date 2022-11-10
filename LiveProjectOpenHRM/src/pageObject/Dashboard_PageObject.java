package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_PageObject {

	@FindBy (xpath="//span[normalize-space()='Dashboard']")
	public static WebElement dashboard;
	
	@FindBy (xpath="//p[@class='oxd-text oxd-text--p']")
	public static WebElement header;
}
