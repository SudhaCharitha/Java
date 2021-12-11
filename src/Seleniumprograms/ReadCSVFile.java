package Seleniumprograms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVFile {

		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub

			File file = new File(".//InputDataCSVFormat.csv");
		    Scanner sc = new Scanner(file);
		    
		    int i=1;
		    sc.useDelimiter(",");
		    
		    while(sc.hasNext()) {
		    System.out.println("Read: " + i++ +" --> " + sc.next());
		    }
		    sc.close();
		}

}
