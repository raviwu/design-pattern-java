package org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.handlers;

import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.Request;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    public abstract void handleRequest(Request request);

}
