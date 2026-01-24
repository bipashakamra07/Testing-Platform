package Testscript;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

public class TC04 {
  @Test(dataProvider = "dp")
  public void f(Integer EmpId, String EmpNm, Integer EmpAge) {
	  System.out.println("Emp id id" + " " + EmpId);
	  System.out.println("Emp Emp name" + " " + EmpNm);
	  System.out.println("Emp age of emp" + " " + EmpAge);
  }
  @Test(dataProvider= "dp1")
  public void f1(Integer EmpId1, String EmpNm1, Integer EmpAge1) {
	  System.out.println("Emp id id" + " " + EmpId1+ " " + EmpNm1+ " "+ EmpAge1);
	
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 11472, "Pratik",45 },
      new Object[] { 43567, "bipasha",21 },
      new Object[] { 23567, "payal",23 },
      new Object[] { 45567, "chitra",30}
      };
  }
    
    @DataProvider
    public Object[][] dp1() {
      return new Object[][] {
        new Object[] { 21472, "ratik",45 },
        new Object[] { 93567, "bipasha",21 },
        new Object[] { 73567, "hardik",23 },
        new Object[] { 2345, "yaani", 22},
      };
  }
}
