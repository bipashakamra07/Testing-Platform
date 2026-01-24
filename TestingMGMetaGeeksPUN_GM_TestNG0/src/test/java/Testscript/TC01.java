package Testscript;

import org.testng.annotations.Test;

public class TC01 {
  @Test(priority=1)
  public void f() {
	  System.out.println("Hello world");
  }
  @Test
  public void t() {
	  System.out.println("I am dog");
  }
}
