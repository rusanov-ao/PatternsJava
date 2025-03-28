package org.example.behavioral.command;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);

        CarInvoker carInvoker = new CarInvoker(startCar);

        carInvoker.execute();
    }
}
