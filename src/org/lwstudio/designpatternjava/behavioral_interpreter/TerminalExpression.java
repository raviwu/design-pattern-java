package org.lwstudio.designpatternjava.behavioral_interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string);

        while (stringTokenizer.hasMoreTokens()) {
            String test = stringTokenizer.nextToken();

            if (test.equals(data)) {
                return true;
            }
        }

        return false;
    }

}
