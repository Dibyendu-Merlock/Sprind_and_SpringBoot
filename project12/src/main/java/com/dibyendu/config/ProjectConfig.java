package com.dibyendu.config;

import com.dibyendu.beans.Person;
import com.dibyendu.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.dibyendu.implementation", "com.dibyendu.services"})
@ComponentScan(basePackageClasses = {com.dibyendu.beans.Vehicle.class, com.dibyendu.beans.Person.class})
public class ProjectConfig {

}
