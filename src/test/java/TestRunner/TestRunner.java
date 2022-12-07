package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features"
        ,glue = "stepdefinitions"
        , plugin = {"pretty","html:target/cucumber.html"}
/*, tags = "@subscription"*/)
public class TestRunner {
}
