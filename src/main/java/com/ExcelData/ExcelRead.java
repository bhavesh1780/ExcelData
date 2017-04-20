package com.ExcelData;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Dell on 16/04/2017.
 */
public class ExcelRead extends Utils {

    public void readExcel(String filePath,String fileName,String sheetName) throws IOException {
        //Create an object of File class to open xlsx file
        File file =    new File(filePath+"\\"+fileName);
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        Workbook nopeCommerceWorkbook = null;
        //Find the file extension by splitting file name in substring  and getting only extension name
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        //Check condition if the file is xlsx file
        if(fileExtensionName.equals(".xlsx")){
            //If it is xlsx file then create object of XSSFWorkbook class
            nopeCommerceWorkbook = new XSSFWorkbook(inputStream);
        }
        //Check condition if the file is xls file
        else if(fileExtensionName.equals(".xls")){
            //If it is xls file then create object of XSSFWorkbook class
            nopeCommerceWorkbook = new HSSFWorkbook(inputStream);
        }
        //Read sheet inside the workbook by its name
        Sheet nopeCommerceSheet = nopeCommerceWorkbook.getSheet(sheetName);
        //Find number of rows in excel file
        int rowCount = nopeCommerceSheet.getLastRowNum()-nopeCommerceSheet.getFirstRowNum();
        //Create a loop over all the rows of excel file to read it
        for (int i = 0; i < rowCount+1; i++) {
            Row row = nopeCommerceSheet.getRow(i);
            //Create a loop to print cell values in a row
            for (int j = 0; j < row.getLastCellNum(); j++) {
                //Print Excel data in console
                //System.out.println(row.getCell(j).);

                System.out.print(String.format(row.getCell(j).getStringCellValue()+ "\t || \t "));
//                System.out.print(String.format("%-20s = %s","row.getCell(j).getStringCellValue"));

            }
            System.out.println();
        }
    }
    public static void main(String[] args)throws IOException {
        //Create an object of ReadExcel ExcelFile class
        ExcelRead objExcelFile = new ExcelRead();
        //Prepare the path of excel file
        String filePath = "C:\\Users\\Dell\\Desktop";
        // String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
        //Call read file method of the class to read data
        objExcelFile.readExcel(filePath,"NRI.xlsx","Sheet1");
    }
}
