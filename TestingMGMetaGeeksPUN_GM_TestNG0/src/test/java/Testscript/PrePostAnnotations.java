package Testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrePostAnnotations {
	@BeforeTest
	public void BeforeTestExecute() {
		System.out.println("This will execute before the test");
		}

	@AfterTest
	public void AfterTestExecute() {
		System.out.println("This will execute after before the test");
	}
	
	@BeforeClass
	public void BeforeTestClass() {
		System.out.println("Before class");
		
	}
	
	@AfterClass
	public void AfterTestClass() {
		System.out.println("After class");
		
	}
	
	@BeforeMethod
	public void BeforeMethodTest() {
		
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void AfterMethodTest() {
		
		System.out.println("After method");
	}
	
	@BeforeSuite
	public void BeforeSuiteTest() {
		
		System.out.println("Before Suite");
	}
  
	@AfterSuite
	public void AfterSuiteTest() {
		
		System.out.println("After Suite");
	}
}
