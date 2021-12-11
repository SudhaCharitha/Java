package Seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

 class MethodsOfFlipkart {
	 
     WebDriver driver=null;
      public void launchBrowser(){
	   
		boolean loop = true;
		System.out.println("Enter any of the below browser name");
		System.out.println("Chrome \nFirefox ");
		
		String s;
		String currDir = System.getProperty("user.dir");
		//System.out.println("Current Directory: " + currDir);
		
		System.out.println();
		System.out.println("The selected Browser is");
		Scanner sc = new Scanner(System.in);
		String browserName = sc.nextLine();
		
		while(loop) {
		if(browserName.equalsIgnoreCase("chrome")) {  // Chrome -- chrome
			System.setProperty("webdriver.chrome.driver", currDir+ "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			loop = false;
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir+ "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			loop = false;
		}
		
		else {
			System.out.println("Invalid browser name, please ente the valid browser or 0 to Exit");
			browserName = sc.nextLine();
			if(browserName.equalsIgnoreCase("0")) {
				System.out.println(" it is terminating now");
				System.exit(0);
						
			}
		}
		
	}	
		driver.manage().window().maximize();
		//To Launch the URL
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
      public void login(){
    	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7780121328");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("09091998");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
}
      public void searchForFields(){ 
        	  driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("face makeup");
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	  
      }
       public void selectItem(){
	  		 driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
	  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       }
       public void newTab() {
    	   ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  		driver.switchTo().window(tabs.get(1));
			driver.navigate().to("https://www.flipkart.com/lakm-radiance-complexion-compact/p/itm8816fe6207241?pid=CMPEFKWCVB7T2YDZ&lid=LSTCMPEFKWCVB7T2YDZ7B8NEM&marketplace=FLIPKART&q=Face+Make+up&store=g9b%2Fffi&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=82873124-68df-4948-b77b-4210abe2b970.CMPEFKWCVB7T2YDZ.SEARCH&ppt=hp&ppn=homepage&ssid=adlbus790w0000001633322865226&qH=fa1cb1c6ad256cb0");
			//driver.navigate().to("https://www.flipkart.com/asus-vivobook-ultra-14-core-i3-10th-gen-4-gb-512-gb-ssd-windows-10-home-x413ja-ek268t-x413ja-eb303t-thin-light-laptop/p/itm1c8e9d0ab97a4?pid=COMFTWZDNEXY33HG&lid=LSTCOMFTWZDNEXY33HGCWAGB2&marketplace=FLIPKART&q=laptop&store=6bo%2Fb5g&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=en_zrYg4aeXPAzCrK8lfDq1DaLCl%2FCGyosTdHQZmRMWMKiGmhgeZRmR6HJFWUlBA4YTu0%2BRBq0vFRB2IsGIpXEeAw%3D%3D&ppt=None&ppn=None&ssid=nfetggukgw0000001633579946131&qH=312f91285e048e09");
       }		
    	public void scrollPage(){
    		//to scroll down to bottom of the page
    		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,200)");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	}
			public void addToCart(){
	            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
    	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
    	}  
    	public void placeOrder(){
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")).click();
      		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
    	}
    	public void addAddress(){
    		//driver.findElement(By.cssSelector("#container > div > div._1eztQ7 > div > div._3efVlV > div:nth-child(2) > div > div > div > div > div > label > div._2jIO64 > div > form > div > div:nth-child(2) > div:nth-child(1) > input")).sendKeys("charitha");
     		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[2]/div[1]/input")).sendKeys("charitha");
     		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[2]/div[2]/input")).sendKeys("770121332");
     		driver.findElement(By.name("pincode")).sendKeys("5163668");
     		JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,200)");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[3]/div[2]/input")).sendKeys("shivalayam street");
      		driver.findElement(By.name("addressLine1")).sendKeys("kadapa");
     		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[5]/div[1]/div[1]/input")).sendKeys("proddatur");
     		//to select drop down to state
			Select profile = new Select(driver.findElement(By.name("state")));
			profile.selectByVisibleText("Andhra Pradesh");
     		driver.findElement(By.name("landmark")).sendKeys("street");
     		//radio button
     		driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[7]/div/div/label[1]/div[1]")).click();
     		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
     		} 
    	public void screenshoot(){
    		String s;
    		String currDir = System.getProperty("user.dir");
    		TakesScreenshot scrShot = (TakesScreenshot) driver;
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File(currDir + "\\Screenshot\\screenshot" + System.currentTimeMillis() +".png");
		    try {
				FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
    	} 
    	public void logOut(){
    		// to scroll up to top - 
    		JavascriptExecutor jse = (JavascriptExecutor)driver;
    		jse.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
    		driver.findElement(By.className("_32l7f0")).click();
    		driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div[2]/a/span")).click();
    		}

 }
 
public class FlipkartProgram {
	// TODO Auto-generated method stub
	public static void main(String[] args)  {
		MethodsOfFlipkart Flipkart=new MethodsOfFlipkart();
			Flipkart.launchBrowser();
			Flipkart.login();
			Flipkart.searchForFields();
			Flipkart.selectItem();
			Flipkart.newTab();
			Flipkart.scrollPage();
			Flipkart.addToCart();
			Flipkart.placeOrder();
			Flipkart.addAddress();
			Flipkart.screenshoot();
			Flipkart.logOut();

}}
