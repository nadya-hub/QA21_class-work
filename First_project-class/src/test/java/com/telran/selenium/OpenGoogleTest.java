package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.*;

public class OpenGoogleTest {
    WebDriver driver;
    @BeforeMethod

    public void setUp() {
        driver= new ChromeDriver();
        driver.get("https://www.google.com");
    }
    @Test
    public void searchJavaTest() throws InterruptedException {
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Java"+ Keys.ENTER);
        Thread.sleep(6000);
    }
    @Test
    public void clickImFillingLuky() throws InterruptedException {
        driver.findElement(By.id("fsettl")).click();
        Thread.sleep(6000);
    }
@AfterMethod
    public void tearDown(){
    driver.quit();
}
}
