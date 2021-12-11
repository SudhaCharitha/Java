package Seleniumprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadViaFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

				FileReader fr = new FileReader(".//InputData.txt");
				
				int i;
				while((i=fr.read()) != -1) {
					System.out.println((char)i);
				}
			}

}

