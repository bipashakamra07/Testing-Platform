package com.AccessSeleniumDay1;

import org.testng.annotations.Test;

import com.selenium1.lib.SeleniumDay01;
import com.selenium1.lib.SeleniumDay1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataExtraction_Test {
	WebDriver driver= new ChromeDriver();
	SeleniumDay1 scm1= new SeleniumDay1();
	SeleniumDay01 sd1l= new SeleniumDay01();
	
	
  @Test
  public void Extract_Page_Content() {
	  
	  scm1.init(driver);
	  scm1.InvokeAwesomeQaAp();
	  sd1l.init0(driver);
	  String res = sd1l.Extract_PageSource_Content();
	  System.out.println(res);
	  
  }
}
