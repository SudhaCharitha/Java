package javaprgms;

import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rollno=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			rollno[i]=sc.nextInt();
		}
		System.out.println("The array elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(rollno[i]+ "\t");
		}
		    
	}

}
