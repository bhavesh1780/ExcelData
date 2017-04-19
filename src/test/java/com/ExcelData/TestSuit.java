package com.ExcelData;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Dell on 16/04/2017.
 */
public class TestSuit extends Utils {

    @Test
    public void testTest() throws IOException {
        //Create an object of ReadGuru99ExcelFile class
        ExcelRead objExcelFile = new ExcelRead();
        //Prepare the path of excel file
        //String filePath = "C:\\Users\\Dell\\Desktop";
       // String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO"
         String filePath = System.getProperty("user.dir")+"\\src";
        //Call read file method of the class to read data
        objExcelFile.readExcel(filePath,"Book1.xlsx","Sheet1");

//        typeText(By.xpath("//input[@id=\"FirstName\"]"), "Test");
//        // Sending "Demo" in Lastname
//        typeText(By.xpath("//input[@id=\"LastName\"]"),"Test");
//        // Selecting Date of Birth
//        selectValue(By.name("DateOfBirthDay"),"10");
//        selectIndex(By.name("DateOfBirthMonth"), 1);
//        selectText(By.name("DateOfBirthYear"),"1978");
//        // Creating timestamp for everytime new UNIQUE email address
//        // Concatinating the timestamp with email address
//        String email = "xyz"+dateStamp()+"@gmail.com";
//        // Sending email into Email address box
//        typeText(By.xpath("//input[@id=\"Email\"]"), email);
//        System.out.println(email);
//        // Typing company name
//        typeText(By.xpath("//input[@id=\"Company\"]"),"Test");
//        // Click on the chekbox for 'Newsletter'
//        selectCheckbox(By.id("Newsletter"));
//        // Typing the password
//        typeText(By.xpath("//input[@id=\"Password\"]"),"Patel1");
//        // Confirming password
//        typeText(By.xpath("//input[@id=\"ConfirmPassword\"]"),"Patel1");
//        // CLick on Register button
//        clickOnElement(By.xpath("//input[@id=\"register-button\"]"));
    }

}

