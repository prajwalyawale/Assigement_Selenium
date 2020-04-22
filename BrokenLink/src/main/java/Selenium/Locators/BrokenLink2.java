package Selenium.Locators;
	import java.io.IOException;  
	 import java.net.HttpURLConnection;  
	 import java.net.MalformedURLException;  
	 import java.net.URL;  
	 import java.util.List;  
	 import java.util.concurrent.TimeUnit;  
	 import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
 
	 public class BrokenLink2 
	 {  
	   private static int statusCode;  
	   public static void main(String[] args) throws IOException {  
	    
			//HttpURLConnection httpURLConnection = null;
	  		 System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\BrokenLink\\src\\main\\java\\Driver\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.get("http://ugweb.ugdevops.com/");	
				 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	 // Get all links web driver  
	   List<WebElement> links = driver.findElements(By.tagName("a")); 
	   for (int i = 0; i < links.size(); i++)
	     { 
	 //remove null and empty links  
	 if (!(links.get(i).getAttribute("href") == null) && !(links.get(i).getAttribute("href").equals(""))) {  
	  if (links.get(i).getAttribute("href").contains("http")) {  
	 statusCode= getResponseCode(links.get(i).getAttribute("href").trim());  
	 // Check broken link  
	 if (statusCode== 404) {  
	 System.out.println("Broken of Link# "+i+" "+links.get(i).getAttribute("href"));  
	           }  
	         }  
	       }  
	     }  
	     driver.close();  
	   }  
	 public static int getResponseCode(String urlString) throws MalformedURLException, IOException {      
	     URL u = new URL(urlString);  
	     HttpURLConnection huc = (HttpURLConnection) u.openConnection();  
	     huc.setRequestMethod("GET");  
	     huc.connect();  
	     return huc.getResponseCode();  
	  }  
	 }  
	
	


