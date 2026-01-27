package bdd1;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/java/bdd1"},
glue="bdd1",
tags="@tag6",
plugin= {
		"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/CucumberTestReport.json"
	}
)

public class smoketest02 extends AbstractTestNGCucumberTests{
	
}
