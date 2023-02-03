package org.dataporv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static WebDriver driver;

	public static void browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public void urlpass(String url)
	{
	driver.get(url);	
	}
	
	public WebElement locator(String Attributename, String AttributeValue)
	{
		if(Attributename.equalsIgnoreCase("id"))
		{
		WebElement userna = driver.findElement(By.id(AttributeValue));
		return userna;
		}
		else
		{
		WebElement passwo = driver.findElement(By.name(AttributeValue));
		return passwo;
		}
		}
	public static void sendkey(WebElement element, String KeysToSend)
	{
     element.sendKeys(KeysToSend);		
	}

	public static void click(WebElement element)
	{
	element.click();
	}
}

