package com.blazeclan.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	@FindBy(xpath="//div[@class='ij_XRAOXFVqUYY8480uZC']")
	public WebElement logoutlink;
	@FindBy(xpath="//a[normalize-space()='Log Out']")
	public WebElement logoutbtn;
	
	public LogoutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}