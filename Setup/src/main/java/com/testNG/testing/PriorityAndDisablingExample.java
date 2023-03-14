package com.testNG.testing;

import org.testng.annotations.Test;

public class PriorityAndDisablingExample {

    @Test
    void TestOne(){
        System.out.println("Test One");
    }

    @Test
    void TestTwo(){
        System.out.println("TestTwo");
    }

    @Test
    void TestThree(){
        System.out.println("TestThree");
    }

    @Test(priority = 1,enabled = false)
    void TestFour(){
        System.out.println("TestFour");
    }
}
