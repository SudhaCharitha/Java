package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class AddToCartPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, 50);
	
    By selectBurgerLocator = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/a/div/div/div[1]");
	By addToCartLocator = By.xpath("//*[@id=\"h-1950595611\"]/div[2]/div[1]/div[1]/div/div[2]/div/div/div[1]");
	//By popUpLocator = By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]");
	By addItem = By.xpath("//*[@id=\"modal-placeholder\"]/div[3]/div/div[2]/div/div[3]");
	public boolean addToCart(){	
		driver.findElement(selectBurgerLocator).click();
		//driver.findElement(popUpLocator).click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartLocator)).isDisplayed();	
	driver.findElement(addToCartLocator).click();
	driver.findElement(addItem).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-content\"]/div[2]/div/div[1]")));
		String actualResult = driver.findElement(By.xpath("//*[@id=\"menu-content\"]/div[2]/div/div[1]")).getText();
		if(actualResult.contains("Cart"))
			return true;
		else
		return false;

 }

}
