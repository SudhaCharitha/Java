package Seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AssertionDemo {
	
	  @Test
	  public void validateCorrectPage() {   
		  WebDriver driver;
			// To launch application in Chrome browser
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();		

			// To maximize the window
			driver.manage().window().maximize();
			
			//To Launch the URL
			driver.get("https://www.redbus.in/");
			
			String expResult = "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India";		
			String actResult = driver.getTitle();

			Assert.assertEquals(actResult, expResult, "Not Matching");
			
			Assert.assertFalse(false);
			Assert.assertTrue(false);
			
			if (expResult.equalsIgnoreCase(actResult)) 
				System.out.println("The correct Red Bus website is launched");
			else
				System.out.println("The Red Bus website launched is not correct one");

	  }
	}

