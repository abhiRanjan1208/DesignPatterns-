package org.learn.designpatterns.command.smarthome;

public class Stereo implements Device{

    @Override
    public void turnOn() {
        System.out.println("Stereo is now turn On.");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is now turn off.");
    }

    public void adjustVolume(){
        System.out.println("Volume adjusted.");
    }
}
