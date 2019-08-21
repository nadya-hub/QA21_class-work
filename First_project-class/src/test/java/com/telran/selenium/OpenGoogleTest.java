package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.*;

public class OpenGoogleTest {
    WebDriver driver;
    @Test
    public void setUp() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(name("q")).sendKeys("Java");
        //==driver.navigate().to("https://www.google.com");
        //driver.findElement(new ByCssSelector("input class=\"gNO89b\" ")).click();

       // WebElement element = driver.findElement(By.tagName("btnK"));
        Thread.sleep(6000);
        driver.quit();


    }
}
