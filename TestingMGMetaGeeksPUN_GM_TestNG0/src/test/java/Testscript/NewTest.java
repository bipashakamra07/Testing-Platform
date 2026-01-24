package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	
	
  @Test
  public void testMultipleValidations(){
	  SoftAssert softAssert= new SoftAssert();
 
	  softAssert.assertEquals(2+ 2, 8, "Method check failed");
	  softAssert.assertFalse(10<5, "Condition check failed");
	  softAssert.assertAll();
	  System.out.println("Hello");
  }
}
