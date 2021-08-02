import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/featureFiles",
		glue = {"stepDefinitions", "helperMethods"})
public class TestRunner
{
	

}