package org.example.behavioral.template_method;

public class Main {
    public static void main(String[] args) {

        Car sportCar = new SportCar();
        Car unknownCar = new UnknownCar();

        sportCar.startEngine();

        unknownCar.stopEngine();
    }
}
