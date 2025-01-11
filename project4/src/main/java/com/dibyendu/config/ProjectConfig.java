package com.dibyendu.config;

import com.dibyendu.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

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
    @Primary
    @Bean(name = "FerrariVehicle")
    Vehicle vehicle3()
    {
        var veh = new Vehicle();
        veh.setName("Ferrari");

        return veh;
    }
}
