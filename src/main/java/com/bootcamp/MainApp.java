package com.bootcamp;

import com.bootcamp.shape.Shape;
import com.bootcamp.vehicle.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape cir = (Shape) context.getBean("myCircle");
        cir.draw();

        Shape sq = (Shape) context.getBean("mySquare");
        sq.draw();

        Vehicle carObj = (Vehicle) context.getBean("tempCar");
        carObj.save();

        Vehicle planeObj = (Vehicle) context.getBean("tempPlane");
        planeObj.save();
    }
}
