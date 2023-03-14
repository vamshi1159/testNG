package com.testNG.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 45)
    void testFalse(){
        Assert.assertTrue(true);
    }
}
