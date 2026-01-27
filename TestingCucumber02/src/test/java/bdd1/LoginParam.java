package bdd1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginParam {
	@Given("The user is in Login form")
	public void method1() {
		System.out.println("The user is in Login form");
	}
	
	@When("The user enters {string} in username field")
	public void method2(String Username) {
		System.out.println(Username);
	}
	
	@And("The user enters {string} in password field")
	public void method3(String Password) {
		System.out.println(Password);
	}
	
	@And("The user clicks on Login button")
	public void method4() {
		System.out.println("The user clicks on Login button");
	}
	
	@Then("The user get the status message as {string} in alert")
	public void method5(String Status) {
		System.out.println(Status);
	}
}
