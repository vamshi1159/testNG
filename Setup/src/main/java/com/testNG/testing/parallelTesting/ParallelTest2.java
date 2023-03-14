package com.testNG.testing.parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver webDriver;
    @BeforeMethod
    void setUp(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        webDriver = new ChromeDriver();
        System.out.println("setup");
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    void loginTest() throws InterruptedException {
       webDriver.findElement(By.name("username")).sendKeys("Admin");
       webDriver.findElement(By.name("password")).sendKeys("admin123");
       webDriver.findElement(By.className("orangehrm-login-button")).click();
       WebElement avatar = webDriver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img"));
        Assert.assertTrue(avatar.isDisplayed());
        Thread.sleep(5000);
    }

    @Test
    void titleTest() throws InterruptedException {
       // webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = webDriver.getTitle();
        Assert.assertEquals("OrangeHRM",title);
        Thread.sleep(5000);
    }
    @AfterClass
    void tearDown(){
        webDriver.quit();
    }
}
