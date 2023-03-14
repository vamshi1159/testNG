package com.testNG.testing.parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParallelTest1 {
    WebDriver webDriver;
    @BeforeMethod
    void setUp(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        webDriver = new ChromeDriver();
        System.out.println("setup");
        webDriver.get("https://google.com");
    }

    @Test
    void logoTest() throws InterruptedException {
        WebElement logo = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }

    @Test
    void titleTest() throws InterruptedException {
       // webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = webDriver.getTitle();
        Assert.assertEquals("Google",title);
        Thread.sleep(5000);
    }
    @AfterClass
    void tearDown(){
        webDriver.quit();
    }
}
