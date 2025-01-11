package com.dibyendu.config;

import com.dibyendu.beans.Person;
import com.dibyendu.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/// Spring @Configuration annotation is part of the spring core framework.
/// Spring Configuration annotation indicates that the class has @Bean definition
/// methods. So Spring container can process the class and generate Spring Beans
/// to be used in the application.
@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    ///     Here in the below code, we are trying to wire or establish a relationship between Person and
    ///     Vehicle, by invoking the vehicle() bean method from person() bean method.
    ///
    ///     Spring will make sure to have only 1 vehicle bean is created and also vehicle bean will
    ///     be created first always as person bean has dependency on it.

    @Bean
    public Person person() {
        var person = new Person();
        person.setName("Dibyendu");
        person.setVehicle(vehicle());
        return person;
    }

}
