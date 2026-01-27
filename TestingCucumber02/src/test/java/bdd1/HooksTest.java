package bdd1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksTest {
	@Before
	public void testBefore() {
		System.out.println("Before Test");
		
	}
	
	@After
	public void testAfter() {
		
		System.out.println("After Test");
		
	}
	
	@Before("@tag6 or @tag3")
	public void BeforewithTag() {
		System.out.println("Before with tag");
	}
	

	@After("@tag6 or @tag3")
	public void AfterwithTag() {
		System.out.println("After with tag");
	}
	@Before("@tag6 and not @tag3")
	public void BeforeNot() {
		System.out.println("Invalid");
	}
	
	@After("@tag6 and not @tag3")
	public void AfterNot() {
		System.out.println("After Not Invalid");
	}

}
