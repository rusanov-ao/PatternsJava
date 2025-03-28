package org.example.behavioral.visitor;

public interface Visitor {

    // Методы для посещения объектов
    void visit(SportCar sportCar);

    void visit(Engine engine);

    void visit(Wheel wheel);
}
