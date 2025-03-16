package org.example.structural.bridge;

public class Main {
    public static void main(String[] args) {

        Car sportCar = new SportCar(new SportEngine());

        Car unknownCar = new UnknownCar(new UnknownEngine());

        sportCar.setEngine();
    }
}
