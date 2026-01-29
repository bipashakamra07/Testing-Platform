package StepsFile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

import ExcelRead.BrowserConfi;
import ExcelRead.ExcelReading;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepsDefine extends BrowserConfi{
		
	public StepsDefine(){
		super();
	}
	
	ExcelReading obj = new ExcelReading();
	
//	@Given("the user is in signup page")
//	public void Signuppage() {
//		String baseURL = "https://www.bookswagon.com/login?q=signup";
//		driver.get(baseURL);
//	}
	
	@Given("User has entered the resgriration feilds")
//	public void registrationFeilds() throws Exception {
//		List<String> data = obj.excelRead(0, 0);
//		for (int i = 0; i < data.size(); i += 2) {
//			String name = data.get(i);       
//	        String phone = data.get(i + 1);
//	        WebElement nameF = driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtName\"]"));
//	        nameF.clear();
//	        nameF.sendKeys(name);
//		
//	        WebElement phoneNoF= driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtEmail\"]"));
//	        phoneNoF.clear();
//	        phoneNoF.sendKeys(phone);
//	        
//	        Thread.sleep(2000);
//		}
//	}
	public void registrationFeilds() throws IOException {

	    List<String> data = obj.excelRead();

	    // Fill ONLY first row
	    String name = data.get(0);
	    String phone = data.get(1);

	    WebElement nameF = driver.findElement(
	            By.id("ctl00_phBody_SignUp_txtName"));
	    nameF.clear();
	    nameF.sendKeys(name);

	    WebElement phoneNoF = driver.findElement(
	            By.id("ctl00_phBody_SignUp_txtEmail"));
	    phoneNoF.clear();
	    phoneNoF.sendKeys(phone);
	}
	
	@And("user checks captcha")
	public void captchaCheck() throws InterruptedException {

	    driver.switchTo().frame(
	            driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"))
	    );

	    driver.findElement(By.id("recaptcha-anchor")).click();

	    Thread.sleep(120000);

	    driver.switchTo().defaultContent();
	}
	
	@And("user clicks on continue")
    public void continueClick() {
       driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_btnContinue\"]")).click();
    }
	
	@And("user enter the password")
	public void setPass() throws InterruptedException {
		Thread.sleep(50000);
		String pass= "Goodluck@1";
		WebElement Pass= driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtPassword\"]"));
		Pass.sendKeys(pass);
		WebElement ConfirmPass = driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtConfirmPwd\"]"));
		ConfirmPass.sendKeys(pass);
		
	}
	@And("user clicks on Signup")
	public void signupF() {
		driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_btnSubmit\"]")).click();
	}
	@Then("user sees My Account")
	public void seeMyAccount() throws IOException {
		WebElement myAcc = driver.findElement(By.xpath("//*[@id=\"privacypolicy\"]"));
		if(myAcc.isDisplayed()) {
			obj.writeStatus("Pass");
		}else {
			obj.writeStatus("Fail");
		}	
	}
}
