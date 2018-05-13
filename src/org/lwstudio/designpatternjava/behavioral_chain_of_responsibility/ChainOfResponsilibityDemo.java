package org.lwstudio.designpatternjava.behavioral_chain_of_responsibility;

import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.RequestType;
import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.Request;

import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.handlers.Ceo;
import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.handlers.Director;
import org.lwstudio.designpatternjava.behavioral_chain_of_responsibility.handlers.Manager;

public class ChainOfResponsilibityDemo {

    public static void main(String[] args) {

        Ceo vincent = new Ceo();
        Director grace = new Director();
        Manager elaine = new Manager();

        elaine.setSuccessor(grace);
        grace.setSuccessor(vincent);

        Request request = new Request(RequestType.TRAINING, 500);
        elaine.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        elaine.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        elaine.handleRequest(request);

    }

}
