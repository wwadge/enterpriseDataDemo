package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Application {

    public static void main(String[] args) {

        new ClassPathXmlApplicationContext("custom.xml");
    }
}
