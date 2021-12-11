package Seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\javaprograms\\SampleProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "F:\\selenium jar files\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		String expResult= "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India";//ctrl+f
		String actResult= driver.getTitle();
		if(actResult.equalsIgnoreCase(expResult)){
		System.out.println("The launched website is correct");
		}
		else{
			System.out.println("The launched website is not correct");
				}

	}

}
