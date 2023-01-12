package com.example.demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class googleweb1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kristine.ladioray/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/");

        EloginPage e = new EloginPage();
        e.elogin(driver);

        BankPage b = new BankPage();
        b.bankproj(driver);

        NewCustomerPage c = new NewCustomerPage();
        c.newcustomer(driver);

//String alertText = alert.getText();
//        assertEquals("The form was successfully submitted!", alertText);
        driver.quit();

    }



}