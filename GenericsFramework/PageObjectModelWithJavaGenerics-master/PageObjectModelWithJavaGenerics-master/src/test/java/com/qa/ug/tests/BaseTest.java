package com.qa.ug.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.ug.pages.Page;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\PageObjectModelWithJavaGenerics-master\\PageObjectModelWithJavaGenerics-master\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://ugweb.ugdevops.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// create the object of page class: Instantiate Page Class
		page = new Page(driver, wait);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
