package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class AddLaterPage extends TestBase {
	
		WebDriverWait wait = new WebDriverWait(driver, 50);

		By addLaterLocator = By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[3]/a[2]");
		
    ////*[@id="overlay-sidebar-root"]/div/div/div[2]/div/div[3]/a[2]
		public boolean addLater(){	
			wait.until(ExpectedConditions.visibilityOfElementLocated(addLaterLocator)).isDisplayed();	
    	driver.findElement(addLaterLocator).click();
   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[4]/div/a"))).isDisplayed();
			String actualResult = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[4]/div/a")).getText();
			System.out.println("Actual Result:" +actualResult);
			if(actualResult.contains("Offers"))
				return true;
			else
			return false;

		} 
}