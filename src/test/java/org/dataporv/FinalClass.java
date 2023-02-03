package org.dataporv;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FinalClass extends Facebook{

@Test(dataProvider="Datas",dataProviderClass=Data.class)
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