package com.qa.ug.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//page locators:
	By LoginBtn = By.xpath("//a[@class=\"c12\"]");
	By emailId=By.xpath("//input[@autofocus]");
	By password = By.xpath("//input[@oncopy]");
	By loginButton = By.xpath("//input[@class=\"bt-login btn bt-submit   \"]");

	
	//page actions:
	public String getLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public void doLogin(String username, String pwd)
	{
try {	
			doClick(LoginBtn);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doSendKeys(emailId, username);
		doSendKeys(password, pwd);
		doClick(loginButton);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
