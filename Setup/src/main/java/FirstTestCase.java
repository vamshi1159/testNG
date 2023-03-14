
import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("This is Setup");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("logged into browser");
    }

    @Test(priority = 3)
    void tearDown(){
        System.out.println("closed");
    }
}
