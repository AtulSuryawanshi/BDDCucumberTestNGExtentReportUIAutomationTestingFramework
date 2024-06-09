package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "StepDefinition" }, tags = "@RegressionTest and @SanityTest")

public class CucumberTestRunnerTags{

}