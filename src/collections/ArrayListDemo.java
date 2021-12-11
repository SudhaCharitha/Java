package collections;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          	ArrayList<String> a1 = new ArrayList<String>();
				
				/*
				 * Wrapper Class
				 * String
				 * Integer - int
				 * Float - float
				 * Double - double
				 */
				
				a1.add("Anbu");  //a1.add(123);
				a1.add("Aishwarya");
				a1.add("Deepa");
				a1.add("Suie");
				a1.add("Deepa");
				
				//arrayList.add(100);
				
				System.out.println("Element is arraylist");
				System.out.println(a1);
				
				System.out.println("One way of displaying items in the ArrayList\n");
				System.out.println("Printing elements via Iterator");
				
				int count = 0;
				Iterator itr = (Iterator) a1.iterator();  //syntax 
				while(itr.hasNext()) {
//					if(count<1) {
//						count++;
//						itr.next();
//					}
					System.out.print(itr.next() + "\n"); 
				}
					
				System.out.println("\n");
				
				System.out.println("Printing elements with for loop");
				
				count = 0;
				for(String s1 : a1) {   // for(datatype varname : object)
//					if(count++ == 0) 
//						continue;
					System.out.print(s1 + " ");
				}
				a1.remove("Deepa"); //arrayList.remove(1)
				System.out.println("\n\nAfter removing the Element");
				
				for(String s1 : a1)
					System.out.print(s1 + " ");			

	}

}
