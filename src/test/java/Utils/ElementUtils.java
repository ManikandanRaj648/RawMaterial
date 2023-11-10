package Utils;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void clickonelement(WebElement element,long durationIntsecond) {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(durationIntsecond));
		WebElement webele = webdriverwait(element, durationIntsecond);
		webele.click();
	}
	public void typetobetexted(WebElement element, long durationIntsecond, String texttyped) {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(durationIntsecond)) ;
			WebElement webele = webdriverwait(element, durationIntsecond);
			webele.clear();
			webele.click();
			webele.sendKeys(texttyped);
		
	}
	public WebElement webdriverwait(WebElement element, long durationIntsecond) {
		WebElement webele=null;
		try {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(durationIntsecond));
		webele = wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return webele;
	}
	public void acceptAlert(WebElement element,long durationIntsecond) {
		Alert alert=waitforAlert(element,durationIntsecond);
		alert.accept();
	}
	public void dismissAlert(WebElement element, long durationIntsecond) {
		Alert alert=waitforAlert(element, durationIntsecond);
		alert.dismiss();
	}
	public Alert waitforAlert(WebElement element,long durationIntsecond) {
		Alert alert=null;
		try{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(durationIntsecond));
		alert = wait.until(ExpectedConditions.alertIsPresent());
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return alert;
	}
	public void mouseandHover(WebElement element, long durationIntsecond) {
		WebElement webele=waitforVisibleElement(element, durationIntsecond);
		Actions action=new Actions(driver);
		action.moveToElement(webele).click().build().perform();
		
	}
	public WebElement waitforVisibleElement(WebElement element,long durationIntsecond) {
		WebElement ele=null;
		try {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(durationIntsecond));
		ele = wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ele;
		
	}
	public boolean displayedElement(WebElement element, long durationIntsecond) {
		
		try {			WebElement ele11=waitforVisibleElement(element, durationIntsecond);
			return ele11.isDisplayed();
			
		}catch(Throwable e) {
			e.printStackTrace();
			return false;
		}
	}
}
