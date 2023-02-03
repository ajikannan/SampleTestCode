package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException, InterruptedException {
	     	
	File file=new File("E:\\MS Office\\selenium.xlsx");
	FileInputStream filestream = new FileInputStream(file);
	Workbook book = new XSSFWorkbook(filestream);
    org.apache.poi.ss.usermodel.Sheet st = book.getSheet("Sheet1");
    int lastRowNum = st.getLastRowNum()-st.getFirstRowNum();
	Thread.sleep(2000);
	Row row = st.getRow(2);
    Thread.sleep(2000);
	Cell cell = row.getCell(0);
	String value = cell.getStringCellValue();
	System.out.println(value);
    
	}

}
