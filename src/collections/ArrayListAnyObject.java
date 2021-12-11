package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAnyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					ArrayList a = new ArrayList();
					
					a.add(23);
					a.add("Selenium");
					a.add(3.45f);
					
					System.out.println("ArrayList with any objects");
					for(Object s1 : a)
						System.out.print(s1 + " ");		
				}
			}

