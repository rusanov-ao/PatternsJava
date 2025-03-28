package org.example.behavioral.visitor;

public class CarVisitor implements Visitor {

    @Override
    public void visit(SportCar sportCar) {
        System.out.println("Посещаем " + sportCar.getClass().getSimpleName());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Посещаем " + engine.getClass().getSimpleName());
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Посещаем " + wheel.getClass().getSimpleName());
    }
}
