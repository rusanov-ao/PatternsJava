package org.example.behavioral.command;

public class StopCar implements Command {
    private Car car;

    public StopCar(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopEngine();
    }
}
