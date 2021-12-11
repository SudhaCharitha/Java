package Seleniumprograms;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class OpenNewTab {

	public static void main(String[] args) throws InterruptedException {
		

				String userDir = System.getProperty("user.dir");
				
				System.setProperty("webdriver.chrome.driver", userDir + "\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://en-gb.facebook.com/");
				
				// Maximing the Window
				driver.manage().window().maximize();
				
				//To pause the program for mentioned msec
				Thread.sleep(2000);
				
//				driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
//				Thread.sleep(10000);
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.open()");
				js.executeScript("window.open()");
				js.executeScript("window.open()");
				
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));
				driver.navigate().to("https://www.flipkart.com/");
				Thread.sleep(3000);
				
				driver.switchTo().window(tabs.get(2));
				driver.navigate().to("https://demoqa.com/text-box");
				Thread.sleep(3000);
				
				driver.switchTo().window(tabs.get(3));
				driver.navigate().to("https://www.orangehrm.com/");
				
				
				Thread.sleep(5000);
				driver.switchTo().window(tabs.get(0));
				
				
				driver.findElement(By.tagName("a"));
				//driver.switchTo().
				
				List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
				


	}

}
