package Seleniumprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
public class ReadExcel {
			
		public static Object[][] readData(String fileName){
			File file;
			FileInputStream fis;
			Object[][] obj = new Object[3][2];
			
			try {
			file = new File(fileName);
			fis = new FileInputStream(file);
		 
			XSSFWorkbook workbook = new XSSFWorkbook(fis); // XSSF -> xlsx- after 2013, xls - older version
			XSSFSheet sheet = workbook.getSheetAt(0); //workbook.getSheet("Sheet1")
		  
			
			int rowCount = sheet.getLastRowNum();
			System.out.println("Row Count: "+rowCount);
			Row row;
			Cell cell;
			int lastCell;
		  
			for(int i=1, i1=0; i<=rowCount; i++, i1++) {  //i =1 means selection 2nd row in xl sheet
				row = sheet.getRow(i);
				lastCell = row.getLastCellNum(); // getting total no of cell in the row
				System.out.println("Cell Count: "+lastCell);
				
				for(int j=0;j<lastCell;j++) {  // this loop is to traverse each cell in row
					//cell = sheet.getRow(i).getCell(j);
					obj[i1][j] = sheet.getRow(i).getCell(j).getStringCellValue(); 
					//obj[i][j] = sheet
	 				
					System.out.println("iteration "+ i +": " +obj[i1][j]);
					
				//System.out.println(i-1 + " " + j + obj[i][j]);
					}
				}
			workbook.close();
			
			}catch(FileNotFoundException fnf) {
			System.out.println("File name is not correct");
			}catch(IOException ioe) {
				System.out.println("Not able to read or write, pls check");
				}
			return obj;
		}
	}


