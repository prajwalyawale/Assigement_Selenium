package HandlingGeneric;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseIframeGeneric 
{
	@FindBy(id="frame2")
	WebElement Frame1;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
		
	public String vaidatetitle()
	{
		return driver.getTitle();
		
	}
	public static void switchToFrame(WebElement Frame1 ) {
		try {
			if (isElementPresent(Frame1)) {
				driver.switchTo().frame(Frame1);
				System.out.println("Navigated to frame with element "+ Frame1);
			} else {
				System.out.println("Unable to navigate to frame with element "+ Frame1);
			}
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with element " + Frame1 + e.getStackTrace());
		} catch (StaleElementReferenceException e) {
			System.out.println("Element with " + Frame1 + "is not attached to the page document" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to frame with element " + Frame1 + e.getStackTrace());
		}
	}

	private static boolean isElementPresent(WebElement frame2) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void switchToFrame(String string) {
		// TODO Auto-generated method stub
		
	}


		

		
		}

		
	}


