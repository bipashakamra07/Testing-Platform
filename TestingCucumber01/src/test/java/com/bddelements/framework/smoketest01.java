package com.bddelements.framework;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features= {"src/test/java/com.bddelements.framework"},
	glue="com.bddelements.framework"
	//plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
			//"json:target/cucumber-reports/CucumberTestReport.json"
	//}
	)

public class smoketest01 extends AbstractTestNGCucumberTests{
		
}

