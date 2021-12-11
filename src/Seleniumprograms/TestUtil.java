package Seleniumprograms;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	
		
		public static String[] readExcelData(String fileName, int rowNo) {
			
			String[] data;
			File file;
			FileInputStream fis = null;
			XSSFWorkbook workBook = null;
			
			file = new File(fileName);
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				workBook = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			XSSFSheet sheet = workBook.getSheet("Input");  //workBook.getSheetAt(0)
			
			int rowCount = sheet.getLastRowNum();
			System.out.println("Total No of Rows: " + rowCount);
			
			int cellCount = sheet.getRow(rowNo).getLastCellNum();
			data = new String[cellCount];
			
			for(int i=0; i<cellCount; i++) {
				
				data[i] = sheet.getRow(rowNo).getCell(i).getStringCellValue();
			}
			
			return data;
				}


}
