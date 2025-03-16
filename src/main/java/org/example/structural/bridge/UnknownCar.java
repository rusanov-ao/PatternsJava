package org.example.structural.bridge;

public class UnknownCar extends Car {

    public UnknownCar(Engine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.print("UnknownCar engine: ");
    }
}
