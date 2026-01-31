package ExcelRead;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.messages.internal.com.google.common.io.Files;

import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseMethod {

    public static WebDriver driver;
    private Properties prop = new Properties();
    ExcelReading rm = new ExcelReading();

    private final By nameF= By.id("ctl00_phBody_SignUp_txtName");
    private final By emailF= By.id("ctl00_phBody_SignUp_txtEmail");
    private final By continueBtn= By.id("ctl00_phBody_SignUp_btnContinue");
    private final By passF= By.id("ctl00_phBody_SignUp_txtPassword");
    private final By cPassF= By.id("ctl00_phBody_SignUp_txtConfirmPwd");
    private final By signupBtn= By.id("ctl00_phBody_SignUp_btnSubmit");
    private final By myAccount= By.id("privacypolicy");
    private final By errorNumber = By.id("ctl00_phBody_SignUp_lblmsg");
    private final By captchaFrame = By.xpath("//iframe[@title='reCAPTCHA']");
    private final By captchaBox   = By.id("recaptcha-anchor");
    public int count=0;

    public BaseMethod() {

        if (driver != null) return;

        try {
            FileReader fr = new FileReader("src/test/resources/data.properties");
            prop.load(fr);

            String browser = prop.getProperty("Broswer", "Chrome");

            switch (browser) {
                case "FireFox":
                    driver = new FirefoxDriver();
                    break;

                case "Edge":
                    driver = new EdgeDriver();
                    break;

                default:
                    driver = new ChromeDriver();
                    break;
            }

            driver.manage().window().maximize();

        } catch (Exception e) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public void openSignup() {
        driver.get("https://www.bookswagon.com/login?q=signup");
    }

    public void enterName(String name) {
        driver.findElement(nameF).clear();
        driver.findElement(nameF).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailF).clear();
        driver.findElement(emailF).sendKeys(email);
    }

    public void clickContinue() throws IOException {
        driver.findElement(continueBtn).click();
        if(driver.findElement(errorNumber) != null) {
        	String status= "FAIL";
        	rm.writeStatus(status);
        }
        
        
    }

    public void enterPassword(String pass) {
        driver.findElement(passF).sendKeys(pass);
        driver.findElement(cPassF).sendKeys(pass);
    }

    public void clickSignup() {
        driver.findElement(signupBtn).click();
    }

    public void clickCaptcha() {
        driver.switchTo().frame(driver.findElement(captchaFrame));
        driver.findElement(captchaBox).click();
        driver.switchTo().defaultContent();
    }

    public WebElement checkMyAccount() {
        return driver.findElement(myAccount);
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
    public void takeSS(String name) throws IOException {
    	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	Files.copy(src, new File("./Screenshots/"+name+".png"));
    }
    
    public void navigateBack() {
    	driver.navigate();
    }
    
    public void maximize_broswer() {
    	driver.manage().window().maximize();
    }
    
    public void ref() {
    	driver.navigate().refresh();
    }
    
    public void closeb() {
    	driver.close();
    }
}