package Xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MarketCirclelXpath {
	@FindBy(xpath="//p[text()='Master']")
	WebElement pmaster;
	@FindBy(xpath="//p[text()='Customers']")
	WebElement customers;
	@FindBy(xpath="//Select[@placeholder='Company Name']")
	WebElement Filter;
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement Search;
	@FindBy(xpath="//*[local-name()='svg'][@height=24]")
	WebElement edit;
	@FindBy(xpath="//button[.='Update']")
	WebElement update;
	@FindBy(xpath="//button[.='OK']")
	WebElement OK;
	public void searchMaster() {
		pmaster.click();
	}
	public void searchCustomers() {
		customers.click();
	}
	public void selectFilter() {
		Select sel=new Select(Filter);
		sel.selectByIndex(0);
	}
	public void Searchsch() {
		Search.sendKeys("210051");
	}
	public void clickedit() {
		edit.click();
	}
	public void click_Update() {
		update.click();
	}
	public void click_Ok() {
		OK.click();
	}
}
