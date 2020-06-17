package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"pretty", "html:target/cucumber-html-reports", "json:target/cucumber-json-reports/cucumber.json"},
        tags = "@cucumber",
        glue = {"hellocucumber/steps"},
        features = "src/test/resources/features")

    public class RunCucumberTest {

}
