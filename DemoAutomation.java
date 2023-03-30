
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.*;


public class DemoAutomation {

	public static void main(String[] args) {

//		//System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
		//System.setProperty("webdriver.gecko.driver", "c:\\webdrivers\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", "c:\\webdrivers\\msedgedriver");
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
	}

}
