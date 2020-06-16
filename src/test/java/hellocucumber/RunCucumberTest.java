package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-report.json"},
        //"html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber-results.xml",
        //        "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json"},
        tags = "@cucumber",
        glue = {"hellocucumber/steps"},
        features = "src/test/resources/features")

public class RunCucumberTest {
}
