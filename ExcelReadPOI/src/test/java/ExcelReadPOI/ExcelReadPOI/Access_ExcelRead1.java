package ExcelReadPOI.ExcelReadPOI;

import java.io.IOException;

import org.testng.annotations.Test;

public class Access_ExcelRead1 {
	ExcelRead1 obj= new ExcelRead1();
	
  @Test
  public void ReadDataFromExcel() throws IOException {
	  ExcelRead1 obj= new ExcelRead1();
	  String res=obj.ReadCellData(1, 2);
	  System.out.println(res);
  }
}