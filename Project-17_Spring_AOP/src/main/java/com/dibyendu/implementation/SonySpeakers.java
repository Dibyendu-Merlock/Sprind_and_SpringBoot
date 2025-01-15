package com.dibyendu.implementation;

import com.dibyendu.interfaces.Speakers;
import com.dibyendu.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    public String makeSound(Song song) {
        return "Playing the song"+ song.getTitle()+" by"
                + song.getSinger() +" from sony speakers";
    }


}
