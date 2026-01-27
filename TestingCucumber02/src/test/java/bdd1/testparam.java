package bdd1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class testparam {
	@Given("I want to write a step with {string}")
	public void method(String name){
		System.out.println(name);
	}
	@When("I want to enter {int} id as idnum")
	public void idtest(int id) {
		System.out.println(id);
	}
	
	@And("I want to enter {double} as salary")
	public void saltest(double sal) {
		System.out.println(sal);
		
	}

}
