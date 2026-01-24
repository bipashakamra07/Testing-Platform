package com.selenium1.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
	public static void main (String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.awesomeqa.com/ui");
		
		String PgTitle1= driver.getTitle();
		System.out.println(PgTitle1);
	}
		
	
	

}
