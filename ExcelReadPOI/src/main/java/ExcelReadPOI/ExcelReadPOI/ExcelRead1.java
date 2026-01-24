package ExcelReadPOI.ExcelReadPOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead1 {
	public String ReadCellData(int vRow, int vColumn) throws IOException {
		String value=null;
		Workbook wb=null;
		

		FileInputStream fis= new FileInputStream("./TestData/Test1.xlsx");
		wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheetAt(0);
		Row row= sheet.getRow(vRow);
		Cell cell=row.getCell(vColumn);
		value= cell.getStringCellValue();
		//cell.getNumeriCellValue();
		//cell.getDateCellValue();
		//cell.getHyperlink();
		//cell.getLocalDateTimeCellValue();
		return value;

}
}
