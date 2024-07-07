package org.learn.designpatterns.bridge.remotecontrol;

public interface Device {

    void turnOff();
    void turnOn();
    void changeVolume(Double volume);
}
