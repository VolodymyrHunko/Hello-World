package examples;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readEXCELfile {
    public static void main (String [] args) throws IOException {
        String path = "src\\sourses\\SimpleEXCEL.xlsx";
        File excelFile = new File(path);
        if (excelFile.exists()) {
            System.out.println("File exists.");
        }else {
            System.out.println("File not exists.");
        }
        FileInputStream fis = new FileInputStream(excelFile);
        System.out.println("Open workbook");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        System.out.println("read the sheet from workbook");
        XSSFSheet sheet = workbook.getSheetAt(0);
        //I have added test data in the cell A1 as "First Name"
        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell);
        System.out.println(sheet.getRow(1).getCell(0));

    }
}
