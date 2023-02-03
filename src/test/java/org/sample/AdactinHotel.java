package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		File file=new File("E:\\MS Office\\selenium.xlsx");		
		FileInputStream stream = new FileInputStream(file);		
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		driver.findElement(By.xpath("(//input[@class='login_input'])[1]")).sendKeys(value);
		Row row2 = sheet.getRow(2);
		Cell cell2 = row2.getCell(2);
		String value2 = cell2.getStringCellValue();
		driver.findElement(By.xpath("(//input[@class='login_input'])[2]")).sendKeys(value2,Keys.ENTER);
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select s= new Select(location);
		s.selectByIndex(1);
		WebElement hotel = driver.findElement(By.name("hotels"));
	//	WebElement hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select s1=new Select(hotel);
		Thread.sleep(3000);
		s1.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select s2 = new Select(room);
		s2.selectByValue("Double");
        
        Row row3 = sheet.getRow(2);
	    Cell cell3 = row3.getCell(3);
	    CellType cellType = cell3.getCellType();
	    switch(cellType)
	    {
	    case STRING:
	    	String stringCellValue = cell3.getStringCellValue();
	    	WebElement dat = driver.findElement(By.id("datepick_in"));
	    	dat.clear();
            dat.sendKeys(stringCellValue);
	         break;
	    	
	    case NUMERIC:
	    		if(DateUtil.isCellDateFormatted(cell3))
	    		{
	    			Date dateCellValue = cell3.getDateCellValue();
	    			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    			String format2 = format.format(dateCellValue);
			WebElement date = driver.findElement(By.id("datepick_in"));
	    	date.clear();
	    	date.sendKeys(format2);
	    		}
	    		Row row4 = sheet.getRow(2);
	    		Cell cell4 = row4.getCell(4);
	    		if(DateUtil.isCellDateFormatted(cell4)) {
					Date dateCellValue = cell4.getDateCellValue();
					SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
					String format2 = format.format(dateCellValue);
					WebElement date2 = driver.findElement(By.id("datepick_out"));
					date2.clear();
					date2.sendKeys(format2);
				}
	    break;
	    
default:
	break;
	    }
	    WebElement adult = driver.findElement(By.id("adult_room"));
	    Select s3=new Select(adult);
	    s3.selectByVisibleText("2 - Two");
	    WebElement child = driver.findElement(By.id("child_room"));
	    Select s4=new Select(child);
	    s4.selectByVisibleText("1 - One");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("radiobutton_0")).click();
        driver.findElement(By.name("continue")).click();
        
        Row row4 = sheet.getRow(2);
        Cell cell4 = row4.getCell(5);
        String stringCellValue = cell4.getStringCellValue();
        driver.findElement(By.name("first_name")).sendKeys("stringCellValue");
        
        Row row5 = sheet.getRow(2);
        Cell cell5 = row5.getCell(6);
        String value3 = cell5.getStringCellValue();
        driver.findElement(By.name("last_name")).sendKeys(value3);
        
        Row row6 = sheet.getRow(2);
        Cell cell6 = row6.getCell(7);
        String value4 = cell6.getStringCellValue();
        driver.findElement(By.name("address")).sendKeys(value4);
        
        Row row7 = sheet.getRow(2);
        Cell cell7 = row7.getCell(8);
        double value6 = cell7.getNumericCellValue();
        BigDecimal valueOf = BigDecimal.valueOf(value6);
        String string = valueOf.toString();
        driver.findElement(By.name("cc_num")).sendKeys(string);
        WebElement type = driver.findElement(By.name("cc_type"));
        Select s5= new Select(type);
        s5.selectByValue("VISA");
        WebElement month = driver.findElement(By.name("cc_exp_month"));
        Select s6= new Select(month);
        s6.selectByValue("3");
        WebElement year = driver.findElement(By.name("cc_exp_year"));
        Select s7= new Select(year);
        s7.selectByVisibleText("2022");
        Row row8 = sheet.getRow(2);
        Cell cell8 = row8.getCell(9);
        double value5 = cell8.getNumericCellValue();
        int x1=(int)value5;
        BigDecimal valueOf2 = BigDecimal.valueOf(x1);
        String string2 = valueOf2.toString();
        driver.findElement(By.name("cc_cvv")).sendKeys(string2);
        driver.findElement(By.name("book_now")).click();	
        Thread.sleep(3000);
	   // JavascriptExecutor jsd= (JavascriptExecutor) driver;
	  //     WebElement order = driver.findElement(By.name("order_no"));
	     //  Object val = jsd.executeScript("return arguments[0].getAttribute('value')", order);
	       //System.out.println(val);
	}
}
//   case NUMERIC:
//double numericCellValue = cell3.getNumericCellValue();
//int x=(int)numericCellValue;
//BigDecimal valueOf = BigDecimal.valueOf(x);
//String string = valueOf.toString();
//WebElement date = driver.findElement(By.id("datepick_in"));
//date.clear();
//date.sendKeys(string);
	//break;
