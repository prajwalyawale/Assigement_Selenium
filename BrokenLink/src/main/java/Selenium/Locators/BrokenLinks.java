package Selenium.Locators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	private static WebDriver driver = null;
	public static void main(String[] args)     
	{
  		HttpURLConnection httpURLConnection = null;
  		 System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\BrokenLink\\src\\main\\java\\Driver\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://ugweb.ugdevops.com/");	
			 
 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i = 0 ; i < links.size();i++)
		{
			String resourceUrl = links.get(i).getAttribute("href");
			try 
			{
				httpURLConnection = (HttpURLConnection)(new URL(resourceUrl).openConnection());
				httpURLConnection.connect();
				System.out.println("Valid url :: "   +resourceUrl );
				System.out.println("Response Code::" +httpURLConnection.getResponseCode());	//200 for Valid HyperLinks
				
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
				System.out.println("Broken url :: "   +resourceUrl );
			}
		}
 
		driver.quit();
 
	}
}