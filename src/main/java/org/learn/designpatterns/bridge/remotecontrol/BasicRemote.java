package org.learn.designpatterns.bridge.remotecontrol;

public class BasicRemote extends RemoteControl{


    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void changeVolume(Double volume) {
        device.changeVolume(volume);
    }
}
