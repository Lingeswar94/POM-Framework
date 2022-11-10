package Testcase;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonFunction.Commonfunction;
import pageObject.User_Role_Pageobject;

public class Test_User_Role_Req extends Commonfunction {

	Logger logger = Logger.getLogger(Test_User_Role_Req.class);

	public void movedtouserpage() {
		Actions adminactions = new Actions(driver);
		adminactions.moveToElement(User_Role_Pageobject.adminlink);
		adminactions.click().build().perform();
		adminactions.moveToElement(User_Role_Pageobject.usermanagement);
		adminactions.click().build().perform();
		adminactions.moveToElement(User_Role_Pageobject.User);
		adminactions.click().build().perform();
	}

	@Test
	public void adminpagemodify() throws InterruptedException {

		PageFactory.initElements(driver, User_Role_Pageobject.class);
		logger.info("Navigating to user page");
		movedtouserpage();
		logger.info("selecting user role");
		User_Role_Pageobject.usermanagement.click();
		User_Role_Pageobject.User.click();
		// Thread.sleep(3000);
		User_Role_Pageobject.Username.sendKeys("Admin");
		// selectuserRole();
		// selectStatus();
		User_Role_Pageobject.searchButton.click();
		/*
		 * String adminname = User_Role_Pageobject.Adminname.getText();
		 * logger.info(adminname);
		 */
		logger.info("End of User role req");
	}

}
