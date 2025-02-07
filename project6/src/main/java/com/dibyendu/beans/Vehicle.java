package com.dibyendu.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle
{
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize()
    {
        this.setName("Honda");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroying vehicle Bean");
    }

    public void printHello()
    {
        System.out.println("Printing from Component Vehicale Bean");
    }


}
