package Seleniumprograms;

import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsOnMethod {

	@Test (priority = 1)
	  public void login() {
		 // Assert.assertTrue(false);
		  Assert.assertEquals("Selenium", "Selenium1");
		  System.out.println("This is Login method");
	  }
	  
	  @Test (priority = 2)
	  public void homePage() {
		  System.out.println("This is Home page will be executed only if login is success");
	  }
	  
	  @Test (priority = 3, dependsOnMethods = {"login", "homePage"})
	  public void searchProduct() {
		  System.out.println("This is SearchProduct, will be executed only if Home Page is success");
	  }
	}

