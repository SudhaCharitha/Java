package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class LocateMePage extends TestBase {
	//public WebDriver driver;
		WebDriverWait wait = new WebDriverWait(driver, 50);
   
		By locateMeLocator = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]");
		By searchLocator = By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/div/span[2]");
		By usingGPSLocator = By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div/div[1]/div");
		//*[@id="overlay-sidebar-root"]/div/div/div[2]/div/div/div[3]/div/div[1]/div
public boolean locateMe() {
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(locateMeLocator)).isDisplayed();
	
			driver.findElement(locateMeLocator).click();
			driver.findElement(searchLocator).click();
			driver.findElement(usingGPSLocator).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[3]/a[1]"))).isDisplayed();
			String actualResult = driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[2]/div/div")).getText();
			System.out.println(actualResult);
			if(actualResult.contains("Set delivery location"))
				return true;
			else                 
			return false;
}
}
