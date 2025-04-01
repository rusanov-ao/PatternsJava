package org.example.behavioral.interpreter;

public class LowerExpression implements Expression {

    private String s;

    public LowerExpression(String s) {
        this.s = s;
    }

    @Override
    public String interpret(Context context) {
        return context.getLowerCase(s);
    }
}
