import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Satheesh Reddy on 7/16/2017.
 */
public class HelloWorldTest {
    @Test
    public void getTest() throws Exception {
        HelloWorld hw = new HelloWorld("Unit Testing", 10);
        assertEquals("Unit Testing",hw.getTest());
    }

    @Test
    public void getNum() throws Exception {
    HelloWorld hw  = new HelloWorld("Unit Testing",10);
    assertEquals(10, hw.getNum());
    }
}