package com.blazeclan.qa.test.testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import com.blazeclan.qa.pages.LogoutPage;

//@Listeners(TestListener.class)

public class LogoutTest extends BaseTest {
	
	@Test(priority=1)
	public void Logout() throws InterruptedException {
		logoutpage= new LogoutPage(driver);
		clickElement(logoutpage.logoutlink);
		Thread.sleep(3000);
		clickElement(logoutpage.logoutbtn);
		
		
		
		
	}

}
