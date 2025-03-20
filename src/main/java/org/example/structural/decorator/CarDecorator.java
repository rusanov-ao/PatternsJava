package org.example.structural.decorator;

// Создаем абстрактный класс Decorator, с помощью которого можно будет наследоваться и расширять классы
abstract public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void draw() {
        car.draw();
    }
}
