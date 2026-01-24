package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class data {
  @Test(dataProvider="dp")
  public void f(String username, String pwd) {
	  System.out.println("Username" + " " + username);
	  System.out.println("Password" + " " + pwd);
  }
  
  @DataProvider
  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] {"Pratik","45bi" },
	      new Object[] {"bipasha","21vi" },
	      new Object[] {"payal","23we"},
	      new Object[] {"chitra","30tyu"}
	      };
	  }
}
