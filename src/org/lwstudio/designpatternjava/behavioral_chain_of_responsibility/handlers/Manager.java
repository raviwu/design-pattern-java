package org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.handlers;

import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.Request;
import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.RequestType;

public class Manager extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.TRAINING) {
            System.out.println("Manager can approve all TRAINING request.");
        } else {
            successor.handleRequest(request);
        }
    }

}
