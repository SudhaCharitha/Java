package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				HashSet<Float> hashSet = new HashSet<Float>();
				
				hashSet.add(3.14f);
				hashSet.add(5.432f);
				hashSet.add(892.214f);
				hashSet.add(3.14f); //will be overwritten the existing value not accepting duplicates
				
				System.out.println("The elements are: ");
				for(Float f : hashSet)
					System.out.print(f + "\n");
				
				System.out.println("\n");
				
				hashSet.remove(5.432f);
				
				System.out.println("\nThe elements after removing: ");
				for(Float f : hashSet)
					System.out.print(f + "\n");
				

	}

}
