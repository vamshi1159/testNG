import org.testng.annotations.*;

public class TC1 {

    @BeforeSuite
    void testSuiteTC1(){
        System.out.println("BEFORE SUITE TC1");
    }
    @AfterSuite
    void testSuiteTC1After(){
        System.out.println("AFTER SUITE TC1");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("before test TC1 annotation");
    }

    @AfterTest
    void afterTest(){
        System.out.println("after Test TC1 annoation");
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
    void test1(){
        System.out.println("This is test1...");
    }


    @Test
    void test2(){
        System.out.println("This is test2...");
    }


    @Test
    void test3(){
        System.out.println("This is test3...");
    }

}
