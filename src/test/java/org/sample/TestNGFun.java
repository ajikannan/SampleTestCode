package org.sample;

import java.net.URL;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGFun {
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
		driver.get("https://dribbble.com/signup/new");
	}
	@Test
	private void createlogin()
	{
		driver.findElement(By.name("user[name]")).sendKeys("Ajith Alaguraja");
		driver.findElement(By.name("user[login]")).sendKeys("ajithkannan1712");
	}
	@Test
	private void username()
	{
		driver.findElement(By.name("user[email]")).sendKeys("ajithkannan1712@gmail.com");
		driver.findElement(By.name("user[password]")).sendKeys("517Ajith@alagu");
	}	
	@Test
	private void click()
	{
		driver.findElement(By.name("user[agree_to_terms]")).click();
		driver.findElement(By.name("commit")).click();
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