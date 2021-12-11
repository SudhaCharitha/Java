package Seleniumprograms;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteIntoExcel {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try {
				String[][] data = {{"EMP Name", "Salary"},
									{"Deva Raj","45231.67"},
									{"Arasi","32531.34"}
									};
				
				File file = new File("./WriteData1.xlsx");
				FileInputStream fis = new FileInputStream(file);
				
				XSSFWorkbook workbook = new XSSFWorkbook(fis); 
				XSSFSheet sheet = workbook.getSheet("Sheet1");
				
				for(int i=0; i<3; i++) {
					Row row = sheet.createRow(i);
					for(int j=0; j<2; j++) {
						Cell cell = row.createCell(j);
						cell.setCellValue(data[i][j]);
					}
				}
				
				FileOutputStream fos = new FileOutputStream(".\\WriteData1.xlsx");			
				workbook.write(fos);
				System.out.println("Data Written Successfully");
				
				fos.close();
				
					}catch(FileNotFoundException fe) {
						System.out.println("File name or file path is not correct");
					}catch(IOException ie) {
						System.out.println("IO Exception");
					}
		}

	}

