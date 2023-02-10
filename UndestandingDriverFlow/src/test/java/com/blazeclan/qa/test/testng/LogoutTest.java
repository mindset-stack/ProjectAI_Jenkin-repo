  
/**
*
* @author Jay	
*/
package com.blazeclan.qa.test.testng;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import com.blazeclan.qa.pages.LogoutPage;

import com.blazeclan.qa.utility.TestListener;
@Listeners(TestListener.class)

public class LogoutTest extends BaseTest {
	
	
	
	 /**
	* This is a class for logout where base class is extended for driver and web elements are accessed
	* by using logoutpage object
	    * @param args
	*/
	
	@Test(priority=1)
	public void Logout() throws InterruptedException {
		logoutpage= new LogoutPage(driver);
		 clickElement(logoutpage.logoutlink);
		Thread.sleep(3000);
		clickElement(logoutpage.logoutbtn);
		
		
		
		
	}

}
