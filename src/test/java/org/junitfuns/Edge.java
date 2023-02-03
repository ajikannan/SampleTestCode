package org.junitfuns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge {
	
	public static WebDriver driver;
	    
	@BeforeClass
	public static void driverf()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		System.out.println("Browser Launched");
		Assert.assertTrue(true);		
	}
	@Before
	public void broswer() throws InterruptedException
	{
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	Assert.assertTrue(true);		
	System.out.println("URL Launched");

	}

	@Test
	public void usenamepassword()
	{
		driver.findElement(By.name("email")).sendKeys("Ajithkannan1712@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("517Ajith@alagu");
		Assert.assertTrue(false);		
		System.out.println("Data was Passed sucessfully");
		
	}
	@After
	public void login()
	{
		driver.findElement(By.name("login")).click();
		System.out.println("Login was Clicked");
	}

	@AfterClass
	 public static void Sucess()
	 {
		System.out.println("Sucessfully Launched");
		String error="The email address you isn't connected to an account. Find your account and log in.";
		String text = driver.findElement(By.xpath("//div[contains(text(),\"address\")]")).getText();
		Assert.assertEquals(error,text);
		

		
	 }
}
