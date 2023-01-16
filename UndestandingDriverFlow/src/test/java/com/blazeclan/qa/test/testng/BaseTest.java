package com.blazeclan.qa.test.testng;

import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.blazeclan.qa.base.CommonFunctions;
import com.blazeclan.qa.constants.IConstants;
import com.blazeclan.qa.pages.LoginPage;
import com.blazeclan.qa.pages.LogoutPage;
import com.blazeclan.qa.utility.TestListener;

public class BaseTest extends CommonFunctions {
	
	public static LoginPage loginpage;
	public static LogoutPage logoutpage;
	
	
	
	@BeforeTest
	public void setUp() {
		
		Properties prop= init_properties(IConstants.TEST_CONFIG_PATH);	
		invokeBrowser(prop.getProperty("BrowserName"));
		invokeApplicationURL(prop.getProperty("url"));
		
		
		
	}

}
