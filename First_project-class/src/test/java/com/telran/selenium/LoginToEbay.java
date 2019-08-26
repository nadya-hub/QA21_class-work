package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {
    @Test
    public void clickLogin(){
        //open site
        openSite("https://www.ebay.com");
        //unit login
        unitLogin();
        //fill login form
        fillLoginForm("asdrftgg@kpl.com", "2345677ji");

        clickLoginButton();


    }

}
