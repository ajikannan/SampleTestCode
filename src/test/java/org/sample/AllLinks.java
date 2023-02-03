package org.sample;

import java.awt.Point;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {
	@BeforeClass
 	public static void test() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 List<WebElement> ele = driver.findElements(By.tagName("site-header"));
		 System.out.println(ele);
		int a= links.size();
		 for (int i=0; i<a; i++)
		 {
			 System.out.println(links.get(i).getText());
		 }
	}
	@Before
	public void test1() {
	
	//this.test();
	
	}
	@Test
	public void test2() {
		System.out.println("Test2");
      
	}
	@Test
	public void test3() {
		System.out.println("Test3");

	}
	@After
	public void test4() {
		System.out.println("Test4");

	}
	@AfterClass
	public static void test5() {
		System.out.println("Test5");

	}
}
