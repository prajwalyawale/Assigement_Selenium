package HomeTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HandlingGeneric.BaseIframeGeneric;
import HandlingGeneric.HomePage;

public class TC_Home extends BaseIframeGeneric 

{

	HomePage Homepag;
	
	public TC_Home()
	{
		super();
	}
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		initalization();
		Homepag=new HomePage();

}

	@Test(priority=1)
	public void GetHomePageTitle()
	{
		String title=((HomePage) HomePage.driver).vaidatetitle();
		
		System.out.println("Title of Home Page"+title);
	}
	
	@Test(priority=2)
	public void GetFrame()
	{
	
		HomePage.switchToFrame("Frame1");
		
		
	}
	
}
