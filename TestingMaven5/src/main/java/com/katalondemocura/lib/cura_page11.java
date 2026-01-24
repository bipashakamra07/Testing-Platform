package com.katalondemocura.lib;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cura_page11 {
	WebDriver driver;
	Properties p = new Properties();

	
	By unm= By.name("username");
	
	public void init_cura_page11(WebDriver driver ) {
		this.driver=driver;
	}
	public void Enter_Name_Login() throws IOException {
		String path1="C://Users//bipasha.kamra//eclipse-workspace//TestingMaven5//TestData//datatest.properties//TestData//dataset.properties";
		
		FileReader fr = new FileReader(path1);
		p.load(fr);
		System.out.println("value of p is: " + " " + p);
		driver.findElement(unm).sendKeys(p.getProperty("username1"));
		System.out.println(p.getProperty("username1"));
		System.out.println(p.getProperty("password1"));
	}

}
