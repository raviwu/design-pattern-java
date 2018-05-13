package org.lwstudio.designpatternjava.behavioral_command;

public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }

}
