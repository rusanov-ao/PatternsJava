package org.example.behavioral.template_method;

// Используем шаблонный интерфейс
public class SportCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("Start sport engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop sport engine");
    }
}
