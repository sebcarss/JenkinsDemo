package hello;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IgniteAdmin on 3/2/2018.
 */
public class HelloControllerTest {

    private HelloController helloController = new HelloController();

    public HelloControllerTest() {

    }

    @Test
    public void index() throws Exception {
        Assert.assertEquals("Greetings from Spring Boot!", helloController.index());
    }
}