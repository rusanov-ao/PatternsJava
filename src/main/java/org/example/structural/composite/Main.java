package org.example.structural.composite;

public class Main {

    public static void main(String[] args) {

        Car sportCar = new SportCar();
        Car unknownCar = new UnknownCar();
        Draw draw = new Draw();

        draw.add(sportCar);
        draw.add(unknownCar);
        draw.draw("green");

        draw.clear();

        draw.add(sportCar);
        draw.add(unknownCar);
        draw.draw("red");
    }
}
