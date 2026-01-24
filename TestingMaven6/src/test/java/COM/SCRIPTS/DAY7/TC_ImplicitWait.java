package COM.SCRIPTS.DAY7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_ImplicitWait {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver=new ChromeDriver();
	  
	  driver.get("https://awesomeqa.com/ui");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	  WebElement num= driver.findElement(By.xpath("//*[contains(text(),'1234567810')]"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  String phnum= num.getText();
	  System.out.println(phnum);
			 
  }
  
  @Test
  public void Explicit_Synd() {
	  driver.get("https://orangetravels.in/#/");
	  WebElement ignore=driver.findElement(By.xpath("//button[@data-dismiss='modal']"));
	  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOf(ignore)).click();
	  
	  
  }
}
