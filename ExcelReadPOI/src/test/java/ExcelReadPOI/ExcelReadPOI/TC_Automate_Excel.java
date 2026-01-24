package ExcelReadPOI.ExcelReadPOI;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Automate_Excel {
	WebDriver driver= new ChromeDriver();
	ExcelRead1 obj=new ExcelRead1();
  @Test
  public void SearchStringPass_Google() throws IOException {
	  driver.get("https://www.google.com");
	  String test= obj.ReadCellData(1,2);
	  driver.findElement(By.name("q")).sendKeys(test);
	
	  
  }
}
