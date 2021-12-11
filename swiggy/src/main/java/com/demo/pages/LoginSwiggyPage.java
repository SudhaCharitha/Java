package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import com.demo.base.TestBase;


public class LoginSwiggyPage extends TestBase {
//public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 50);

	By loginLocator = By.xpath("//*[@id='root']/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]");
	By phoneLocator = By.xpath("//*[@id='mobile']");
	//By verifyOTPLocator=By.xpath("//*[@id='overlay-sidebar-root']/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a");
	By loginButtonLocator = By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a");
	

	public String loginSwiggy(String phone) {
		
		driver.findElement(loginLocator).click();
		driver.findElement(phoneLocator).sendKeys(phone);
		driver.findElement(loginButtonLocator).click();
		
		//wait until searchbox is displayed
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/a")));

		String actualResult = driver.getTitle();
        System.out.println(actualResult);
		return actualResult;
		
	}

}
