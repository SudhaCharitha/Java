package Seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jevansathi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		                String userDir=System.getProperty("user.dir");
		                System.out.println("user dir:" +userDir);
						System.setProperty("webdriver.chrome.driver", userDir + "\\Drivers\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						//Thread.sleep(30000);
						driver.manage().window().maximize();
						
						driver.get("https://www.jeevansathi.com/register/customreg/111?source=Sr_Tel_Shd&sh1=Trusted%20by%20Lakhs%20of&sh2=Telugu%20Brides%20and%20Grooms&utm_source=google&utm_medium=cpc&utm_campaign=New_Search_Shaadi_Telugu_Campaign_Ethinos&utm_adgroup=Mix_matchtypes&utm_term=+shadi%20+com%20+registration&gclid=Cj0KCQjwwNWKBhDAARIsAJ8HkhdT0Ggf7pfVp9nA9zRYuBFVImEPSyPOei6F8Ry8jNBU_DYhAC5fsUgaAmupEALw_wcB");
						Thread.sleep(3000);
						driver.findElement(By.name("reg[email]")).sendKeys("charitha@gmail.com");
						driver.findElement(By.name("reg[password]")).sendKeys("09091998");
						//to select drop down by visible text
						Select profile = new Select(driver.findElement(By.name("reg[relationship]")));
						profile.selectByVisibleText("Self");
						driver.findElement(By.xpath("//*[@id=\"reg_gender_F\"]")).click();
						driver.findElement(By.name("outside_inda")).click();
						driver.findElement(By.xpath("//*[@id='termsandconditions']")).click();
						Select DateOfBirth = new Select(driver.findElement(By.name("reg[dtofbirth][day]")));
						DateOfBirth.selectByValue("1");
						
						Select MotherTongue = new Select(driver.findElement(By.name("reg[mtongue]")));
						MotherTongue.selectByValue("3");
						Thread.sleep(5000);
						
						//to scroll down to bottom of the page
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("window.scrollBy(0,200)");
						Thread.sleep(5000);
						//Select Religion = new Select(driver.findElement(By.name("reg[religion]")));
						//Religion.selectByValue("1");
						// to click into the Depature field
						driver.findElement(By.xpath("//*[@id='reg_religion_chzn']/a/span")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id='reg_religion_chzn_o_1']")).click();
						Thread.sleep(2000);
						//enter the hin into the field
						//driver.findElement(By.xpath("//*[@id='reg_religion_chzn']/div/div/input")).sendKeys("Hindu");
					    //Thread.sleep(2000);
						//driver.findElement(By.xpath("//*[@id='reg_religion_chzn"]/div/div/input')).sendKeys(Keys.ARROW_DOWN);
						//Thread.sleep(1000);
						//driver.findElement(By.xpath("//*[@id='reg_religion_chzn']/div/div/input")).sendKeys(Keys.ENTER);
						//Thread.sleep(1000);
				
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//driver.close();  // to close the current browser 
	}			

	}
