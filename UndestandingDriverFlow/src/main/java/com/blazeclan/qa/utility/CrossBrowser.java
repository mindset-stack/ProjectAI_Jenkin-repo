package com.blazeclan.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.blazeclan.qa.base.CommonFunctions;
import com.blazeclan.qa.logging.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser extends CommonFunctions{

	
	public static WebDriver selectDriver(String browser) {
		
		switch(browser){
		case"chrome":
		ChromeOptions options=  new ChromeOptions();
		options.addArguments("start-maximized");
		driver= WebDriverManager.chromedriver().capabilities(options).create();
		Log.info("chrome browser selected");
		break;
		default: System.out.println("Please provide browser name");
		
	}
		DriverManager.setDriver(driver);
		return DriverManager.getDriver();
		
	
		
		
	}
	
	
}
