package Testscript;

import org.testng.annotations.Test;

public class TC03 {
	  @Test(groups= {"retest"})
	  public void f() {
		  System.out.println("New content");
	  }
	  @Test(groups={"smoketest"})
	  public void smoke1() {
		  System.out.println("end content");
	  }
	}