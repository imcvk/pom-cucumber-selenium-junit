package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/concepts"}, glue = {"stepdefinitions"},
        monochrome = true, plugin = {"pretty", "html:target/cucumber-reports/reports.html"}
//    tags = "@smokeTest or @systemTest and @Regression"
//    tags = "@smokeTest or @systemTest and not @Regression"
)
public class BackgroundRunner {
}
