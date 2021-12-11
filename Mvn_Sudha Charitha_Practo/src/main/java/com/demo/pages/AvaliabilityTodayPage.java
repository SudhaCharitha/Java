package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class AvaliabilityTodayPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 50);	
	By avaliabilityTodayLoctaor = By.xpath("//*[@id=\"container\"]/div[3]/div[1]/div/div/header/div[1]/div/div[2]/ul/li[1]");
   
	public boolean avaliabilityToday()  {
		
		driver.findElement(avaliabilityTodayLoctaor).click(); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");

		String actualResult = driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div[2]/div[1]/div/div[3]/div[1]/div[2]/div[2]/div[1]")).getText();
		//*[@id=\"container\"]/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]
				System.out.println("The Actual Result is of availiability today : "+actualResult );
		if(actualResult.contains("Book Appointment"))
	    	return true;
		else
		return false;

}

}
