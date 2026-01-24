package com.selenium.day2Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.selenium.day2Lib.SeleniumDay2Lib1;

import junit.framework.Assert;

public class SeleniumDay2Lib1_S1 {
	
	WebDriver driver= new ChromeDriver();
	SeleniumDay2Lib1 sd2lib= new SeleniumDay2Lib1();
	
	String Expected="My Orders";
	String ExpectedError= "Warning";
	String ActError="Warning";
	
  @Test(priority=1)
  public void Test_Login_Validate() throws InterruptedException {
	  sd2lib.init(driver);
	  sd2lib.launchCart();
	  String logStr = sd2lib.loGassert("bipasha.kamra@example.com", "user@123");
	  //Thread.sleep(1000);
	  Assert.assertEquals(logStr, Expected);
	  
			  
  }
  
  @Test(priority=2)
  public void Test_Login_Validate1() throws InterruptedException {
	  String logStr=sd2lib.loGassert("bipasha.kamra@example.com", "user@123");
	  Assert.assertEquals(logStr, Expected);
	  Actions act= new Actions(driver);
	  WebElement el= driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/i"));
	  act.moveToElement(el).click().build().perform();
	  
	  //Thread.sleep(3000);
	  
	  
  }
  @Test(priority=3)
  public void Test_Login_Validate2() throws InterruptedException {
	  sd2lib.init(driver);
	  sd2lib.launchCart();
	  String ActError= sd2lib.loGassert("c344","5573 " );
	  Assert.assertEquals(ExpectedError, ActError);
  }
}
