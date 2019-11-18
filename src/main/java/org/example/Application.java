package org.example;

import org.example.config.HsqlDbConfig;
import org.example.controller.MyController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                HsqlDbConfig.class,
                Application.class,
                MyController.class
        );

        Application app = context.getBean(Application.class);

        MyController myController = context.getBean(MyController.class);
        myController.go();
    }
}