package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.TestBase;

public class AvaliabilityPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 50);
	By avaliabiltyLoctaor = By.xpath("//*[@id=\"container\"]/div[3]/div[1]/div/div/header/div[1]/div/div[2]");
	public void avaliability()  {
		
	   driver.findElement(avaliabiltyLoctaor).click(); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[2]"))).isDisplayed();
}

}
