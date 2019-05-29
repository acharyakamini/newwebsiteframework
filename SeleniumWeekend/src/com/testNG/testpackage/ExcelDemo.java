package com.testNG.testpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelDemo {
	@Test
	public void takeDataFromExcelFile() throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream("/Users/kamini/Documents/newworkspace1/SeleniumWeekend/Test Data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String Username = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String Password = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(Username + ":" + Password);
	}
	

}
