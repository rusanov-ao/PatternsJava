package org.example.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {

        String str = "TesT";

        Context context = new Context();

        Expression lowerExpression = new LowerExpression(str);
        str = lowerExpression.interpret(context);

        System.out.println(str);
    }
}
