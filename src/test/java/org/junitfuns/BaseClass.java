package org.junitfuns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void URLLaunch()
	{
		driver.get("https://facebook.com/");
	}
	public static WebElement idLocator(String attributevalue)
	{
		WebElement findElement = driver.findElement(By.id(attributevalue));
		return findElement;
	}
	
	public static WebElement nameLocator(String attributevalue)
	{
		WebElement findElement = driver.findElement(By.name(attributevalue));
		return findElement;
	}
	public static void webelements(WebElement element, String sendkeys)
	{
		element.sendKeys(sendkeys);
	}
}