package com.ExcelData;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple BasePage.
 */
public class BaseTest extends BasePage
{
    @BeforeMethod
    public void openBrowser(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
