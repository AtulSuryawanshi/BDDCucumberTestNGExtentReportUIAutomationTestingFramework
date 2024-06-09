package TestRunner;


import org.junit.runner.RunWith; //Imports are not require anymore 
import io.cucumber.junit.Cucumber;  //Imports are not require anymore 

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) // Run with tag is not require anymore
@CucumberOptions(features = "classpath:features/OpencartBasics.feature", glue = { "StepDefinition" }, monochrome = false)

public class TestNGTestRunnerHelperAttributes extends AbstractTestNGCucumberTests {
	// Cucumber test runner class should extend AbstractTestNGCucumberTests class
}