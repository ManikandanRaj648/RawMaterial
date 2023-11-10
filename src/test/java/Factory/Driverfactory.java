package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Xpath.LoginXpath;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	static WebDriver driver=null;
	public static WebDriver initializedriver(String browserName) {
		 
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().avoidResolutionCache().setup();
			driver=new ChromeDriver();
		}else if(browserName.equals("firefox")){
			driver=new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}
		return driver;
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
}
