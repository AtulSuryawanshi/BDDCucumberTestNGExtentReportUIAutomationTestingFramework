package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "StepDefinition" }, tags = "@MobileTest")

public class CucumberTestRunnerHooks extends AbstractTestNGCucumberTests {

}