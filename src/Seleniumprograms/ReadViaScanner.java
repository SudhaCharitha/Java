package Seleniumprograms;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadViaScanner {

		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub

			File file = new File(".//InputData.txt");
				    Scanner sc = new Scanner(file);
				  
				    int i = 1;
				    while (sc.hasNextLine())
				      System.out.println("Read: " + i++ + " --> " + sc.nextLine());
		}

	}

