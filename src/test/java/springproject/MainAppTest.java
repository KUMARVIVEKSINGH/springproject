package springproject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppTest {

    @Test
    public void testMainApp() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        System.out.println(helloWorld.getMessage());
    }
}
