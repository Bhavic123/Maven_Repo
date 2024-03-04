package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features/login.feature", 
		glue = "Step_def", 
		monochrome = true, 
		dryRun = false, 
		plugin = {"pretty", "html:test-output" }
)
public class RunnerTest {

}
