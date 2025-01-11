package com.dibyendu.main;

import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class project3
{
    public static void main(String[] args) {
        // Track all the bean context
        // first initialize the IOC container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Vehicle veh1 = context.getBean("AudiVehicle", Vehicle.class);
        System.out.println("Vehicle1 : " + veh1.getName());
        Vehicle veh2 = context.getBean("HondaVehicle", Vehicle.class);
        System.out.println("Vehicle1 : " + veh2.getName());
        Vehicle veh3 = context.getBean("FerrariVehicle", Vehicle.class);
        System.out.println("Vehicle1 : " + veh3.getName());




    }


}
