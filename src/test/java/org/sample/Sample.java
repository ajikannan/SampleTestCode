package org.sample;

import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchbor = driver.findElement(By.id("twotabsearchtextbox"));
		searchbor.sendKeys("Iphone 13pro max",Keys.ENTER);
		Thread.sleep(3000);		
//		List<WebElement> element = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 13 Pro')]"));
//		for(int i=0; i<element.size(); i++)
//		{
//			String s;
//		s=element.get(i).getText();
//		System.out.println(s);
//		}
//				
List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
for(int i=0; i<price.size(); i++)
{
	String a;
	String ff="1,20,000";
	   
	   
	org.openqa.selenium.Point b;
	a=price.get(i).getText();
	b=price.get(i).getLocation();
	System.out.println(b);
	System.out.println(a.equals(ff));
	System.out.println("Price "+a);
	}

//List<WebElement> FreeDele = driver.findElements(By.xpath("//span[@aria-label='FREE Delivery by Amazon']"));
//   int fd= FreeDele.size();
//   
//   for(int i=0; i<fd; i++)
//   {
//	   String a;
//	   a=FreeDele.get(i).getText();
//	   System.out.println(a);
//	  }
	
	}
}