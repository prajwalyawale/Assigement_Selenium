package SeleniumWait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFluentWiat
{
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\SeleniumWait\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement firstname= driver.findElement(By.name("firstname"));
		WebElement lastname= driver.findElement(By.name("lastname"));
		WebElement Mobile= driver.findElement(By.name("reg_email__"));
		WebElement NewPassword= driver.findElement(By.name("reg_passwd__"));

		sendKeys(driver, firstname, 10, "Prajwal");
		sendKeys(driver, lastname, 20, "Yawale");
		sendKeys(driver, Mobile,10, "8421151456");
		sendKeys(driver, NewPassword,10, "Prajwaly");

		WebElement forgotAccount= driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver,forgotAccount, 10);
		
		 @SuppressWarnings("deprecation")
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			        .withTimeout(30, TimeUnit.SECONDS)
			        .pollingEvery(5, TimeUnit.SECONDS)
			        .ignoring(NoSuchElementException.class);
	}
		public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value)
		{
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		}
		public static void clickOn(WebDriver driver1, WebElement element, int timeout)
		{
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}

}
