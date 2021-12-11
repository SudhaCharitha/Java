package Seleniumprograms;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class SeleniumGrid {
public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub

			//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			// To launch chrome driver		
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setBrowserName("chrome");
			desiredCapabilities.setPlatform(Platform.WINDOWS);
			
			ChromeOptions options = new ChromeOptions();
			options.merge(desiredCapabilities);

			String hubURL = "http://localhost:4444/wd/hub";
			WebDriver driver = new RemoteWebDriver(new URL(hubURL), options); 
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			driver.close();		
			}

	}

