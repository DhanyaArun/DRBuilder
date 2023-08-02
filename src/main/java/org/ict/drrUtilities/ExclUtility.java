package org.ict.drrUtilities;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
public class ExclUtility {
public static XSSFWorkbook excelWbook;
public static XSSFSheet excelSheet,celltype;

 public static String getData(int rowNum,int colNum) throws IOException {
	
	 FileInputStream  inp=new FileInputStream("C:\\my_java\\swtesting\\drr\\src\\main\\resources\\register.xlsx");
	    excelWbook=new XSSFWorkbook(inp);
	    excelSheet=excelWbook.getSheetAt(0);
	    return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
 }
 public static long getNumericData(int rowNum,int colNum) throws IOException {
		
	 FileInputStream  inp=new FileInputStream("C:\\my_java\\swtesting\\drr\\src\\main\\resources\\register.xlsx");
	    excelWbook=new XSSFWorkbook(inp);
	    excelSheet=excelWbook.getSheetAt(0);
	    return (long)excelSheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
 }

}
