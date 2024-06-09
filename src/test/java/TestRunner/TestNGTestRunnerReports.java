package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features", glue = { "StepDefinition" }, publish = true, plugin = {
		"html:target/cucumber/report.html", "pretty:target/cucumber/report.json", "junit:target/junit-reports/",
		"junit:target/xml-reports/report.xml" })

public class TestNGTestRunnerReports extends AbstractTestNGCucumberTests {

}