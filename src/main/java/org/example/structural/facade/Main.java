package org.example.structural.facade;

public class Main {

    public static void main(String[] args) {

        Facade car = new Facade();

        car.startCar();
        car.stopCar();
    }
}
