package javaprgms;

class EmployeeDetails{
	
	int empNo = 123;
	String empName = "Naveena";
	
	void displayDetails() {  //method definition
		System.out.println("Emp No: " + empNo +"\t" + "Emp Name: " + empName);
	}
}
public class DataAbstraction {

	public static void main(String[] args) {
	
				EmployeeDetails e1 = new EmployeeDetails();
				
				System.out.println("Accessing variable directly");
				System.out.println(e1.empNo);
				
				System.out.println("Accessting via Method");
				e1.displayDetails();

	}

}
