package org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.handlers;

import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.Request;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() < 1500) {
            System.out.println("Director can approve all Request under $1,500.");
        } else {
            successor.handleRequest(request);
        }
    }

}