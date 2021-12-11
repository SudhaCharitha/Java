package com.demo.scenarios;

import org.testng.annotations.Test;

import com.demo.base.TestBase;
import com.demo.pages.AddLaterPage;
import com.demo.pages.AddToCartPage;
import com.demo.pages.CheckOutPage;
import com.demo.pages.LocateMePage;
import com.demo.pages.LoginSwiggyPage;
import com.demo.pages.SearchForDishPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class FoodOrder extends TestBase{
	LoginSwiggyPage  loginSwiggyPage;
	LocateMePage locateMePage;
	AddLaterPage addLaterPage;
	SearchForDishPage searchForDishPage;
	AddToCartPage addToCartPage;
	CheckOutPage checkOutPage;
	
  @Test(priority = 0)
	public void launchHomePageTest() {
		driver.get("https://www.swiggy.com/");
		String actualResult = driver.getCurrentUrl();
		String expectedResult = "https://www.swiggy.com/";
		Assert.assertEquals(actualResult, expectedResult);
  }
  @Test(priority = 1)
	public void loginSwiggyTest() {
		loginSwiggyPage = new LoginSwiggyPage();
		String actualResult = loginSwiggyPage.loginSwiggy("9032395359");
		String expectedResult ="Order food online from India's best food delivery service. Order from restaurants near you";
		Assert.assertEquals(actualResult, expectedResult);
  }
  @Test(priority = 2)
	public void locateMeTest() {
	  locateMePage = new LocateMePage();
	  boolean actualResult = locateMePage.locateMe();
	  Assert.assertTrue(actualResult);
  }
  @Test(priority = 3)
 	public void addLaterTest() {
	  addLaterPage = new AddLaterPage();
      boolean actualResult = addLaterPage.addLater();
	  Assert.assertTrue(actualResult);
  }
  @Test(priority = 4)
	public void searchForDish() {
	  searchForDishPage = new SearchForDishPage();
	  boolean actualResult = searchForDishPage.searchForDish();
	  Assert.assertTrue(actualResult);
  }
  @Test(priority = 5)
	public void addToCart() {
	  addToCartPage = new AddToCartPage();
	  boolean actualResult = addToCartPage.addToCart();
	  Assert.assertTrue(actualResult);
}
  @Test(priority = 6)
 	public void checkOut() {
 	  checkOutPage = new CheckOutPage();
 	  boolean actualResult = checkOutPage.checkOut();
  }
  
 
  @BeforeClass
  public void beforeClass() {
	  setupDriver();
  }

  @AfterClass
  public void afterClass() {
	driver.close();
  }

}
