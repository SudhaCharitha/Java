package Seleniumprograms;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	public class MouseOver {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
	String userDir = System.getProperty("user.dir");
			
			System.setProperty("webdriver.chrome.driver",userDir + "\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// Maximizing the Window
			driver.manage().window().maximize();
			
			driver.get("https://www.swtestacademy.com/");
			WebElement testAutomation = driver.findElement(By.xpath("//*[@id='menu-item-844']/a"));
			WebElement uiAutomation = driver.findElement(By.xpath("//*[@id=\"menu-item-7674\"]"));
			//WebElement selenium = driver.findElement(By.xpath("//*[@id='menu-item-741']/a"));
			WebElement capybar = driver.findElement(By.xpath("//a[contains(text(),'Capybara')]"));
					//By.xpath("//*[@id=\"menu-item-741\"]/a/span"));  //*[@id=\"menu-item-844\"]/a/span[1]
			
			Actions acts = new Actions(driver);
			Action act = acts                        ////*[@id="menu-item-844"]/a  //*[@id="menu-item-844"] //*[@id="menu-item-7674"]
					.moveToElement(testAutomation)
					.pause(2000)
					.moveToElement(uiAutomation)
					.pause(2000)
					.moveToElement(capybar)
					.click()
					.build();
			
					act.perform();		
			
		}

	}


