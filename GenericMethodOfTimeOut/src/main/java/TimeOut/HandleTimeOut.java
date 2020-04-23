package TimeOut;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandleTimeOut
{
	private WebDriver driver;	
	public void setUp() 
	{
	     System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\BrokenImage\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://ugweb.ugdevops.com/");
		 driver.manage().window().maximize();
		
		 WebElement loginBtn=driver.findElement(By.xpath("//a[text()='Log In']"));
	}
	public WebElement element(By locater){
	    Integer timeoutLimitSeconds = 20;
	    WebDriverWait wait = new WebDriverWait(driver, timeoutLimitSeconds);
	    try {
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(locater));
	    }
	    catch(TimeoutException e){
	        throw new NoSuchElementException(locater.toString());
	    }
	    WebElement element = driver.findElement(locater);
	    return element;
	}
	
	
}
