package com.blazeclan.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutMePage {

	@FindBy(xpath="//span[contains(text(),'My Projects')]")
	public WebElement projectselectionicon;
	@FindBy(xpath="//li[@class='pro-menu-item']/div/span[@class='pro-item-content']")
	public WebElement projectname;
	@FindBy(xpath="//span[@class='MuiIconButton-label']")
	public WebElement closeicon;
	
	
	@FindBy(xpath="//span[contains(text(),'About Me')]")
	public WebElement aboutmelink;
	
	
	
	@FindBy(xpath="//*[@class='_2kiHKNbvQmG4zgHt7oz96W EIwcdJQ929umkl9iYDdm9']")
	public WebElement answer;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/a[1]")
	public WebElement comment;
	
	public AboutMePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
}
