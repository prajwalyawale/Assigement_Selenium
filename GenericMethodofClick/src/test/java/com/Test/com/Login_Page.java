package com.Test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page extends BaseClass{

@FindBy(xpath = "//a[text()='Log In']")
WebElement ClickLog;


//constructor
public Login_Page(WebDriver driverdriver) {
    WebDriver driver = null;
	PageFactory.initElements(driver, this);
}

//Generic Click method
public boolean genericClick(WebDriver driver, WebElement elementToBeClicked)
{
	
	if(elementToBeClicked.isEnabled() )
	{
	
    try{

    	Thread.sleep(4000);
     elementToBeClicked.click();

     return true;
}
catch(Exception e){

     return false;
     
}
   
	}
	return false;
}
}