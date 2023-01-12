package com.example.demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NewCustomerPage {

    public static void newcustomer(ChromeDriver driver) {


//**************New Customer*****************
        driver.findElement(By.linkText("New Customer")).click();
        WebElement cbday = driver.findElement(By.name("dob"));
        cbday.sendKeys("08/23/1985");
        //cbday.sendKeys(Keys.RETURN);

        WebElement cname = driver.findElement(By.name("name"));
        cname.click();
        cname.sendKeys("Kristine");

        WebElement cadd = driver.findElement(By.name("addr"));
        cadd.click();
        cadd.sendKeys("274 Dominion");

        WebElement ccity = driver.findElement(By.name("city"));
        ccity.click();
        ccity.sendKeys("Moncton");

        WebElement cstate = driver.findElement(By.name("state"));
        cstate.click();
        cstate.sendKeys("NB");

        WebElement cpin = driver.findElement(By.name("pinno"));
        cpin.click();
        cpin.sendKeys("123456");

        WebElement ctel = driver.findElement(By.name("telephoneno"));
        ctel.click();
        ctel.sendKeys("7812015");

        WebElement cemail = driver.findElement(By.name("emailid"));
        cemail.click();
        cemail.sendKeys("email@mcdo.com");

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement csub = driver.findElement(By.name("sub"));
        csub.click();
    }



}
