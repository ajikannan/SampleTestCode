package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

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

public class AH {
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://limohirelondon.co.uk/");
		File file=new File("E:\\MS Office\\selenium.xlsx");		
		Workbook book=new XSSFWorkbook();
		Sheet createSheet = book.createSheet();
		//String text = driver.findElement(By.xpath("(//p[contains(text(),'Limo')])[2]")).getText();
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		
        for(WebElement link:findElements)
        {
        	String attribute = link.getAttribute("href");
        	System.out.println(attribute);
        
		for(int i=0; i<10; i++)
		{
			Row createRow = createSheet.createRow(i);
	    for(int j=0; j<10;j++)
	    {
			Cell createCell = createRow.createCell(j);
			createCell.setCellValue(attribute);    	
	    }
	}
}
		FileOutputStream stream=new FileOutputStream(file);
        book.write(stream);		
        
}
}