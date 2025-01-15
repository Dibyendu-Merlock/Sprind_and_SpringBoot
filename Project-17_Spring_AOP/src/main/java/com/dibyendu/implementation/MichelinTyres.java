package com.dibyendu.implementation;

import com.dibyendu.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    public String rotate() {
        return "Vehicle moving with Michelin Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle Stopped with Michelin Tyres";
    }
}
