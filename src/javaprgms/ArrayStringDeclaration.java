package javaprgms;

import java.util.Scanner;

public class ArrayStringDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("n=" +n);
		System.out.println("Enter the String");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextLine();
			
		}
		System.out.println("The String is");
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}

	}

}
