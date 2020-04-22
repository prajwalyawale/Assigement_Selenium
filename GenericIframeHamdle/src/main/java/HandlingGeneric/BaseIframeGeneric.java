package HandlingGeneric;

     		import java.io.FileInputStream;
			import java.io.FileNotFoundException;
			import java.io.IOException;
			import java.util.Properties;
			import java.util.concurrent.TimeUnit;

			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebDriver.Timeouts;
			import org.openqa.selenium.chrome.ChromeDriver;
			import org.openqa.selenium.firefox.FirefoxDriver;


			public class BaseIframeGeneric{
			public static WebDriver driver;
			    public static Properties prop;
			public BaseIframeGeneric()
			{
			try {
			prop=new Properties();

			//FileInputStream ip=new FileInputStream(System.getProperty("user dir")+"./src/main/java/com/freeHRMS/qa/config/Configuation.properties");
			FileInputStream ip=new FileInputStream("D:\\Workspace2\\GmailApplication\\configTest\\config.properties");
			prop.load(ip);
			//System.out.println(ip);
			} catch (FileNotFoundException e)
			{
			e.printStackTrace();

			}
			catch(IOException e)
			{
			e.printStackTrace();
			}

			}
			public static void initalization()
			{
			String browserName=prop.getProperty("browser");
			if(browserName.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "E:\\Learning\\eclipseWorkspace\\GenericIframeHamdle\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			}else if(browserName.equals("FF"))
			{
			System.setProperty("webdriver.firefox.driver", "E:\\Learning\\eclipseWorkspace\\GenericIframeHamdle\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();

			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			try {
				Thread.sleep(3000);
				driver.get(prop.getProperty("url"));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			


			}

			
			
		
	}


