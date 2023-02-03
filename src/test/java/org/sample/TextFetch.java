package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

public class TextFetch {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://weddingcarhire.co.uk/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'perfect')]"));
		String a=element.getText();
		System.out.println(a);
		File file= new File("E:\\MS Office\\aji.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet();
		Row row = sheet.createRow(3);
		Cell cell = row.createCell(2);
		cell.setCellValue(a);
		WebElement el = driver.findElement(By.tagName("body"));
		System.out.println(el.getText());
		Row row2 = sheet.createRow(2);
		Cell cell2 = row2.createCell(1);
		
		//cell2.setCellValue(el);
		FileOutputStream output=new FileOutputStream(file);
		book.write(output);		
	}
}