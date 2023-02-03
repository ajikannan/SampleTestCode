package org.sample;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	public static WebDriver driver;
	@BeforeClass
	public static void aji()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();		
	}
	@Before
	public void url() {

		driver.get("https://adactinhotelapp.com/");
	}
	@Test
	public void username_password() {
		String a="Ajith175";
		String b="1HH767";
		driver.findElement(By.id("username")).sendKeys(a);
		driver.findElement(By.id("password")).sendKeys(b);
	}
	@After
	public void Click() {
     driver.findElement(By.id("login")).click();
	}
	@AfterClass
	public static void scuess() {
System.out.println("Sucessfully");
	}

}