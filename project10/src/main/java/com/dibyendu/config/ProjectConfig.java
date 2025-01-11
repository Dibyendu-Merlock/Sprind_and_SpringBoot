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
@ComponentScan(basePackages = "com.dibyendu.beans")
public class ProjectConfig {



}
