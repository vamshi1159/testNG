package com.testNG.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void startCar(){
        System.out.println("startCar");
        Assert.fail("Failed");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("driveCar");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("stopCar");
    }

    @Test(dependsOnMethods = {"stopCar","driveCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("parkCar");
    }

}
