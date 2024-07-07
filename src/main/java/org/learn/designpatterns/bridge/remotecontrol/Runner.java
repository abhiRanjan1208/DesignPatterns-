package org.learn.designpatterns.bridge.remotecontrol;

/**

 Imagine you are developing a remote control system for various electronic
 devices like TVs, Radios, and DVD Players, and each device can have different
 types of remote controls such as Basic Remote and Advanced Remote.
 */

public class Runner {

    public static void main(String[] args){
        /*
         - create an advance remote for TV
         - switch on the TV
         - set volume to 100 and then mute
         - witch off the TV
        */
        AdvanceRemote advanceRemote = new AdvanceRemote(new TV());
        advanceRemote.turnOn();
        advanceRemote.changeVolume(100.0);
        advanceRemote.mute();
        advanceRemote.turnOff();
    }
}
