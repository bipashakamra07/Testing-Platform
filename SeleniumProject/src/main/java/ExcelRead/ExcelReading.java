package ExcelRead;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {


    public List<String> excelRead() throws IOException {

        List<String> data = new ArrayList<>();

        FileInputStream fi = new FileInputStream("./data/data2.xlsx");
        Workbook wb = new XSSFWorkbook(fi);
        Sheet sheet = wb.getSheetAt(0);

        int rows = sheet.getLastRowNum();

        for (int i = 0; i <= rows; i++) {

            Row row = sheet.getRow(i);

            data.add(row.getCell(0).getStringCellValue());
            data.add(String.valueOf(
                    (long) row.getCell(1).getNumericCellValue()
            ));
        }


        return data;
    }

    public void writeStatus(String status) throws IOException {

        FileInputStream fi = new FileInputStream("./data/data2.xlsx");
        Workbook wb = new XSSFWorkbook(fi);
        Sheet sheet = wb.getSheetAt(0);

        int rows = sheet.getLastRowNum();

        for (int i = 0; i <= rows; i++) {

            Row row = sheet.getRow(i);
            row.createCell(2).setCellValue(status); 
        }

        FileOutputStream fo = new FileOutputStream("./data/data2.xlsx");
        wb.write(fo);

    }
}
