package Seleniumprograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class HTMLReport extends TestBase {
  
	
  @Test(priority=0)
  public void Login() {
	Reporter.log("Inside Login Test Case", true);
  }
  
  @Test(priority=1)
  public void searchProduct() {
	  Reporter.log("Inside Search Product Test Case", false);  
	  Assert.assertTrue(true);
  }
  
  @Test(priority=2)
  public void selectProduct() {
	  Reporter.log("Inside Select Product Test Case", true);  
	  Assert.assertTrue(false);
  }
  
  @Test(priority=3)
  public void logoff() {
	  Reporter.log("Inside Logout Test Case",true);  
	  throw new SkipException("Skip Exception");
  }
  
}
