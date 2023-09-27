package com.sl.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "/Users/mrobi/eclipse-workspace/SwagLabsBDD/src/test/resources/Features",
		glue = {"com.sl.steps"},
		plugin = {"pretty", "html:target/HTMLReports"},
		dryRun = false
		
		
		)
public class TestRunner {

}
