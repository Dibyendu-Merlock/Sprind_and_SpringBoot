package com.dibyendu.main;

import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project4
{
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean("FerrariVehicle", Vehicle.class);
        System.out.println("Primary Vehicle: " + veh.getName());




    }
}
