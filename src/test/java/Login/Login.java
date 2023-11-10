package Login;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Factory.Driverfactory;
//import Factory.Driverfactory;
import Xpath.LoginXpath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class Login {
	WebDriver driver;
	public LoginXpath logdriver;
	@Given("^User Launch Chrome Browser$")
	public void User_navigate_Login_Page() {
		driver=Driverfactory.getDriver();
		
	}

	@When("^User enters Email as (.*) and Password as (.*)$")
	public void enter_Email_password(String uname, String pword) {
		 logdriver=new LoginXpath(driver);
		logdriver.setUsername(uname);
		logdriver.setPassword(pword);
	}
	@When("^Click on Login$")
	public void click_Login() {
		
		logdriver.clickLogin();
	}
	
}
