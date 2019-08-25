package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {
    @Test
    public void clickLogin(){
        driver.get("https://www.ebay.com");
        clic(By.id("gh-ug"));

        clic(By.id("userid"));
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("asdrftgg@kpl.com");

        clic(By.id("pass"));
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("2345677ji");
        clic(By.id("sgnBt"));


    }

    public void clic(By locator) {
        driver.findElement(locator).click();
    }
}
