package com.dibyendu.implementation;

import com.dibyendu.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    public String makeSound() {
        return "Playing music With Sony Speakers";
    }
}
