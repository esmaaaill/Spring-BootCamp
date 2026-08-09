package com.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape circle = container.getBean("myCircle", Shape.class);
        circle.draw();

        Shape square = container.getBean("mySquare", Shape.class);
        square.draw();

        Vehicle car = container.getBean("tempCar", Vehicle.class);
        car.save();

        Vehicle plane = container.getBean("tempPlane", Vehicle.class);
        plane.save();
    }
}
