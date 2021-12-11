package Seleniumprograms;
import java.util.Iterator; 
import java.util.Set; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Windows {
	
	public static void main(String[] args) throws Exception {
		String usrDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",usrDir + "\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	// Load the website
	driver.get("http://www.naukri.com/");

	// It will return the parent window name as a String
	String parent=driver.getWindowHandle();

	Set<String>s=driver.getWindowHandles();

	// Now iterate using Iterator
	Iterator<String> I1= s.iterator();
	driver.manage().window().maximize();
	while(I1.hasNext())
	{

	String parent_window1=I1.next();


	if(!parent.equals(parent_window1))
	{
	driver.switchTo().window(parent_window1);

	System.out.println(driver.switchTo().window(parent_window1).getTitle());

	driver.close();
	}

	}
	//switch to the parent window
	driver.manage().window().maximize();
	driver.switchTo().window(parent);

	}
	}

