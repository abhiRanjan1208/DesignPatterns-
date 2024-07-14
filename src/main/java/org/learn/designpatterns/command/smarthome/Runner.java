package org.learn.designpatterns.command.smarthome;

/**
 Imagine you are tasked with designing a remote control system for
 various electronic devices in a smart home. The devices include a
 TV, a stereo, and potentially other appliances. The goal is to
 create a flexible remote control that can handle different types
 of commands for each device, such as turning devices on/off,
 adjusting settings, or changing channels.
 */


public class Runner {

    public static void main(String[] args){


        TV tv = new TV();
        Stereo stereo = new Stereo();

        TurnOnCommand tvTurnOnCommand = new TurnOnCommand(tv);
        TurnOffCommand tvTurnOffCommand = new TurnOffCommand(tv);
        TurnOnCommand stereoTurnOnCommand = new TurnOnCommand(stereo);
        TurnOffCommand stereoTurnOffCommand = new TurnOffCommand(stereo);
        AdjustVolumeCommand adjustVolumeCommand = new AdjustVolumeCommand(stereo);
        ChangeChannelCommand changeChannelCommand = new ChangeChannelCommand(tv);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(tvTurnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(changeChannelCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(tvTurnOffCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(stereoTurnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolumeCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(stereoTurnOffCommand);
        remoteControl.pressButton();

    }
}
