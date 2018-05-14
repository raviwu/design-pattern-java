package org.lwstudio.designpatternjava.behavioral_interpreter;

public class InterpreterDemo {

    static Expression buildInterpreterTree() {

        Expression terminal_orange = new TerminalExpression("Orange");
        Expression terminal_grape = new TerminalExpression("Grape");
        Expression terminal_apple = new TerminalExpression("Apple");

        Expression orange_and_apple = new AndExpression(terminal_apple, terminal_orange);
        Expression grape_or_orange = new OrExpression(terminal_grape, terminal_orange);

        return new OrExpression(orange_and_apple, grape_or_orange);
    }

    public static void main(String[] args) {

        // String context = "Apple";
        String context = "Grape";
        // String context = "Orange";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));

    }

}
