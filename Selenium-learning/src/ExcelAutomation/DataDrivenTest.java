package ExcelAutomation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	public static Object[][] testData(String sheetname) {
		try {
			File fs = new File("./TestData/DataSheet2");
			FileInputStream fins = new FileInputStream(fs);
			XSSFWorkbook workbook = new XSSFWorkbook(fins);
			XSSFSheet sheet = workbook.getSheet(sheetname);
			
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(0).getLastCellNum();
			
			Object data[][]=new Object[rows][cols];
			
			for(int i=0; i<=rows; i++) {
				for(int j=0; j<=cols; j++) {
					data[i][j] = sheet.getRow(i+1).getCell(j).toString();	
					}
			}
			return data;
			
		}catch(Exception e) {
			System.out.println("Exception raised at runtime:"+e);
			}
		return null;
	}
	@Test(dataProvider = "createTestData")
	public void getData(Object name, Object surname, Object email, Object password) {
		
		System.out.println("Name is :"+name);
		System.out.println("Lastname is :"+surname);
		System.out.println("Email address is :"+email);
		System.out.println("Password is :"+password);
	}
	@DataProvider
	public Object[][] createTestData(){
		Object[][] data = DataDrivenTest.testData("testData");
		return data;
	}
}
	
	
	
		
			
			


