package org.example.behavioral.command;

public class StartCar implements Command {
    private Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }
}
