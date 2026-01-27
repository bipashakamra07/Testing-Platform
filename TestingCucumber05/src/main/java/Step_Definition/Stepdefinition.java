package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Stepdefinition {
	WebDriver driver;
//	WebElement docLink=driver.findElement(By.xpath("//*[@id='__docusaurus']/nav/div[1]/div[1]/a[2]"));
	@Given("The user must be in chrome browser")
	public void preSetup() {
	driver = new ChromeDriver();
	}
	
	 @Given("The user is in cucumber.io homepage")
	 public void The_user_is_in_cucumberio_homepage(){
		 String BaseURL="https://cucumber.io/";
		 driver.get(BaseURL);
		 driver.manage().window().maximize();
	 }
	 @When("The user clicks on Documentation link")
	 public void The_user_clicks_on_Documentation_link() {
		 WebElement docLink=driver.findElement(By.xpath("//*[@id='__docusaurus']/nav/div[1]/div[1]/a[2]"));
		 docLink.click();
		 
	 }
	 @Then("The user can view the page content with What is Cucumber?")
	 public void The_user_can_view_the_page_content_with_What_is_Cucumber(){
//		 WebElement cucumber=driver.findElement(By.cssSelector("#what-is-cucumber"));
		 String dataExtract=driver.getTitle();
		 System.out.println(dataExtract);
	 }
}
