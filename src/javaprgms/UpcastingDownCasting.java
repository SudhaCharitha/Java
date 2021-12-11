package javaprgms;
class Test1{
	int i = 10;
	void wish() {
		System.out.println("In wish method");
		System.out.println("In class Test1: " +i);
	}
}
class Test2 extends Test1{
	String empName = "Charitha";
	void show() {
		System.out.println("In show method");
		System.out.println("In class Test2: " + empName);
	}
}
public class UpcastingDownCasting {

	public static void main(String[] args) {
		
		System.out.println("Upcasting: Converting sub-class type to sub-class type object");
       Test1 t1=new Test2();
       t1.wish();             //displays only parent class properties
    // t1.show(); 
       
       System.out.println("\nDownCasting:Converting super-class type to sub-class type object ");
       Test1 te1=new Test2();
       Test2 te2=(Test2)te1;    //displays both parent and child class properties
       te2.wish();
       te2.show();
	}

}
