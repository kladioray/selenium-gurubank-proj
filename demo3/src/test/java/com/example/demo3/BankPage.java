package com.example.demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankPage {

    public static void bankproj(ChromeDriver driver) {
        //**************Bank Project*****************
// http://demo.guru99.com/V1/index.php
        driver.findElement(By.linkText("Bank Project")).click();

        WebElement user = driver.findElement(By.name("uid"));
        user.click();
        user.sendKeys("mngr469167");

        WebElement pass = driver.findElement(By.name("password"));
        pass.click();
        pass.sendKeys("ydAvEnY");

        //WebElement login = driver.findElement(By.name("btnLogin"));
        WebElement bLOGIN = driver.findElement(By.cssSelector("input[value='LOGIN']"));
        bLOGIN.click();

    }

}
