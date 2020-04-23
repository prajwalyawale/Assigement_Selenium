package TimeOut;

import org.openqa.selenium.By;

public class Runner extends HandleTimeOut {

		
		public static void main(String[] args, By loginBtn) 
		{
			HandleTimeOut ele= new HandleTimeOut();
			ele.setUp();
			ele.element(loginBtn);
			
		}
	}


