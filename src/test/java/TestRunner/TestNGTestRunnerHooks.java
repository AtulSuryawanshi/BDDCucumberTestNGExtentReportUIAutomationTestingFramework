package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features/OpencartHooks.feature", glue = { "StepDefinition" }, tags = "@MobileTest")

public class TestNGTestRunnerHooks extends AbstractTestNGCucumberTests {

}