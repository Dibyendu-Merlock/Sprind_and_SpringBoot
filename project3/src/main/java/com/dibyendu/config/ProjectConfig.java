package com.dibyendu.config;

import com.dibyendu.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// Spring @Configuration annotation is part of the Spring core framework.
/// Spring Configuration annotation indicates that the class has @Bean definition
/// methods. So Spring container can process the class and generate Spring Beans
/// to be used in the application.
@Configuration
public class ProjectConfig {
    /// @Bean annotation, which lets Spring know that it needs to call
    ///     this method when it initializes its context and adds the returned
    ///     value to the context.
    @Bean(name = "AudiVehicle")
    Vehicle vehicle1()
    {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean(name = "HondaVehicle")
    Vehicle vehicle2()
    {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    @Bean(name = "FerrariVehicle")
    Vehicle vehicle3()
    {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

}
