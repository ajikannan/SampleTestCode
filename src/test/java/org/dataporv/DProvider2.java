package org.dataporv;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider2 extends Facebook{
	
	@DataProvider(name="Datas")

     private Object[][] getDatas()
     {
		return new Object[][]
				{
			{"ajithkannan1712@gmail.com","517Ajith@alagu"},
			{"nmkajith055@gmail.com","517Ajith@alagu"},
			{"ajith@gmail.com","517Ajith@alagu"},
			{"nmkaj89rr@gmail.com","517Ajith@alagu"},
			{"ravirajan34@gmail.com","517Ajith@alagu"}
				};
     }

@Test(dataProvider="Datas")
private void DP(String username, String Password) throws InterruptedException
{
browser();
urlpass("https://www.facebook.com/");
WebElement locator = locator("email","email");
Thread.sleep(2000);
sendkey(locator, username);
WebElement locator2 = locator("id","pass");
Thread.sleep(2000);
sendkey(locator2, Password);
Thread.sleep(2000);
WebElement locator3 = locator("name","login");
locator3.click();

}
}