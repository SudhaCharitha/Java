package Seleniumprograms;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplictWait {
	
	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			Date date;
			SimpleDateFormat sdf;
						
			String usrDir = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",usrDir + "\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			
			driver.get("https://alaskatrips.poweredbygps.com/");
			// Select Origin
			driver.findElement(By.xpath("//*[@id=\"package-origin-hp-package\"]")).sendKeys("New York (NYC-All Airports)");
			Thread.sleep(1000);
			
			// select destination
			driver.findElement(By.xpath("//*[@id=\"package-destination-hp-package\"]")).sendKeys("India Gate, New Delhi, National Capital Territory of Delhi, India");
			Thread.sleep(1000);
			
			//select depart date
			driver.findElement(By.xpath("//*[@id=\"package-departing-hp-package\"]")).sendKeys("10/25/2021");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"package-returning-hp-package\"]")).sendKeys("10/30/2021");
			Thread.sleep(1000);

			// clicking on Search button
			driver.findElement(By.xpath("//*[@id=\"search-button-hp-package\"]")).click();
			
			//Before click search button 
			date = new Date();
			sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			System.out.println("Before :"+sdf.format(date));
			
			// below code gives timeout exception
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"hotelNewSearchLnk\\")));
			//driver.findElement(By.xpath("//*[@id=\"hotelNewSearchLnk\"]")).click();
			
			// clicking back to hyperlink
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"second-nav\"]/a")));
			driver.findElement(By.xpath("//*[@id=\"second-nav\"]/a")).click();
			//wait.until(ExpectedCondition
			
			date = new Date();
			System.out.println("after :"+sdf.format(date));
			
			Thread.sleep(5000);
			driver.close();
			
		}



}
