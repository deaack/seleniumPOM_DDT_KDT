package com.codecool.seleniumeasytests.bencedeak.excelreader;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    File source = new File("testData/TestDataSheet.xlsx");
    FileInputStream fileInputStream;
    XSSFWorkbook workbook;

    public void initFileInputStream() throws Exception {
        fileInputStream = new FileInputStream(source);
    }

    public void initWorkbook() throws Exception{
        workbook = new XSSFWorkbook(fileInputStream);
    }

    public String readMessageForSingleInputField(){
        XSSFSheet sheet = workbook.getSheetAt(0);
        String message = sheet.getRow(1).getCell(1).getStringCellValue();
        return message;
    }

    public double[] readValuesForTwoInputFields() {
        double[] values = new double[2];
        XSSFSheet sheet = workbook.getSheetAt(0);
        double value1 = sheet.getRow(2).getCell(1).getNumericCellValue();
        double value2 = sheet.getRow(3).getCell(1).getNumericCellValue();
        values[0] = value1;
        values[1] = value2;
        return values;
    }
}
