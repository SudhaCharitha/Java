package Seleniumprograms;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args)  throws InterruptedException {
				// TODO Auto-generated method stub
                String userDir=System.getProperty("user.dir");
                System.out.println("user dir:" +userDir);
				System.setProperty("webdriver.chrome.driver", userDir + "\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
					//	http://seleniumhq.github.io/selenium/docs/api/java/
	
				//Thread.sleep(30000);
				driver.manage().window().maximize();
				
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7780121328");
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("09091998");
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
				Thread.sleep(3000);
				 WebElement myAccount = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		    	  ////*[@id="container"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[1]/div,
				 WebElement order = driver.findElement(By.xpath("//div[contains(text(),'Orders')]"));
		  		//WebElement order = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[4]/a"));
		
		  		Actions acts = new Actions(driver);
		  		Action act = acts
		  				.moveToElement(myAccount)
		  				.pause(2000)
		  				.moveToElement(order)
		  				.pause(2000)
		  				.click()
		  				.build();
		  				act.perform();	
				
				
				/*driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Face Make up");
		  	//	driver.findElement(By.id("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		  		Thread.sleep(3000);
		  		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
		  		Thread.sleep(3000);
		  		 driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
		  		Thread.sleep(7000);
		  		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  		driver.switchTo().window(tabs.get(1));
				driver.navigate().to("https://www.flipkart.com/lakm-radiance-complexion-compact/p/itm8816fe6207241?pid=CMPEFKWCVB7T2YDZ&lid=LSTCMPEFKWCVB7T2YDZ7B8NEM&marketplace=FLIPKART&q=Face+Make+up&store=g9b%2Fffi&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=82873124-68df-4948-b77b-4210abe2b970.CMPEFKWCVB7T2YDZ.SEARCH&ppt=hp&ppn=homepage&ssid=adlbus790w0000001633322865226&qH=fa1cb1c6ad256cb0");
		  		//scroll up
		  		//JavascriptExecutor jse = (JavascriptExecutor)driver;
			
				//jse.executeScript("window.scrollBy(0,200)");
				
				//add to cart
				   Thread.sleep(3000);
		            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
		            //0rder
		            Thread.sleep(4000);
		            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")).click();
		            Thread.sleep(2000);
		            driver.findElement(By.cssSelector("#container > div > div._1eztQ7 > div > div._3efVlV > div:nth-child(2) > div > div > div > div > div > label > div._2jIO64 > div > form > div > div:nth-child(2) > div:nth-child(1) > input")).sendKeys("charitha");
		           driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[2]/div[2]/input")).sendKeys("770121332");
		           driver.findElement(By.name("pincode")).sendKeys("5163668");
		            driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[3]/div[2]/input")).sendKeys("shivalayam street");
		            driver.findElement(By.name("addressLine1")).sendKeys("kadapa");
		           driver.findElement(By.name("city")).sendKeys("proddatur");
		           //to select drop down to state
		       Select profile = new Select(driver.findElement(By.name("state")));
		       profile.selectByVisibleText("Andhra Pradesh");
		           driver.findElement(By.name("landmark")).sendKeys("street");
		           //radio button
		           driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[7]/div/div/label[1]/div[1]")).click();
		           driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
		          
		     	
		    	
		    	
		    		// to scroll up to top - 
		    		JavascriptExecutor jse = (JavascriptExecutor)driver;
		    		jse.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		    		driver.findElement(By.className("_32l7f0")).click();*/
		    		//driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div[2]/a/span")).click();
		    

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//driver.close();  // to close the current browser
				



				
				// driver.quit();  // to close all opened browser
				
				
			}

}
