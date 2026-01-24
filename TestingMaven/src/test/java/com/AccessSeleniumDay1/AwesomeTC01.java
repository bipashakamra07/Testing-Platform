package com.AccessSeleniumDay1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium1.lib.SeleniumDay01;
import com.selenium1.lib.SeleniumDay1;

import junit.framework.Assert;

public class AwesomeTC01 {
	WebDriver driver= new ChromeDriver();
	SeleniumDay1 pg1= new SeleniumDay1();
	SeleniumDay01 pg0= new SeleniumDay01();
	
	String Exp_HomePgTitleIs="Your Store";
	
  @Test(priority=1)
  public void InvokeApp_Awesome() {
	  pg0.init0(driver);
	  pg0.Maximize_Browser_Window();
	  pg0.Delete_Cookies_From_BrowserWindow();
	  
	 
	  pg1.init(driver);
	  pg1.InvokeAwesomeQaAp();
	  //String HomePgTitleIs= pg1.AwesomeHome_PageTitle();
	  //System.out.println("HomePageTitleIs" + " " + HomePgTitleIs);
  }
  @Test(priority=2)
  public void Fetch_And_Validate_Title() {
	  String HomePgTitleIs= pg1.AwesomeHome_PageTitle();
	  System.out.println("HomePgTitleIs" + " " + HomePgTitleIs);
	  Assert.assertEquals(HomePgTitleIs, Exp_HomePgTitleIs);
  }
  
  @Test(priority=3)
  public void Count_Links_Test() throws InterruptedException {
	  int cnt=pg1.Count_links_From_HomePage();
	  System.out.println("Total number of links : " + " " + cnt);
  }

}
