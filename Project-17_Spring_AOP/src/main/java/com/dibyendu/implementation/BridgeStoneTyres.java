package com.dibyendu.implementation;

import com.dibyendu.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStone Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle Stopped moving with Bridgestone Tyres";
    }
}
