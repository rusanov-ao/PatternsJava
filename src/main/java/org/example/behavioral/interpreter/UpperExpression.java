package org.example.behavioral.interpreter;

public class UpperExpression implements Expression {
    private String s;

    public UpperExpression(String s) {
        this.s = s;
    }

    @Override
    public String interpret(Context context) {
        return context.getUpperCase(s);
    }
}
