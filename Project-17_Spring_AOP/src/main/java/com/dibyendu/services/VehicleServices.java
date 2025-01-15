package com.dibyendu.services;

import com.dibyendu.interfaces.Speakers;
import com.dibyendu.interfaces.Tyres;
import com.dibyendu.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleServices {

    private Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;


    public String playMusic(boolean vehicleStarted, Song song) {
        Instant start = Instant.now();
        logger.info("Method Execution started....");
        String music = null;
        if (vehicleStarted) {
            music = speakers.makeSound(song);
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the" + " operation");
        }
        logger.info("Method Execution end....");

        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);

        return music;
    }

    public String moveVehicle(boolean vehicleStarted)
    {
        Instant start = Instant.now();
        logger.info("Method Execution Started....");

        String status = null;
        if(vehicleStarted)
        {
            status = tyres.rotate();
        }else{
            logger.log(Level.SEVERE, "Vehicle not started to perform the" + " operation");
        }
        logger.info("Method Execution Ended....");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);

        return status;
    }

    public String applyBrake(boolean vehicleStarted)
    {
        Instant start = Instant.now();
        logger.info("Method Execution Started....");

        String status = null;
        if(vehicleStarted)
        {
            status = tyres.stop();
        }else{
            logger.log(Level.SEVERE, "Vehicle not started to perform the" + " operation");
        }
        logger.info("Method Execution Ended....");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : "+timeElapsed);

        return status;
    }



    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
