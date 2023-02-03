package org.testngg;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FinalClass extends Facebook {

	@Parameters({"user","pass"})
	@Test
	public void aj(String s1, String s2) throws InterruptedException
	{
		brower();
		urlpass("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement locator = locator("email","email");
		Thread.sleep(2000);
		sendkey(locator, s1);
		Thread.sleep(2000);
		WebElement locator1 = locator("id","pass");
		Thread.sleep(2000);
		sendkey(locator1, s2);
		WebElement login = locator("name","login");
		Thread.sleep(3000);
        login.click();		
	}
}