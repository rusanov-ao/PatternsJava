package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {

        Car sportCar = new RedCarDecorator(new SportCar());

        sportCar.draw();

    }
}
