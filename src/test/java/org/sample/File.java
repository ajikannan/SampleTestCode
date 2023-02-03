package org.sample;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File {
public static void main(String[] args) throws InterruptedException, IOException {
	   WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
 // To Maximize browser screen       
//    FileInputStream fs = new FileInputStream("C:\\LoginDetails.xls");
         driver.manage().window().maximize();    
        //  baseUrl = "http://openspace.website/vpms/public/";
         driver.get("https://www.facebook.com/");
//       String filePath = System.getProperty("user.dir")+"\\src\\excel_read_write";
         String filePath = System.getProperty("user.dir")+"\\src";
//       FileInputStream fs = new FileInputStream(filePath);

         String FilePath = "E:\\MS Office\\selenium.xlsx";

         XSSFWorkbook wb = new XSSFWorkbook(FilePath);
         XSSFSheet s1 = wb.getSheetAt(0);
         int totalNoOfRows  = s1.getLastRowNum();
         int noOfColumns = s1.getRow(0).getPhysicalNumberOfCells();
         System.out.println(noOfColumns);
//       int totalNoOfCols = s1.getLastCellNum();
         System.out.println(noOfColumns);
         XSSFCell username,password;
          for(int i = 1; i < totalNoOfRows ; i++) {
              for (int j=0; j < noOfColumns - 1; j++) {
                     username= s1.getRow(1).getCell(j);
                     password = s1.getRow(1).getCell(i);
                     System.out.println("Username"+username);
                     System.out.println("Password"+password);
                     driver.findElement(By.id("email")).clear();
                     driver.findElement(By.id("password")).clear();
                     Thread.sleep(2000);
                     driver.findElement(By.id("email")).sendKeys(username.toString());
                     driver.findElement(By.id("pass")).sendKeys(password.toString());
                     driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
                     Thread.sleep(2000);
                     if ((driver.getPageSource().contains("Check In"))){
                             System.out.println("Successful Login verified for " +username.toString());
                             driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a")).click();
                             Thread.sleep(2000);
                         } else {
                             System.out.println("Successful Login not verified for " +username.toString());
                         }
                     }
              }
              }}
