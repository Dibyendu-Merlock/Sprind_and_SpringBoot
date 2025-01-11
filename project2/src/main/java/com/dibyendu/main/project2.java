package com.dibyendu.main;

import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class project2
{
    public static void main(String[] args) {
        // Track all the bean context
        // first initialize the IOC container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        ///  this will give "NoUniqueBeanDefinitionException"
        /*Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from SPRING context: " + veh.getName());*/

        // Solution
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle 1 is : " + veh.getName());




    }


}
