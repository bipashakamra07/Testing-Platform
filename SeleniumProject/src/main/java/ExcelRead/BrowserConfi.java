package ExcelRead;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;



public class BrowserConfi {
	public static WebDriver driver;
	private Properties prop = new Properties();
	
	public BrowserConfi() {
		if(driver!=null) {
			return;
		}
		try {
			prop=new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\bipasha.kamra\\eclipse-workspace\\SeleniumTrainningProject\\data\\config.properties");
			
			prop.load(fis);
			
			String browser= prop.getProperty("browser");
		
		switch (browser) {
		
		case "Chrome": 
			driver= new ChromeDriver();
			break;
			
		case "Firefox":
			driver= new FirefoxDriver();
			break;
			
		case "Edge":
			driver= new EdgeDriver();
			break;
			
			default: throw new RuntimeException("Invalid browser name");
		}
		driver.manage().window().maximize();
	} catch (Exception e) {
		driver= new ChromeDriver();
	}
	}
	
	
	
	public void open_browser() {
		String baseURL= "https://www.bookswagon.com/login?q=signup";
		driver.get(baseURL);
	}
	
	public void quit_driver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
}
	

