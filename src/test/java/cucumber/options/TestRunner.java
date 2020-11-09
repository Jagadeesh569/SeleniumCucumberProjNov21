package cucumber.options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


@CucumberOptions(features ="src/test/resources/Features/",
				 glue = "stepDefinitions",
				 monochrome = true,
				 plugin={"pretty","html:test-output","json:target/cucumber.json",
						 "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentHtmlReport.html"})


@RunWith(Cucumber.class)
public class TestRunner {
	

}
