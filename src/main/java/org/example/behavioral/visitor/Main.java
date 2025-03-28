package org.example.behavioral.visitor;

public class Main {
    public static void main(String[] args) {

        Car sportCar = new SportCar();
        sportCar.accept(new CarVisitor());
    }
}
