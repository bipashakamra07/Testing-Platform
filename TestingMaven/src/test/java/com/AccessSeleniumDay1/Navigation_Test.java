package com.AccessSeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.selenium1.lib.SeleniumDay01;
import com.selenium1.lib.SeleniumDay1;

public class Navigation_Test {
	
	WebDriver driver= new ChromeDriver();
	SeleniumDay1 pg1= new SeleniumDay1();
	SeleniumDay01 sdc= new SeleniumDay01();
	
	@Test
	public void NavigateBackTest() throws InterruptedException {
		pg1.init(driver);
		pg1.InvokeAwesomeQaAp();
		Thread.sleep(2000);
		sdc.init0(driver);
		sdc.Navigate_Back();
	}

}
