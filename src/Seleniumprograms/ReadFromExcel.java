package Seleniumprograms;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;	
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				File file;
				FileInputStream fis;
				XSSFWorkbook workbook;
				XSSFSheet sheet = null;
			
				
				try {
					String usrDir = System.getProperty("user.dir");
					file = new File(usrDir + "\\ReadData.xlsx");
					
					System.out.println(usrDir + "\\ReadData.xlsx");
					
					fis = new FileInputStream(file);
					workbook = new XSSFWorkbook(fis);
					sheet = workbook.getSheetAt(0); // workbook.getSheet("Sheet1")

					// workbook.getSheet("")

					int rowCount = sheet.getLastRowNum();

					// to read each row
					for (int i = 0; i <= rowCount; i++) {

						int cellCount = sheet.getRow(i).getLastCellNum();
						// sheet.getRow(i).getCell(0).getStringCellValue()
						for (int j = 0; j < cellCount; j++) {

							Cell cell = sheet.getRow(i).getCell(j);

							if (cell.getCellType() == CellType.NUMERIC) {
								double intValue = cell.getNumericCellValue();
								System.out.print(intValue);
							}else {
								String stringValue = cell.getStringCellValue();
								System.out.print(stringValue);
							}
							System.out.print("\t\t");
						}
						System.out.println();
					}
				} catch (FileNotFoundException fe) {
					System.out.println("File name or file path is not correct");
				} catch (IOException ie) {
					System.out.println("IO Exception");
				}
			}

}
