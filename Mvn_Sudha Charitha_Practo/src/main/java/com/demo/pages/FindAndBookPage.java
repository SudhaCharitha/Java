package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.demo.base.TestBase;

public class FindAndBookPage extends TestBase {
	
	By selectPlaceLoctaor = By.xpath("//*[@id=\'root\']/div/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/a/div[1]");
	
	By removePlaceLocator = By.xpath("//*[@id=\'c-omni-container\']/div/div[1]/div[1]/input");
	By placeLocator = By.xpath("//*[@id=\'c-omni-container\']/div/div[1]/div[1]/input");
	

	By selectDoctorSpecialityLocator = By.xpath("//*[@id=\'c-omni-container\']/div/div[1]/div[2]/div[2]/div/span/div[1]");
	By doctorSpecialityLocator = By.xpath("//*[@id=\'c-omni-container\']/div/div[2]/div[1]/input");
	
	
	public boolean selectPlaceAndDoctorName(String placeName, String doctorSpecialityName) throws InterruptedException  {
		
		
		driver.findElement(selectPlaceLoctaor).click();
		driver.findElement(removePlaceLocator).clear();
		driver.findElement(placeLocator).sendKeys(placeName);
		//driver.findElement(By.xpath("//*[@id=\"c-omni-container\"]/div/div[1]/div[2]/div[2]/div[1]")).click();
		

		Thread.sleep(3000);
		driver.findElement(selectDoctorSpecialityLocator).click();
		driver.findElement(doctorSpecialityLocator).sendKeys(doctorSpecialityName);
		Thread.sleep(2000);
		driver.findElement(doctorSpecialityLocator).sendKeys(Keys.ENTER);
	
		String actualResult = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div[2]/div[1]/div/div[1]/div/p")).getText();
		System.out.println("The Actual Result is Find and Book Page : "+actualResult );
		if(actualResult.contains("Book appointments with minimum wait-time & verified doctor details"))
	    	return true;
		else
		return false;
		
	}

}
