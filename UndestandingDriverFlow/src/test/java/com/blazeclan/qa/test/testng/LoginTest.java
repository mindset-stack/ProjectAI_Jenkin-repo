package com.blazeclan.qa.test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.blazeclan.qa.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void LoginPage() throws InterruptedException {
		
		loginpage = new LoginPage(driver);
		enterText(loginpage.loginemail,"premila.jina@projectai.com");
		enterText(loginpage.loginpassword,"Hetvi2012!");
		clickElement(loginpage.loginBtn);
		Thread.sleep(5000);
		String currentUrl= driver.getCurrentUrl();
		String actualUrl= "https://pulse-stage.projectai.com/app/help/how-to-use-pulse";
		Assert.assertEquals(actualUrl, currentUrl);
		
	}

}
