package com.dibyendu.beans;

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

    public void printHello()
    {
        System.out.println("Printing from Component Vehicale Bean");
    }


}
