package com.demo.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	
			public static WebDriver driver;
			Scanner scObj = new Scanner(System.in);
			public static Properties prop;
			
			//constructor
			public TestBase(){
				try {
					prop = new Properties();
					FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\resources\\config\\config.properties");
					prop.load(ip);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			public void setupDriver() {
				//To launch the chrome browser
				//String browserName = prop.getProperty("browser");
				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				
			}
			public void getScreenshot(){
	    		String currDir = System.getProperty("user.dir");
	    		TakesScreenshot scrShot = (TakesScreenshot) driver;
				File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
				File destFile = new File(currDir + "\\src\\test\\resources\\Screenshots\\screenshot" + System.currentTimeMillis() +".png");
			    try {
					FileUtils.copyFile(srcFile, destFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	
	    	} 
}
