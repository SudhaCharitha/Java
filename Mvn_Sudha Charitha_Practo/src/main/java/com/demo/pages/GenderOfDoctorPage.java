package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class GenderOfDoctorPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 50);
	//Selecting the female Doctor
	By femaleDoctorLoctaor = By.xpath("//*[@id=\"container\"]/div[3]/div[1]/div/div/header/div[2]/div/div[1]/div/label[2]/span");
	
public boolean genderOfDoctor() throws InterruptedException {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(femaleDoctorLoctaor)).isDisplayed();
	    Thread.sleep(20000);
		driver.findElement(femaleDoctorLoctaor).click(); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		String actualResult = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]")).getText();
		System.out.println("The Actual Result is Gender Of Doctor Page : "+actualResult );
		if(actualResult.contains("Book Appointment"))
	    	return true;
		else
		return false;

}

}
