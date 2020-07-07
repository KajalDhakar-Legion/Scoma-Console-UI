package com.scoma.utilities;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	XSSFSheet sheet;
	XSSFWorkbook workbook;
	XSSFCell cell;
	XSSFRow row;
	
	public ExcelUtility(String excelPath) 
	{
		try 
		{
			File path = new File(excelPath);
			FileInputStream fio = new FileInputStream(path);
			workbook = new XSSFWorkbook(fio);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public String getExcelFile(String sheetName, int rowNum, int column)
	{
		sheet = workbook.getSheet(sheetName);
		String data = sheet.getRow(rowNum).getCell(column).getStringCellValue();
		//System.out.print("data"+data);
		return data;
	}

}
