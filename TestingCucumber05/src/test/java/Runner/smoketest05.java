package Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/java/Features05"},
glue="Step_Definition",
tags="@tag1",
plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"junit:target/cucumber-reports/CucumberTestReport.xml"
	}
)

public class smoketest05 extends AbstractTestNGCucumberTests{
	
}


