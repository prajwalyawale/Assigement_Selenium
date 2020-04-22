package com.qa.ug.tests;

import org.testng.annotations.Test;

import com.qa.ug.pages.SignUpPage;


public class SignUpTest extends BaseTest{
		
		
		@Test(priority=1)
		public void verifyLoginPageTitleTest(){
			String title =page.getInstance(SignUpPage.class).getSignUpPageTitle();
			System.out.println(" SignUp page title is: "+ title);
			//Assert.assertEquals(title, "HubSpot Login");
		}
		
		@Test(priority=2)
		public void SignUpTest(){
			page.getInstance(SignUpPage.class).doSignUp(FName, LName, EmailId, UName, Pwd, PwdConfirm, Newletter);
		}
		

	}



