package ExcelAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSX_Writer1 {

	public static void main(String[] args) {
		try {
			File fs = new File("./TestData/DataSheet.xlsx");
			FileInputStream fins = new FileInputStream(fs);
			XSSFWorkbook workbook = new XSSFWorkbook(fins);
			XSSFSheet xssf_sheet = workbook.getSheetAt(0);
			
			System.out.println(xssf_sheet.getRow(0).getCell(0).getStringCellValue());
			xssf_sheet.getRow(0).createCell(3).setCellValue("Mobile");
			xssf_sheet.getRow(1).createCell(3).setCellValue("84858674234");
			
			FileOutputStream fout = new FileOutputStream(fs);
			workbook.write(fout);
		}     catch(Exception  e)
		{
			System.out.println("Exception raised" +e);
		}
	}
}
	


