package springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public HelloWorld createHelloWorld() {
	HelloWorld helloWorld = new HelloWorld();
	helloWorld.setMessage("Bean Created");
	return helloWorld;
    }

}
