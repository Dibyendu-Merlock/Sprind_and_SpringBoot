package com.dibyendu.main;

import com.dibyendu.beans.Person;
import com.dibyendu.beans.Vehicle;
import com.dibyendu.config.ProjectConfig;
import com.dibyendu.model.Song;
import com.dibyendu.services.VehicleServices;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;


public class Spring_AOP {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleServices = context.getBean(VehicleServices.class);

        System.out.println(vehicleServices.getClass());

        Song song = new Song();
        song.setTitle("Slow Dancing In a Burning room");
        song.setSinger("John Mayer");

        boolean vehicleStarted = true;

        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicstatus = vehicleServices.playMusic(vehicleStarted, song);
        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);


    }
}
