package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
				
				HashMap<String, String>hashMap1 = new HashMap<String, String>();
				
				hashMap.put(6, "A");
				hashMap.put(2, "B");
				hashMap.put(1, "C");
				hashMap.put(5, "ba");
				hashMap.put(6, "ART");  //exiting value will be over written
				hashMap.put(3, "E");
			     hashMap1.put(null, "Sele");
				 hashMap1.put(null, null);
				 hashMap1.put("A", null);
//				
				// HashMap allows Null key and Null value
				//hashMap1.put(null, null);
				
				System.out.println(" The Key and Values are ");
				
				for(Entry<Integer, String> map : hashMap.entrySet())
					System.out.println("The Key: " + map.getKey() + "\tThe Value: " + map.getValue());
				for(Entry<String, String> map : hashMap1.entrySet())
					System.out.println("The Key: " + map.getKey() + "\tThe Value: " + map.getValue());
				
	}

}
