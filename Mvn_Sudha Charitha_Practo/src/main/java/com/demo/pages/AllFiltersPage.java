package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class AllFiltersPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 50);
	
	By allFiltersLoctaor = By.xpath("//*[@id=\"container\"]/div[3]/div[1]/div/div/header/div[1]/div/div[3]/span/span");
	
public boolean allFilters() {
		driver.findElement(allFiltersLoctaor).click(); 
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div[3]/div[1]/div/div/header/div[2]/div/div[1]/div/span"))).isDisplayed();
		String actualResult = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div[1]/div/div/header/div[2]/div/div[1]/div/span")).getText();
		System.out.println("The Actual Result is All Filters Page: "+actualResult );
		if(actualResult.contains("Gender"))
	    	return true;
		else
		return false;

}

}
//*[@id="container"]/div[3]/div[1]/div/div/header/div[1]/div/div[3]