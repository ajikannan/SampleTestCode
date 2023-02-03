package org.junitfuns;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebElement;

public class BaseClass2 extends BaseClass{

	public static void main(String[] args) {
		
		browserlaunch();
		URLLaunch();
		WebElement idLocator = idLocator("email");
		webelements(idLocator, "ajithkannan1712@gmail.com");		
		WebElement idLocator2 = idLocator("pass");
		webelements(idLocator2, "517Ajith@alagu");
		WebElement nameLocator = nameLocator("login");
		nameLocator.click();
	}
	
}
