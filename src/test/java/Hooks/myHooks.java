package Hooks;

import java.time.Duration;
import java.util.Optional;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v114.css.CSS.TakeCoverageDeltaResponse;

import Factory.Driverfactory;
import Utils.ConfigReaders;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.plugin.event.Node.Scenario;

public class myHooks {
	WebDriver driver;
	@Before
	public void setup() {
		Properties prop=new ConfigReaders().InitializeProperties();
		driver=Driverfactory.initializedriver(prop.getProperty("browser"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.get(prop.getProperty("url"));
	}
	@After
	public void tearDown(Scenario scenario) {
		String scenarioName=scenario.getName();
		if(scenario.isFailed()) {
			byte[] srcscreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcscreenshot,"image/png",scenarioName);
		}
		driver.quit();
	}
}
