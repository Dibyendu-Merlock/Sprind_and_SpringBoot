package com.dibyendu.main;

import com.dibyendu.beans.Person;
import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import com.dibyendu.services.VehicleServices;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;


public class Singleton_scope_Lazy_Instantiation {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before Retrieving the person Bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After Retrieving the person Bean from the Spring Context");
    }
}
