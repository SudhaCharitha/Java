package Seleniumprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBooksWagonWithExcel {


	WebDriver driver;
	
	@Test(dataProvider = "dp")
  public void displayBooks(String bookName, String sortOrderBy) {
		
		driver.findElement(By.id("ctl00_TopSearch1_txtSearch")).sendKeys(bookName);
		driver.findElement(By.name("ctl00$TopSearch1$Button1")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String resultMsg = driver.findElement(By.className("preferences-show")).getText();
		//System.out.println(resultMsg);

		String totalNoOfBooks = resultMsg.replaceAll("[^0-9]", "");
		System.out.println("Total No of Books: " + totalNoOfBooks);
		if (Integer.parseInt(totalNoOfBooks) > 10) {
			System.out.println("Total No of Books is greater than 10");
		} else {
			System.out.println("Total No of Books is less than 10");
		}
 
		Select select = new Select(driver.findElement(By.id("ddlSort")));
		select.selectByVisibleText(sortOrderBy);
		System.out.println("sorted");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for (int i = 1; i <= 3; i++) {

			// driver.findElement(By.className("title")).click();
			
			//
			System.out.print(driver.findElement(By.xpath("//*[@id=\"listSearchResult\"]/div[" + i + "]/div[3]/div[1]/a")).getText() + " - ");

			List<WebElement> total = driver.findElements(By.xpath("//*[@id=\"listSearchResult\"]/div[" + i + "]/div[3]/div[4]/div[1]/div"));

			if (total.size() == 1)
				System.out.println(driver.findElement(By.xpath("//*[@id=\"listSearchResult\"]/div[" + i + "]/div[3]/div[4]/div[1]/div")).getText());
			else
				System.out.println(driver.findElement(By.xpath("//*[@id=\"listSearchResult\"]/div[" + i + "]/div[3]/div[4]/div[1]/div[2]")).getText());
		}
	}
  
  @DataProvider
  public Object[][] dp() {
	  Object[][] obj = new Object[3][2];
	  String fileName = ".\\InputData.xlsx";
	  obj = ReadExcel.readData(fileName);
	  return obj;
	  
  }
 
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Maximing the Window
		driver.manage().window().maximize();
		
		// Loading the website 
		driver.get("https://www.bookswagon.com/");

  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }
}

