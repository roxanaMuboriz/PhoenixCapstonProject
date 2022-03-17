package runner;

import org.junit.AfterClass;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/features",
glue = "stepDefinitions",
tags = "@test",
dryRun = false,
strict = true,
monochrome = true,
plugin = {
		"pretty",
		"html:target/site/cucumber-pretty",
		"json:target/cucumber.json"})

public class TestRunner {
	
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}

}
