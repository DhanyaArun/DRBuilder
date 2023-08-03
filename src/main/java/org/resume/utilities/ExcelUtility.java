package org.resume.utilities;

import java.io.IOException;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelsheet;
	
	public static String getData(int rowNum,int colNum) throws IOException
	{
		
	FileInputStream inp=new FileInputStream("D:\\Javaprograming\\DRBuilder\\src\\main\\resources\\TestData1.xlsx");
	
	excelWbook=new XSSFWorkbook(inp);
	excelsheet=excelWbook.getSheetAt(0);
	return excelsheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	}
	public static long getNumericData(int rowNum,int colNum) throws IOException {
		
		 FileInputStream  inp=new FileInputStream("D:\\\\Javaprograming\\\\DRBuilder\\\\src\\\\main\\\\resources\\\\TestData1.xlsx");
		    excelWbook=new XSSFWorkbook(inp);
		    excelsheet=excelWbook.getSheetAt(0);
		    return (long)excelsheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	 }



}
