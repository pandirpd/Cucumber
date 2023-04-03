package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"StepDefinitions"},
monochrome=true,plugin={"pretty","json:target/JSONReport/report.json","pretty","html:target/HTMLReport/report.html",
		"pretty","junit:target/JUnitReport/report.xml"},
tags="@smoketest")
public class TestRunner {
	
	

}
