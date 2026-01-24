package bdd1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class StepDef03 {
	
	@Given("I want to write a step with precondition")
	public void testmethods1() {
		System.out.println("I want to write a step with precondition");
	}
	@And("some other precondition")
	public void testmethods2() {
		System.out.println("some other precondition");
	}

}
