package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features", glue = { "StepDefinition" }, tags = "@RegressionTest and @SanityTest")

public class TestNGTestRunnerTags extends AbstractTestNGCucumberTests {

}