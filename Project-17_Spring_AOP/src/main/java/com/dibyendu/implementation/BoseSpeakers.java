package com.dibyendu.implementation;

import com.dibyendu.interfaces.Speakers;
import com.dibyendu.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound(Song song) {
        return "Playing music with Bose Speakers";
    }
}
