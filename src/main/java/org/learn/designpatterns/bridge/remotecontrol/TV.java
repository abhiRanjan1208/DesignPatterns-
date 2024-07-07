package org.learn.designpatterns.bridge.remotecontrol;

public class TV implements Device{


    @Override
    public void turnOff() {
        System.out.println("Turning off the TV");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the TV");
    }

    @Override
    public void changeVolume(Double volume) {
        System.out.println("Setting volume of TV to - " + volume);
    }
}
