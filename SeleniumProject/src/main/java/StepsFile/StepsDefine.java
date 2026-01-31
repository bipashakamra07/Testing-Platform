package StepsFile;

import ExcelRead.BaseMethod;
import ExcelRead.ExcelReading;
import io.cucumber.java.en.*;

import java.io.IOException;
import java.util.List;

import org.testng.Reporter;

public class StepsDefine {

    ExcelReading excel = new ExcelReading();
    BaseMethod bm;

    public StepsDefine() {
        bm = new BaseMethod();
    }

    @Given("User is on signup page")
    public void openSignup() {
        bm.openSignup();
    }

    @Given("User has entered registration fields")
    public void registrationFields() throws Exception {
        List<String> data = excel.excelRead();
        String name  = data.get(0);
        String email = data.get(1);

        bm.enterName(name);
        bm.enterEmail(email);
        bm.takeSS();
    }

    @And("user checks captcha")
    public void captcha() throws InterruptedException {
        bm.clickCaptcha();
        Thread.sleep(60000);
    }

    @And("user clicks continue")
    public void clickContinue() throws IOException {
        bm.clickContinue();
    }

    @And("user enters password")
    public void enterPassword() {
        bm.enterPassword("Goodluck@1");
    }

    @And("user clicks Signup")
    public void doSignup() {
        bm.clickSignup();
    }

    @Then("user sees My Account")
    public void verifyAccount() {
        boolean visible = bm.checkMyAccount().isDisplayed();
        System.out.println("Result: " + (visible ? "PASS" : "FAIL"));
        Reporter.log(bm.checkMyAccount().getText());
    }
    
}