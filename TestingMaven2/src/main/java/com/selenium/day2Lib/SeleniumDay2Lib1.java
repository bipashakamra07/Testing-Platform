package com.selenium.day2Lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDay2Lib1 {
	
	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	public String launchCart() {
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");
		String LoginPageTitle= driver.getTitle();
		return LoginPageTitle;
		
	}
	
	public String loGassert(String email, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit'] ")).click();
		String confirmation_message=driver.findElement(By.xpath("//h2[contains(text(),'My Orders')]")).getText();
		Thread.sleep(4000);
		Actions act= new Actions(driver);
		WebElement el= driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/i"));
		act.moveToElement(el).click().build().perform();
		Thread.sleep(20000);
		WebElement el1= driver.findElement(By.xpath("(//a[contains()text(),'Logout')])[1]"));
		el1.click();
		Thread.sleep(3000);
		return confirmation_message;

	}
	

}
