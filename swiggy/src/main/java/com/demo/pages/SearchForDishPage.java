package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class SearchForDishPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, 60);

	By searchLocator = By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div");
	By searchForDishLocator = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/input");
	

	public boolean searchForDish(){	
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchLocator)).isDisplayed();
		
	driver.findElement(searchLocator).click();
	//driver.findElement(searchForDishLocator).click();
	driver.findElement(searchForDishLocator).sendKeys("Burger");
	//wait.until(ExpectedConditions.textToBePresentInElementLocated(searchForDishLocator, "Burger"));
	driver.findElement(searchForDishLocator).sendKeys(Keys.ENTER);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[2]/div[1]/button[2]"))).isDisplayed();
		String actualResult = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[2]/div[1]/button[2]")).getText();
		if(actualResult.contains("Dishes"))
			return true;
		else
		return false;

}
}