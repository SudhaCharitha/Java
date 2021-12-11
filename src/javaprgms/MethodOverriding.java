package javaprgms;

class Sample1{
	String empName = "Selenium";
	void display() {
		System.out.println("In class A: " + empName);
	}
}

class Sample2 extends Sample1{
	String empName = "Selenium Traiing";
	void display() {
		System.out.println("In class B: " + empName);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 s2 = new Sample2();
		s2.display();
		
		Sample1 s1 = new Sample2();  // up casting
		s1.display();
		
		Sample1 sam1 = new Sample2(); 
		Sample2 s=(Sample2)sam1;          //downcasting
		s.display();
		
		

	}

}
