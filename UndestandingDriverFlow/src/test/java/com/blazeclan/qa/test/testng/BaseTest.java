package com.blazeclan.qa.test.testng;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.blazeclan.qa.base.CommonFunctions;
import com.blazeclan.qa.constants.IConstants;
import com.blazeclan.qa.pages.AboutMePage;
import com.blazeclan.qa.pages.LoginPage;
import com.blazeclan.qa.pages.LogoutPage;
import com.blazeclan.qa.utility.TestListener;

public class BaseTest extends CommonFunctions {
	
	public  LoginPage loginpage;
	public  LogoutPage logoutpage;
	public  AboutMePage aboutmepage;
	
	
	
	
	@BeforeTest
	public void setUp() {
		
		Properties prop= init_properties(IConstants.TEST_CONFIG_PATH);	
		invokeBrowser(prop.getProperty("BrowserName"));
		invokeApplicationURL(prop.getProperty("url"));
		
		
		
	}
	
	@AfterTest
	public void logout() {
		//extent.flush();
		driver.quit();
	}

}
