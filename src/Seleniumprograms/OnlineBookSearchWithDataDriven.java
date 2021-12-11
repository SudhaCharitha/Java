package Seleniumprograms;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlineBookSearchWithDataDriven {

	static WebDriver driver;
	static WebElement element;
	static String usrDir = System.getProperty("user.dir");
	
	public void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", usrDir + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bookswagon.com/");
	}

	public WebDriver searchBook(String bookName) {
		driver.findElement(By.id("ctl00_TopSearch1_txtSearch")).sendKeys(bookName);
		driver.findElement(By.name("ctl00$TopSearch1$Button1")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public void displayTotalNoOfBooks() {
		String resultMsg = driver.findElement(By.className("preferences-show")).getText();
		System.out.println(resultMsg);

		String totalNoOfBooks = resultMsg.replaceAll("[^0-9]", "");
		System.out.println("Total No of Books: " + totalNoOfBooks);
		if (Integer.parseInt(totalNoOfBooks) > 10) {
			System.out.println("Total No of Books is greater than 10");
		} else {
			System.out.println("Total No of Books is less than 10");
		}
	}

	public void setSortOrder(String sortOrderBy) {
		Select select = new Select(driver.findElement(By.id("ddlSort")));
		select.selectByVisibleText(sortOrderBy);
		System.out.println("sorted");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void displayItems() {

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
	
	public void closeDriver() {
		driver.close();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineBookSearchWithDataDriven obs = new OnlineBookSearchWithDataDriven();
		obs.setUpDriver();
	
		String fileName = usrDir + "\\InputData.xlsx";
		String[] data;
		
		for(int rowNo=1; rowNo<4; rowNo++ ) {
			// reading data from Excell
		data = TestUtil.readExcelData(fileName, rowNo);	
	
		// iterating the below methods for n number of iterations
		obs.searchBook(data[0]);
		obs.displayTotalNoOfBooks();
		obs.setSortOrder(data[1]);
		obs.displayItems();
		}
		obs.closeDriver();
	}
	

}
