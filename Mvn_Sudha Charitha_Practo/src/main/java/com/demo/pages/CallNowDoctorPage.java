package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import com.demo.base.TestBase;

public class CallNowDoctorPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 50);
	
	By callNowLoctaor = By.xpath("//*[@id=\"container\"]/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div/div/button");
	
public boolean callNowDoctor() {
		driver.findElement(callNowLoctaor).click(); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div[3]/div[2]/div[1]/div/div[2]/div/div[3]/div/div/div/div/div[1]/span"))).isDisplayed();
		String actualResult = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div[2]/div[1]/div/div[2]/div/div[3]/div/div/div/div/div[1]/span")).getText();
		System.out.println("The Actual Result is CallNow Doctor Page : "+actualResult );
		if(actualResult.contains("Phone number"))
	    	return true;
		else
		return false;

}
}