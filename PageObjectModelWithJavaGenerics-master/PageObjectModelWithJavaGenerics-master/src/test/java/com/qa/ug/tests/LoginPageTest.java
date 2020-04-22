package com.qa.ug.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ug.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest(){
		String title =page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("login page title is: "+ title);
		//Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void loginTest(){
		page.getInstance(LoginPage.class).doLogin("prajwal.yawale@cognologix.com", "Py@#$0812");
	}
	

}
