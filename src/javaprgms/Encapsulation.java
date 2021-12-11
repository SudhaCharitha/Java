package javaprgms;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {

				EmployeeInfo employeeInfo = new EmployeeInfo();  
			
				System.out.println("Enter the emp no: ");
				Scanner sc = new Scanner(System.in);  //100
				int empNo = sc.nextInt();  //nextLine();
				sc.nextLine();
				//employeeInfo.setempID(100);
				employeeInfo.setEmpID(empNo);
				//employeeInfo.empID = 123;
				
				
				System.out.println("Enter employee name: ");
				String empName = sc.nextLine();
				
				//System.out.println(empNo + "\t" + empName);
				
				employeeInfo.setEmpName(empName);

				System.out.println("The employee details are: ");
				System.out.println("Emp ID: " + employeeInfo.getEmpID());
				System.out.println("Emp Name: " + employeeInfo.getEmpName());


	}

}
