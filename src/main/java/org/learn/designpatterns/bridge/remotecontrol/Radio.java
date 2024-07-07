package org.learn.designpatterns.bridge.remotecontrol;

public class Radio implements Device{

    @Override
    public void turnOff() {
        System.out.println("Turning off radio.");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on radio");
    }

    @Override
    public void changeVolume(Double volume) {
        System.out.println("Setting volume of radio to - " + volume);
    }
}
