package com.testNG.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomDataProviderExample {


    @Test(dataProvider = "LoginDataProvider",dataProviderClass = DataProviderExample.class)
    public void loginTest(String email,String pwd){
        System.out.println("email :"+email+"\n pwd :"+pwd);
    }

}
