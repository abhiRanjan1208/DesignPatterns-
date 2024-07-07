package org.learn.designpatterns.bridge.remotecontrol;

public class AdvanceRemote extends RemoteControl{

    public AdvanceRemote(Device device) {
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

    public void mute(){
        System.out.println("Muting the device.");
        device.changeVolume(0.0);
    }
}
