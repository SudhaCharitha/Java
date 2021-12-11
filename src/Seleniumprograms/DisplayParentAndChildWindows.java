package Seleniumprograms;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DisplayParentAndChildWindows {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			String usrDir = System.getProperty("user.dir");
			
			System.setProperty("webdriver.chrome.driver", usrDir + "\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://cookbook.seleniumacademy.com/Config.html");
			
			// Maximing the Window
			driver.manage().window().maximize();
			
			String parentWindow = driver.getWindowHandle();
			
			System.out.println("Parent Window = " + driver.getTitle());
//			System.out.println("Parent Window = "+driver.switchTo().window(parentWindow).getTitle());
			
			Thread.sleep(2000);
			driver.findElement(By.id("helpbutton")).click();
			Thread.sleep(2000);
		    driver.findElement(By.id("chatbutton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("visitbutton")).click();
			
		    Thread.sleep(2000);
			Set<String> s1 = driver.getWindowHandles();   //List 
			
			System.out.println("All Windows = ");
			
			for(String Window : s1)
			{
				String checkName = driver.switchTo().window(Window).getTitle();
				
				System.out.println(driver.switchTo().window(Window).getTitle() + " --> " + Window);
				
				if(checkName.equalsIgnoreCase("Visit Us")) {
					System.out.println("Visit Us window is found");
					driver.close();
				}
			}
		
			driver.switchTo().window(parentWindow);
			Thread.sleep(2000);
			driver.quit();
		}

	}

