package Testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunction.Commonfunction;
import pageObject.Dashboard_PageObject;
import pageObject.Login_Pageobject;

public class Test_Pending_Leave_Req extends Commonfunction {

	String message;
	Logger logger= Logger.getLogger(Test_Pending_Leave_Req.class);
	
	public void login() {
		logger.info("Logging the appication ");
		PageFactory.initElements(driver, Login_Pageobject.class);
		Login_Pageobject.Username.sendKeys(properties.getProperty("username"));
		Login_Pageobject.Password.sendKeys(properties.getProperty("password"));
		Login_Pageobject.Summit.click();

	}

	public void verifyRequest() {

		PageFactory.initElements(driver, Dashboard_PageObject.class);
		Dashboard_PageObject.dashboard.click();
		message = Dashboard_PageObject.header.getText();
		//System.out.println(message);

	}

	@Test
	public void verifyPendingRequest() {
		login();
		logger.info("Getting the Test pending req");
		verifyRequest();
		logger.info("Getting the pending message");
		//Assert.assertEquals(message, "No Employees are on Leave Today");
		logger.info("End of Pending leave req");
	}

}
