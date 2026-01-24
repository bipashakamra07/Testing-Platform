package com.katalondemocura.Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.katalondemocura.lib.cura_page1;
import com.katalondemocura.lib.cura_page11;


public class TestScript001 {
	WebDriver driver =  new ChromeDriver();
	  cura_page1 cpage1= new cura_page1();
	  
	  cura_page11 cpage11= new cura_page11();

	  
  @Test(priority=1)
  public void InvokeApp() {
	  cpage1.cura_page1_init(driver);
	  String validateLaunch= cpage1.LaunchApp("https://katalon-demo-cura.herokuapp.com/");
  }
  
  @Test(priority=2)
  public void Click_Make_Appointment() throws InterruptedException {
	  Thread.sleep(3000);
	  cpage1.ClickonMakeanAppointment();
		  
	  
  }
  @Test(priority=3)
  
  public void PerformLogin_User() throws IOException{
	  cpage11.init_cura_page11(driver);
	  cpage11.Enter_Name_Login();
  }
}
