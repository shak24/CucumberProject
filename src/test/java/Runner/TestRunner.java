



package Runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/Features",
glue= {"StepDefinations"},

plugin = "message:target/cucumber-report.ndjson")

public class TestRunner {

}
