package Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginXpath {
	WebDriver driver;
	public LoginXpath(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	WebElement textuname;
	@FindBy(name="password")
	WebElement textpword;
	@FindBy(tagName="button")
	WebElement textloginbtn;
	public void setUsername(String uname) {
		textuname.clear();
		textuname.sendKeys(uname);
	}
	public void setPassword(String pword) {
		textpword.clear();
		textpword.sendKeys(pword);
	}
	public void clickLogin() {
		textloginbtn.click();
	}
}
