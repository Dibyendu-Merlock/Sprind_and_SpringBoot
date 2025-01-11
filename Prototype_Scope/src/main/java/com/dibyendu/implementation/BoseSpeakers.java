package com.dibyendu.implementation;

import com.dibyendu.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound() {
        return "Playing music with Bose Speakers";
    }
}
