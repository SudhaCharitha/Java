package Seleniumprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderOfExecutionTestng {
	
			@Test (priority=0)
		  public void b() {
			  System.out.println("In method b");
		  }
			
		  @Test (priority=1)
		  public void g() {
			  System.out.println("In method g");
		  }
		  
		  @Test (priority=5)
		  public void a() {
			  System.out.println("In method a");
		  }
		  
		  @Test (priority=3)
		  public void d() {
			  System.out.println("In method d");
		  }
		  
		}


