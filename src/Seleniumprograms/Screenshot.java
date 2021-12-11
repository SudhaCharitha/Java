package Seleniumprograms;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {
	
		
		public static void main(String a[]) throws InterruptedException, IOException {
			
			String usrDir = System.getProperty("user.dir");
			
			System.out.println("User Dir: " + usrDir);
			
			System.setProperty("webdriver.chrome.driver", usrDir + "\\Drivers\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			WebDriver driver = new ChromeDriver(options);
			
			//WebDriver driver = new ChromeDriver();
			
			//driver.manage().deleteAllCookies();
			
			driver.manage().window().maximize();
			
			driver.get("https://en-gb.facebook.com/");
		
			Thread.sleep(3000);
					
			driver.findElement(By.id("email")).sendKeys("charithagandikota");
			//driver.findElement(By.id("email")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.name("pass")).sendKeys("charitha");
			Thread.sleep(2000);
			
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
			
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File(usrDir + "\\Screenshot\\screenshot" + System.currentTimeMillis() +".png");
			FileUtils.copyFile(srcFile, destFile);
			
			//driver.findElement(By.id("email")).getAttribute(arg0)
			
//			String errMsg = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText()
//			sop(errMsg)
			
//			driver.close();
			
		}
	

}
