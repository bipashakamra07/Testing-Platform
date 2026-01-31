package StepsFile;

import ExcelRead.BaseMethod;
import io.cucumber.java.After;

public class hooks {

    BaseMethod bm;

    public hooks() {
        bm = new BaseMethod();
    }

    @After
    public void teardown() {
        bm.quitDriver();
    }
}