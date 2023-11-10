package StepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
			features = ".//Features//Login.feature",
			glue = "Login",plugin = {"pretty","html:test-output"},dryRun = false, tags = "@LoginUse"
		)
public class LoginRunner {
	
	
}
