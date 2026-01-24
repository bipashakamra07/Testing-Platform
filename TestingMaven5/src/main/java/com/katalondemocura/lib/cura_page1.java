package com.katalondemocura.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cura_page1 {
	WebDriver driver;
	
	//init
	public void cura_page1_init(WebDriver driver) {
		this.driver=driver;
		
	}
	By validatePg1= By.xpath("//*[contains(text(),'We Care About Your Health')]");
	By mkap= By.id("btn-make-appointment");

	By mkapform= By.xpath("//h2[contains(text(),'Make Appointment')]");
	
	
	//automation steps methods
	
	public String LaunchApp(String BaseURL) {
		driver.get(BaseURL);
		String val1= "The app is launched successfully";		
		String val2="Check the url again";
		
		if(driver.findElement(mkap).isDisplayed()) {
			return val1;
		}
		else {
			return val2;
		}
		
	}
	public String ClickonMakeanAppointment() {
		driver.findElement(mkap).click(); {
		String mkaptext=driver.findElement(mkapform).getText();
		return mkaptext;
		
	}
	}
}
