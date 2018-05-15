package org.lwstudio.designpatternjava.behavioral_iterator;

import java.util.Iterator;

public class UserRepository implements Iterable<String> {
    private String[] users;
    private int index;

    public UserRepository() {
        this.users = new String[10];
        index = 0;
    }

    public void addUser(String user) {
        if(index == users.length) {
            String[] largerUsers = new String[users.length + 10];
            System.arraycopy(users, 0, largerUsers, 0, users.length);
            users = largerUsers;
            largerUsers = null;
        }

        users[index] = user;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < users.length && users[currentIndex] != null;
            }

            @Override
            public String next() {
                String currentUser = users[currentIndex];
                currentIndex++;
                return currentUser;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        return iterator;
    }
}
