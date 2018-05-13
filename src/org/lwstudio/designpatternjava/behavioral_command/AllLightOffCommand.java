package org.lwstudio.designpatternjava.behavioral_command;

import java.util.List;

public class AllLightOffCommand implements Command {
    private List<Light> lights;

    public AllLightOffCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for(Light light : lights) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }
}
