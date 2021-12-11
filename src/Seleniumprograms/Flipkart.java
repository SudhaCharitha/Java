package Seleniumprograms;

import java.io.File;
import java.io.IOException;
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

 class MethodsForFlipkart {
	 
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
    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7780121328");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("09091998");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
}
      public void myAccount(){ //mouseover on myaccount orders
   	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	  WebElement myAccount = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
    	  ////*[@id="container"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[1]/div,
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  		WebElement order = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[4]/a"));
////*[@id="container"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[4]/a
  		Actions acts = new Actions(driver);
  		Action act = acts
  				.moveToElement(myAccount)
  				.pause(2000)
  				.moveToElement(order)
  				.pause(2000)
  				.click()
  				.build();
  				act.perform();	
    	 /* driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).click();
    	  driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Face Make up");
    	  //driver.findElement(By.className("L0Z3Pu")).click();
    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ARROW_DOWN);
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  		driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
  	
    	  
      }
       public void order(){
    	/* driver.findElement(By.className("_2KpZ6l m7759j _1g9lo5 _3dESVI")).click();//start shopping
    	 WebElement  BeautyToysAndMore= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[9]/a/div[2]/div[1]/div"));
    	 WebElement  FaceMakeup= driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[9]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[5]"));

   		Actions acts = new Actions(driver);
   		Action act = acts
   				.moveToElement(BeautyToysAndMore)
   				//.pause(2000)
   				.moveToElement(FaceMakeup)
   				//.pause(2000)
   				.click()
   				.build();
   				act.perform();	
    	  */
    	   driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div")).click();
    	   //add to cart
    	   driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
   				
       }
    	/*public void scrollPage(){
    		//to scroll down to bottom of the page
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			jse.executeScript("window.scrollBy(0,200)");
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	}*/
    	public void selectItem(){
    		 driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div")).click();
    		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    		//to scroll down to bottom of the page
 			JavascriptExecutor jse = (JavascriptExecutor)driver;
 			jse.executeScript("window.scrollBy(0,100)");
 			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	}
    	public void addToCart(){
   		 driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
   		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
    	}  
    	public void placeOrder(){
      		 driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span")).click();
      		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 
      		} 
    	public void addAddress(){
     		 driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[2]/div[1]/input")).sendKeys("charitha");
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
 
public class Flipkart {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MethodsForFlipkart Flipkart=new MethodsForFlipkart();
		Flipkart.launchBrowser();
		Flipkart.login();
		Flipkart.myAccount();
		Flipkart.order();
		//Flipkart.scrollPage();
		Flipkart.selectItem();
		Flipkart.addToCart();
		Flipkart.placeOrder();
		Flipkart.addAddress();
		Flipkart.screenshoot();
		Flipkart.logOut();
	}
	}


