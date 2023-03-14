import org.testng.annotations.*;

public class TC2 {

    @BeforeSuite
    void testSuiteTC2(){
        System.out.println("BEFORE SUITE TC2");
    }

    @AfterSuite
    void testSuiteTC2After(){
        System.out.println("AFTER SUITE TC2");
    }
    @BeforeTest
    void beforeTest1(){
        System.out.println("before test TC2 annotation");
    }

    @AfterTest
    void afterTest1(){
        System.out.println("after Test TC2 annoation");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("after class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this is before method");
    }


    @AfterMethod
    void afterMethod(){
        System.out.println("this is after method");
    }
    @Test
    void test4(){
        System.out.println("This is test4...");
    }


    @Test
    void test5(){
        System.out.println("This is test5...");
    }


    @Test
    void test6(){
        System.out.println("This is test6...");
    }

}
