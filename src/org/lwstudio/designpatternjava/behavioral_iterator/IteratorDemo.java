package org.lwstudio.designpatternjava.behavioral_iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        repo.addUser("Vincent");
        repo.addUser("Ravi");
        repo.addUser("Howard");

        for (String user : repo) {
            System.out.println(user);
        }
    }
}
