package com.Selenium.Lib;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class seleniumScenarios1 {

	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	
	public 	List <String> searchOptions() throws InterruptedException{
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		List<WebElement> options= driver.findElements(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li"));
		List <String> resultOptions= new ArrayList<String>();
		for(int i=0; i<options.size(); i++) {
			Thread.sleep(300);
			String result= options.get(i).getText();
			System.out.println(result);
			resultOptions.add(result);
		}
		return resultOptions;
	}
	
	public List<WebElement> Extract_Table_Data() {
		driver.get("httpa://www.w3schools.com/html/html_tables.asp");
		
		List <WebElement> dataList= driver.findElements(By.xpath("//table[@id='customers']//tr/td"));
		
		for(int i=0; i<dataList.size(); i++) {
			String dataAct= dataList.get(i).getText();
			System.out.println(dataAct);
			
			
		}
		return dataList;
		
	}
	
	public List <WebElement> Select_Drop_List_Data() throws InterruptedException {
		driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
		WebElement elements= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select sel= new Select(elements);
		//sel.selectByIndex(3);
		//sel.selectByVisibleText("Baby");
		//sel.selectByValue("search-alias=amazon-devices");
		 Thread.sleep(2000);
		List <WebElement> myList = sel.getOptions();
		 Thread.sleep(2000);
		for(int i=0; i<myList.size(); i++) {
			String values= myList.get(i).getText();
			System.out.println(values);
			 Thread.sleep(100);
		}
		return myList;
				
	}
	
	public void SelectByIndexTest() throws InterruptedException {
		driver.get("https://demo.guru99.com/tyest/newtours/register.php");
		Thread.sleep(2000);
		WebElement elements2 = driver.findElement(By.name("country"));
		Select selTest= new Select(elements2);
		Thread.sleep(2000);
		selTest.selectByIndex(3);
	}
	
	public String Extract_HandelAlert_Message() throws InterruptedException {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		Alert act= driver.switchTo().alert();
		WebElement unm= driver.findElement(By.id("login1"));
		WebElement pwd= driver.findElement(By.id("password"));
		WebElement submessage= driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		driver.findElement(By.name("login")).sendKeys("testdata1");
		submessage.click();
		Alert act1= driver.switchTo().alert();
		Thread.sleep(4000);
		String Act_AlertMessage= act1.getText();
		Thread.sleep(2000);
		act1.accept();
		Thread.sleep(2000);
		unm.sendKeys("gayatridata");
		return Act_AlertMessage;
		
		
	}
	public Actions frames() throws InterruptedException {
	
	driver.get("https://jqueryui.com/draggable/");
	driver.switchTo().frame(0);
	WebElement scrElement= driver.findElement(By.id("draggable"));
	WebElement destElement= driver.findElement(By.id("droppable"));
	
	Actions act2= new Actions(driver);
	Thread.sleep(2000);
	act2.dragAndDrop(scrElement, destElement);
	//act2.clickAndHold(scrElement).moveToElement(destElement).release().perform()	;
	//act2.clickAndHold(scrElement)moveToElement(destElement).release();
	//build().perform();
	return act2;
	}
	
}
