package com.dibyendu.main;

import com.dibyendu.beans.Person;
import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import com.dibyendu.services.VehicleServices;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;


public class Singleton_scope {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean(VehicleServices.class);
        System.out.println("Hashcode of 1st object: "+vehicleServices1.hashCode());
        System.out.println("Hashcode of 2nd object: "+vehicleServices2.hashCode());

        if(vehicleServices1==vehicleServices2)
        {
            System.out.println("Vehicleservices bean is a singleton scoped bean");
        }
    }
}
