package org.lwstudio.designpatternjava.behavioral_command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitechenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);

        System.out.println("== Toggle single light ==");
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitechenLight);

        System.out.println("== Toggle all light off ==");

        Command allLightOffCommand = new AllLightOffCommand(lights);
        lightSwitch.storeAndExecute(allLightOffCommand);

        System.out.println("== Toggle all light on ==");

        Command allLightOnCommand = new AllLightOnCommand(lights);
        lightSwitch.storeAndExecute(allLightOnCommand);
    }

}
