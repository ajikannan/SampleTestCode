package org.junitfuns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
	
	public static WebDriver driver;
	    
	@BeforeClass
	public static void driverf()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Assert.assertTrue(true);		

		
	}
	@Before
	public void broswer() throws InterruptedException
	{
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	Assert.assertTrue(true);		

	System.out.println("Chrome Browser Launched");
	}

	@Test
	public void usenamepassword()
	{
		driver.findElement(By.name("email")).sendKeys("Ajithkannan1712@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("517Ajith@alagu");
		Assert.assertTrue(true);		

		System.out.println("Data was Passed sucessfully");
		
	}
	@After
	public void login()
	{
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(true);		

		System.out.println("Login was Clicked");
	}

	@AfterClass
	 public static void Sucess()
	 {
		Assert.assertTrue(false);		
		System.out.println("Sucessfully Launched");

		
	 }
}
