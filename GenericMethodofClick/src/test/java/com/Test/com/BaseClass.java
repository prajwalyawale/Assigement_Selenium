package com.Test.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class BaseClass
{

	@Test 
	public void LoginTest()
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\GenericMethodofClick\\Driver\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://ugweb.ugdevops.com/");
		 driver.manage().window().maximize();
		 Login_Page lp = new Login_Page(driver);
		 lp.genericClick(driver, lp.ClickLog);
	}
	
	
}