package javaprgms;
abstract class CompanyDetail{
	
	String companyName = "RBA Infotec";	
	float turnOver = 20341.54f;

	CompanyDetail(){
		System.out.println("Parent class Constructor");
	}
	
	abstract void displayCompanyName();

	void displayTurnOver() {
		System.out.println("Turn Over: " + turnOver);
	}
}

class Sample extends CompanyDetail{

	Sample(){
		super();
	}
	void displayCompanyName()  {
		System.out.println("in override method: " + companyName);
		super.displayTurnOver();
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample = new Sample();
		sample.displayCompanyName();
		
	}

}
