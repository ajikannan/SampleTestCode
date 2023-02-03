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

public class AllDataFetch {
	public static void main(String[] args) throws IOException {
		//Location
		File file=new File("E:\\MS Office\\selenium.xlsx");
	    
		//FileInput
		FileInputStream fileinput= new FileInputStream(file);
		
		//Workbook
		
		Workbook book=new XSSFWorkbook(fileinput);
		
		Sheet sheet = book.getSheet("sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	
			Row row = sheet.getRow(i);
			
	   for(int j=0; j<row.getPhysicalNumberOfCells(); j++)
	   {
		   
			Cell cell = row.getCell(j);
			String value = cell.getStringCellValue();
			System.out.print(value+""+"\t");
			

	   }
	   System.out.println();

		}
	
	}

}
