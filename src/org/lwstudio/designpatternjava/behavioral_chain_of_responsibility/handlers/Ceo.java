package org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.handlers;

import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.Request;

public class Ceo extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO handles all Request");
    }

}