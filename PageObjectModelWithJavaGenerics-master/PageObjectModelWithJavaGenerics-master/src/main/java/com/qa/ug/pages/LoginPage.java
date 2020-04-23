package com.qa.ug.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//page locators:
	By LoginBtn = By.xpath("//a[text()='Log In']");

	//page actions:
	public String getLoginPageTitle(){
		return driver.getTitle();
		
	}
	

}
