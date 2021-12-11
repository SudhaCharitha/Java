package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class CheckOutPage extends TestBase {
	
	WebDriverWait wait = new WebDriverWait(driver, 50);

	By checkOutLocator = By.xpath("//*[@id=\"menu-content\"]/div[2]/div/div[3]/button");

	public boolean checkOut(){	
	driver.findElement(checkOutLocator).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div")));
		String actualResult = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div")).getText();
		if(actualResult.contains("Add a delivery address"))
			return true;
		else
		return false;

 }

}
