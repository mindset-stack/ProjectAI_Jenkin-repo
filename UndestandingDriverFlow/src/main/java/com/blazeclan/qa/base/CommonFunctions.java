package com.blazeclan.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.blazeclan.qa.logging.Log;
import com.blazeclan.qa.utility.CrossBrowser;

public class CommonFunctions {
	
	public static WebDriver driver;
	
	public static Properties init_properties(String path) {
		
		Properties prop = new Properties();
		try {
			
			File file = new File(path);
			if(!file.exists()) {
				throw new FileNotFoundException("File does not exist");
				}
			
			FileInputStream fis= new FileInputStream(file);
			prop.load(fis);
			
			}catch(IOException e) {
				e.printStackTrace();
			}
//		System.out.println("Is Properties empty: "
//                + prop.isEmpty());
		
		Boolean flag= prop.isEmpty();
		System.out.println("The value of flag is  " +flag);
		
	
		return prop;
	}
	
	public void invokeBrowser(String browserName) {
		 driver = CrossBrowser.selectDriver(browserName);
		 Log.info("Opened "+ browserName +" browser" );
			 driver.manage().window().maximize();
			 Log.info("Window is maximized");
			 }
		
	public void invokeApplicationURL(String url) {
		driver.get(url);
		Log.info("Opened URL is  " +url);
		}
	
	public void enterText(WebElement element, String text) {
		try {
			
			element.clear();
			Log.info("Text in the element is " + element  +"is cleared");
			element.click();
			Log.info("Cliked on textbox " +element);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			element.sendKeys(text);
			Log.info("Entered text on " +element +" text");
			
		}catch(Exception e) {
			
	//Log.error("The error is" +e.getMessage());
			throw e;
		}
		
}
	
	public void clickElement(WebElement element) {
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
			Log.info("wait for until element "+ element.toString() + "is visible");
			element.click();
			Log.info("Clicked on element " +element);
		}catch(Exception e) {
			//Log.error(e.getMessage());
			//Log.error("Failed to click on " +element.toString());
			throw e;
		}
		
		
		
	}
}
