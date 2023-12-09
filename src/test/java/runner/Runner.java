package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/features",
        glue = {"src/test/java/stepDef", "src/test/java/utility"},
        plugin = { "pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
)

public class Runner {
}
