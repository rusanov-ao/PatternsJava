package org.example.behavioral.templateMethod;

// Используем шаблонный интерфейс
public class UnknownCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("Start unknown engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop unknown engine");
    }
}
