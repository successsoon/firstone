package com.pom.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassClassCreation {
	public static WebDriver driver;
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\SUCCESS\\PomTest\\lib1\\chromedriver.exe");
	}
	public void loadDriver() {
		driver = new ChromeDriver();
		
	}
	public void loadUrl(String url) {
		driver.get(url);
	}
	public void windowMaximize() {
		driver.manage().window().maximize();
	}
	public void typeData(WebElement element,String data) {
		element.sendKeys(data);
		
	}
	public void functionClick(WebElement element) {
		element.click();
	}
	
	public String getExcelData(int rowno,int collno) throws IOException {
		File f = new File("C:\\Users\\moham\\eclipse-workspace\\BaseClassCreation\\ExcelData\\TOUR EXCEL DATA.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);

		Sheet s = w.getSheet("DATA");
	Row r = s.getRow(rowno);
	Cell c = r.getCell(collno);
	String name = null;
	int type = c.getCellType();
	if(type==1) {
	name = c.getStringCellValue();

	}
	if(type==0) {
	if(DateUtil.isCellDateFormatted(c)) {
		name = new SimpleDateFormat("dd-mmm-yy").format(c.getDateCellValue());

	}
	else {
		name = String.valueOf((long)c.getNumericCellValue());
	}

	}
	return name;



	}
	
	
public void updateData(int rowno,int cellno,String orderno) throws IOException {
	File f = new File("C:\\Users\\moham\\eclipse-workspace\\SUCCESS\\PomTest\\excel\\TOUR EXCEL DATA.xlsx");
	FileInputStream fis = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fis);

	Sheet s = w.getSheet("DATA");
Row r = s.getRow(rowno);
Cell c = r.createCell(cellno);
c.setCellValue(orderno);
FileOutputStream fos = new FileOutputStream(f);
w.write(fos);
fos.close();
}

public void waitFunction() {
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}

}
