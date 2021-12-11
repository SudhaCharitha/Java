package com.demo.scenarios;

import org.testng.annotations.Test;
import com.demo.base.TestBase;
import com.demo.pages.AllFiltersPage;
import com.demo.pages.AvaliabilityPage;
import com.demo.pages.AvaliabilityTodayPage;
import com.demo.pages.CallNowDoctorPage;
import com.demo.pages.FindAndBookPage;
import com.demo.pages.GenderOfDoctorPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class FindDoctor extends TestBase{
	FindAndBookPage findAndBookPage;
	CallNowDoctorPage callNowDoctorPage;
	AllFiltersPage allFiltersPage;
	GenderOfDoctorPage genderOfDoctorPage;
	AvaliabilityPage avaliabilityPage;
	AvaliabilityTodayPage avaliabilityTodayPage;
	
  @Test(priority = 0)
  public void launchHomePageTest() {
		driver.get(prop.getProperty("url"));
		String actualResult = driver.getCurrentUrl();
		String expectedResult = "https://www.practo.com/";
		Assert.assertEquals(actualResult, expectedResult);
	}
  @Test(priority = 1)
	public void selectPlaceAndDoctorName() throws InterruptedException {
		findAndBookPage = new FindAndBookPage();
		Boolean actualResult = findAndBookPage.selectPlaceAndDoctorName(prop.getProperty("placeName"), prop.getProperty("doctorSpecialityName"));
		Assert.assertTrue(actualResult);
  }
  @Test(priority = 2)
  public void callNowDoctor() {
	  callNowDoctorPage = new CallNowDoctorPage();
	  Boolean actualResult = callNowDoctorPage.callNowDoctor();
		Assert.assertTrue(actualResult);
 }
  

  @Test(priority = 3)
  public void avaliability() {
	  avaliabilityPage = new AvaliabilityPage();
  }
  
  @Test(priority = 4)
  public void avaliabilityToday() {
	  avaliabilityTodayPage = new AvaliabilityTodayPage();
	  Boolean actualResult = avaliabilityTodayPage.avaliabilityToday();
		Assert.assertTrue(actualResult);
 }
 
  @Test(priority = 5)
  public void allFiltersPage() {
	  allFiltersPage = new AllFiltersPage();  
	  Boolean actualResult = allFiltersPage.allFilters();
		Assert.assertTrue(actualResult);
 }

  @Test(priority = 6)
  public void genderOfDoctor() throws InterruptedException {
	  genderOfDoctorPage = new GenderOfDoctorPage();
	  Boolean actualResult = genderOfDoctorPage.genderOfDoctor();
		Assert.assertFalse(actualResult);
 }
  @Test(priority = 7)
  public void screenshot(){
	  getScreenshot();
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
