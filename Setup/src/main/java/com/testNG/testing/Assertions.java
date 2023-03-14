package com.testNG.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {

    WebDriver webDriver;
    @BeforeClass
    void setUp(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://kmit.in");
    }

    @Test
    void logoTest(){
      WebElement logo = webDriver.findElement(By.xpath("/html/body/header/div[2]/div[1]/div/div/div[1]/a/img"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    void titleTest(){
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = webDriver.getTitle();
        Assert.assertEquals("OrangeHRM",title);
    }
    @AfterClass
    void tearDown(){
        webDriver.quit();
    }


}
