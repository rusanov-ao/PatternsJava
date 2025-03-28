package org.example.behavioral.visitor;

public interface Car {

    // Метод для доступа Посетителя
    void accept(Visitor visitor);
}
