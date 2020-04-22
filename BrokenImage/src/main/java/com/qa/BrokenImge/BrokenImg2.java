package com.qa.BrokenImge;

	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BrokenImg2
	{
		
		 
		//private static WebDriver driver = null;
		public static void main(String[] args)     
		{
			int invalidImageCount = 0;
	  		HttpURLConnection httpURLConnection = null;
	  		 System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\BrokenLink\\src\\main\\java\\Driver\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.get("http://ugweb.ugdevops.com/");	
	
				

		        List<WebElement> imagesList = driver.findElements(By.tagName("img")); 
				 System.out.println("Total no. of images are " + imagesList.size()); 

				 for (WebElement imgElement : imagesList) { 
				  if (imgElement != null) { 
				   try { 
				    HttpClient client = HttpClientBuilder.create().build(); 
				    HttpGet request = new HttpGet(imgElement.getAttribute("src")); 
				    HttpResponse response = client.execute(request); 

				    // verifying response code he HttpStatus should be 200 if not, 
				    // increment as invalid images count 

				    if (response.getStatusLine().getStatusCode() != 200) 
				    	
				      invalidImageCount++; 
				    } catch (Exception e) { 
				      e.printStackTrace(); 
				    }
				   } 
				  } 

				 System.out.println("Total no. of invalid images are " + invalidImageCount);
	 
	}

}
