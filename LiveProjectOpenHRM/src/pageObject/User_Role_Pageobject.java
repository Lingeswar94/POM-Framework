package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_Pageobject {

	@FindBy (xpath ="//a[@class='oxd-main-menu-item']")
	public static WebElement adminlink;
	
	@FindBy (xpath ="//span[@class='oxd-topbar-body-nav-tab-item']")
	public static WebElement usermanagement;
	
	@FindBy (xpath ="//a[@href='#']")
	public static WebElement User;
	
	@FindBy (xpath="//input[@class='oxd-input oxd-input--active']")
	public static WebElement Username;
	
	/*
	 * @FindBy (xpath="//div[@class='oxd-select-text--after']") 
	 * public static WebElement Userroleselect;
	 * 
	 * @FindBy (xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	 * public static WebElement status;
	 */
	
	@FindBy (xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public static WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[4]")
	public static WebElement Adminname;
}

