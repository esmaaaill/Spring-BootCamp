package com.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape circle = container.getBean("circle", Shape.class);
        circle.draw();

        Shape square = container.getBean("square", Shape.class);
        square.draw();
    }
}
