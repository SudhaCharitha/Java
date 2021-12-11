package javaprgms;

public class StringOperations {

	public static void main(String[] args) {
		String s= "Charitha Gandikota ";
		String s1="QA Engineer";
		String s2= "Gandikota ";
         char c=s.charAt(5);
         System.out.println("The chatacter at index 5 in S is" +c);
         int a=s.compareTo(s1);
         System.out.println("Comparision of 2 strings:" +a);
         String con=s.concat(s1);
         System.out.println("Concatenation of \"2\" strings: " +con);
         Boolean co=s.contains(s2);
         System.out.println(co);
	}
}
