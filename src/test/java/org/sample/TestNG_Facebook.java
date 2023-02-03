package org.sample;

import java.net.URL;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Facebook {
	public static WebDriver driver;
	
	@BeforeClass
	private void browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
//	@AfterClass
//	private void AfterClass()
//	{
//		driver.close();
//	}
	@Test
	private void url() {
		driver.get("https://facebook.com/");
	}
	@Test
	private void createlogin() throws InterruptedException
	{
		driver=new EdgeDriver();
		Thread.sleep(2000);
        WebElement findElement = driver.findElement(By.id("email"));
        findElement.sendKeys("Ajithkannan1712@gmail.com");
	}	
	@Test
	private void click()
	{
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	}

	@BeforeMethod
	private void date()
	{
		Date d=new Date();
		System.out.println(d);	
	}
	
	@AfterMethod
	private void dates()
	{
	Date d = new Date();
	System.out.println(d);
	}
}