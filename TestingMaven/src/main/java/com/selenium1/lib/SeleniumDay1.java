package com.selenium1.lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumDay1 {
	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	public void InvokeAwesomeQaAp() {
		driver.get("https://www.awesomeqa.com/ui");
	
	}
	
	public String AwesomeHome_PageTitle() {
		String pgTitleHome=driver.getTitle();
		return pgTitleHome;
	}
	
	public int Count_links_From_HomePage() throws InterruptedException {
		List <WebElement> Links = driver.findElements(By.tagName("a"));
		int LinkCounts= Links.size();
		
		Thread.sleep(3000);
		for(int i=1; i<LinkCounts; i++) {
			String Link_names=Links.get(i).getText();
			Thread.sleep(200);
			System.out.println(Link_names);
		}
		return LinkCounts;
		
	}

}
