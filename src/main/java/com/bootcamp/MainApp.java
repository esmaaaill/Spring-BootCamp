package com.bootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape xmlCircle = container.getBean("myCircle", Shape.class);
        xmlCircle.draw();

        Shape xmlSquare = container.getBean("mySquare", Shape.class);
        xmlSquare.draw();

        Vehicle car = container.getBean("tempCar", Vehicle.class);
        car.save();

        Vehicle plane = container.getBean("tempPlane", Vehicle.class);
        plane.save();

        Shape annotatedCircle = container.getBean("circle", Shape.class);
        System.out.println("the area of the circle = " + annotatedCircle.getArea(3));

        Shape annotatedSquare = container.getBean("square", Shape.class);
        System.out.println("the area of the Square = " + annotatedSquare.getArea(3));

        ((ClassPathXmlApplicationContext) container).close();
    }
}
