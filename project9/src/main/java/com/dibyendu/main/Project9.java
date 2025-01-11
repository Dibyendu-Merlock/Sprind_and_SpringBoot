package com.dibyendu.main;

import com.dibyendu.beans.Person;
import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;


public class Project9 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Person name from Spring Context is:"+ person.getName());
        System.out.println("Vehicle name from Spring Context is:"+ vehicle.getName());
        System.out.println("vehicle that the person own is: "+person.getVehicle());
    }
}
