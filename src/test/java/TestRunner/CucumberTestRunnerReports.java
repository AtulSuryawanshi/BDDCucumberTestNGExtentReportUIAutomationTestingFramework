package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "StepDefinition" }, publish = true, plugin = {
		"html:target/cucumber/report.html", "pretty:target/cucumber/report.json", "junit:target/junit-reports/",
		"junit:target/xml-reports/report.xml" })

public class CucumberTestRunnerReports extends AbstractTestNGCucumberTests {

}