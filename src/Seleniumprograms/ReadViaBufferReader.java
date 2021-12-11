package Seleniumprograms;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadViaBufferReader {
	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			File file = new File(".//InputData.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			int i=1;
			String readData;
			while((readData = br.readLine()) != null) {
				System.out.println("Read: " + i++ + " --> " + readData);
			}
		}

	}

