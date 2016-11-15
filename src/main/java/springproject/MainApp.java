package springproject;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    private static Logger log = Logger.getLogger(MainApp.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        log.debug(helloWorld.getMessage().toString());
    }
}
