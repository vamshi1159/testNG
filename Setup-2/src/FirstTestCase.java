import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    void setup(){
        System.out.println("This is Setup");
    }

    @Test
    void login(){
        System.out.println("logged into browser");
    }

    @Test
    void tearDown(){
        System.out.println("closed");
    }
}
