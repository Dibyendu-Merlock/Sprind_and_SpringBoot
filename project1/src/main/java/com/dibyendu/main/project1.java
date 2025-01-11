package com.dibyendu.main;

import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class project1
{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from NON-SPRING context: " + vehicle.getName());

        /// The var keyword was introduced in Java 10. Type inference is used in
        /// var keyword in which it detects automatically the datatype of a variable
        /// based on the surrounding context.

        // Track all the bean context
        // first initialize the IOC container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from SPRING context: " + veh.getName());

        ///         We don’t need to do any explicit casting while fetching a bean from context.
        ///         Spring is smart enough to look for a bean of the type you requested in its context.
        ///         If such a bean doesn’t exist,Spring will throw an exception.

        String hello = context.getBean(String.class);
        System.out.println("String value from SPRING context: "+hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from SPRING context: "+num);


    }


}
