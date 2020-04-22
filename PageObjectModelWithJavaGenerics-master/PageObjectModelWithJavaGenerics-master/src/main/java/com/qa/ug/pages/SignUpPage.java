package com.qa.ug.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage

{
	public SignUpPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
}
	//page locators:
	
	By FristName=By.id("firstName");
	By LastName=By.id("lastName");
	By Email=By.id("email");
	By UserName=By.id("");
	By Password=By.id("");
	By passwordConfirm=By.id("password-confirm");
	By IndividualAccount=By.xpath("//span[text()='Individual Account']");
	By NGOAccount=By.xpath("//span[text()='Individual Account']");
	By Signupwithnewletter=By.xpath("//*[@id=\"kc-register-form\"]/div[8]/div/label/span[1]");
	By SignUp=By.xpath("//input[@class='btn bt-submit   ']");
	
	public String getSignUpPageTitle()
	{
		return driver.getTitle();
		
	}
	
	public void doSignUp(String FName, String LName,String EmailId,String UName,String Pwd,String PwdConfirm,String Newletter)
	{
		doSendKeys(FristName,FName);
		doSendKeys(LastName, LName);
		doSendKeys(Email, EmailId);
        doSendKeys(UserName, UName);
        doSendKeys(Password, Pwd);
        doSendKeys(passwordConfirm, PwdConfirm);
        doSendKeys(Signupwithnewletter, Newletter);
        
}
}