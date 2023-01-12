package com.example.demo3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

// page_url = about:blank
public class EloginPage {



    public static void elogin(ChromeDriver driver)

    {
        //**************Main Page*****************
        WebElement email = driver.findElement(By.name("emailid"));
        email.click();
        email.sendKeys("kristine.ladioray@bmm.com");


        //WebElement blogin = driver.findElement(By.name("btnLogin"));
        WebElement blogin = driver.findElement(By.cssSelector("input[value='Submit']"));
        blogin.click();
    }

}