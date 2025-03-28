package org.example.behavioral.visitor;

public class Wheel implements Car {
    // Передаем себя в качестве объекта посетителю
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
