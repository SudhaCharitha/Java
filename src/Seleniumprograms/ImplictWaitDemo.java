package Seleniumprograms;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplictWaitDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String usrDir = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",usrDir + "\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			// with Implicit Wait and Without Implicit Wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			driver.get("https://www.advantageonlineshopping.com/");
			System.out.println(driver.findElement(By.xpath(("//*[@id=\"speakersTxt\"]"))).getText());
					
		}

}
