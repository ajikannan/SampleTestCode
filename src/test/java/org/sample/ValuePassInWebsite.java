package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ValuePassInWebsite {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File file=new File("E:\\\\MS Office\\\\selenium.xlsx");		
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		username.sendKeys(value);
		System.out.println(value);
		
		Row row2 = sheet.getRow(2);
		Cell cell2 = row2.getCell(2);
		String value2 = cell2.getStringCellValue();
		WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys(value2);
		WebElement button = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		button.click();
		System.out.println(value2);

		
	}

}
