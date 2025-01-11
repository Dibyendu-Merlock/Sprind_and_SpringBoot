package com.dibyendu.main;

import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project5 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from Soring Context is: " + veh.getName());
        veh.printHello();


    }
}
