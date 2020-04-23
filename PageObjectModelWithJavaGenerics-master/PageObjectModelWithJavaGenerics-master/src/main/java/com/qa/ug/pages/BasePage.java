package com.qa.ug.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page {

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// generic util wrappers:
	public void doClick(By locator) {
		driver.findElement(locator).click();
	}


}
