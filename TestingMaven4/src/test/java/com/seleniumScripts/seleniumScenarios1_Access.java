package com.seleniumScripts;

import org.testng.annotations.Test;

import com.Selenium.Lib.seleniumScenarios1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumScenarios1_Access {
	
	WebDriver driver =  new ChromeDriver();
	seleniumScenarios1 ssc= new seleniumScenarios1();
	
	
  @Test(priority=1)
  public void f() throws InterruptedException {
	  ssc.init(driver);
	  List<String> FinalOptions = ssc.searchOptions();
	  System.out.println(FinalOptions);
  }
  @Test(priority=2)
  public void TableData() {
	  ssc.init(driver);
	  ssc. Extract_Table_Data();
  }
  @Test(priority=3)
  public void Extract_Data_Dropdown() throws InterruptedException {
	  List<WebElement> finalList= ssc.Select_Drop_List_Data();
	  ssc.Select_Drop_List_Data();
	  
  }
  
  //@Test(priority=4)
  //public void SelectIndex() throws InterruptedException{
	  //ssc.init(driver);
	  //ssc.SelectByIndexTest();
	  
  //}
  
  @Test(priority=5)
  public void ExtractAlertMessage() throws InterruptedException{
	  ssc.init(driver);
	  String actAlert=ssc.Extract_HandelAlert_Message();
	  System.out.println("Alert Message is: " + " " + actAlert);
  }
  @Test(priority=6)
  public void draganddrop() throws InterruptedException{
	  ssc.init(driver);
	  Actions actAlert1= ssc.frames();
	  System.out.println("Dragger and dropper " + " " + actAlert1);
			   
  }
  
  
}
