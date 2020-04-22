package com.qa.ug.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ug.pages.HomePage;
import com.qa.ug.pages.LoginPage;

public class HomePageTest extends BaseTest{
	
	@Test(priority=1)
	public void homePageTitleTest(){
		page.getInstance(LoginPage.class).doLogin("prajwal.yawale@cognologix.com", "welcome@123");
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, "Reports dashboard");
	}
	
	@Test(priority=2)
	public void verifyHomePageHeaderTest(){
		page.getInstance(LoginPage.class).doLogin("prajwal.yawale@cognologix.com", "welcome@123");
		String header = page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("home page header is: "+ header);
		Assert.assertEquals(header, "Sales Dashboard");
	}
	
}
