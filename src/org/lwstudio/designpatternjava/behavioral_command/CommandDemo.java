package org.lwstudio.designpatternjava.behavioral_command;

public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);

        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
    }

}
