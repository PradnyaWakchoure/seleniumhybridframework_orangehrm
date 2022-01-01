package com.orangehrm.hybridframe_demo.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook workbook;
	
	public ExcelDataProvider(String excelDataPath) {
		try {
			File fs = new File(excelDataPath);
			FileInputStream fins = new FileInputStream(fs);
			workbook = new XSSFWorkbook(fins);
			
		}
	catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		public int getNumericCellData(String sheetname, int row, int col) {
			return (int)workbook.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
			
		}
		
		public int getNumericCellData(int sheetindex, int row, int col) {
			return (int)workbook.getSheetAt(sheetindex).getRow(row).getCell(col).getNumericCellValue();
			
		}
		public String getStringCellData(String sheetname, int row, int col) {
			return workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
		}
		
		public String getStringCellData(int sheetindex, int row, int col) {
			return workbook.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
		}
}
			
			
	


