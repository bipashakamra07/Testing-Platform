package StepDefinition06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	
	WebDriver driver;
//	WebElement docLink=driver.findElement(By.xpath("//*[@id='__docusaurus']/nav/div[1]/div[1]/a[2]"));
	@Given("The user must be in chrome browser")
	public void preSetup() {
	driver = new ChromeDriver();
	}
	
	 @Given("I am on the login page")
	 public void method1(){
		 String BaseURL="https://www.bookswagon.com/login?=signup";
		 driver.get(BaseURL);
		 driver.manage().window().maximize();
	 }
	 @When("I enter mandatory details from {test_id} in {sheetName}")
	 public void method2() {
		 WebElement docLink=driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]"));
		 docLink.click();
		 
	 }
	 @Then("I should be logged in successfully")
	 public void method3(){
	 WebElement cucumber=driver.findElement(By.cssSelector("#what-is-cucumber"));
		 String dataExtract=driver.getTitle();
		 System.out.println(dataExtract);
	 }

}
