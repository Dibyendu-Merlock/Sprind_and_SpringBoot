package com.dibyendu.main;

import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Project7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagon = new Vehicle();
        volkswagon.setName("Volkswagon");

        Supplier<Vehicle> volkswagonSupplier = () -> volkswagon;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber: " + randomNumber);

        if (randomNumber % 2 == 0) {
            context.registerBean("volkswagon", Vehicle.class, volkswagonSupplier);
        } else {
            context.registerBean("Audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try{
            volksVehicle = context.getBean("volkswagon", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException)
        {
            System.out.println("Error while creating Volkswagon Bean");
        }
        try{
            audiVehicle = context.getBean("Audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException)
        {
            System.out.println("Error while creating Audi Bean");
        }

        if(null!=volksVehicle)
        {
            System.out.println("programming Vehicle name from Spring Context is: "+volksVehicle.getName());
        }else {
            System.out.println("programming Vehicle name from Spring Context is: "+audiVehicle.getName());
        }

    }
}
