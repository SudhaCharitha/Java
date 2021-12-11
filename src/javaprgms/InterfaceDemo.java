package javaprgms;

class EmployeeDetails1 implements Employeeable, Presentable{
	public void showEmpDetails(){
		System.out.println("The emp name: "+ empName);
	}
	
	public void showPresent() {
		System.out.println("Another method from another Interface");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails1 employee = new EmployeeDetails1();
		employee.showEmpDetails();	
		employee.showPresent();


	}

}
