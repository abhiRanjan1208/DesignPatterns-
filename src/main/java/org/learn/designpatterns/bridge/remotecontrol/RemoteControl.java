package org.learn.designpatterns.bridge.remotecontrol;

public abstract class RemoteControl {

    Device device;

    public RemoteControl(Device device){
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void changeVolume(Double volume);
}
