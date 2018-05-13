package org.lwstudio.designpatternjava.behavioral_command;

import java.util.List;

public class AllLightOnCommand implements Command {
    private List<Light> lights;

    public AllLightOnCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for(Light light : lights) {
            if(!light.isOn()) {
                light.toggle();
            }
        }
    }
}
