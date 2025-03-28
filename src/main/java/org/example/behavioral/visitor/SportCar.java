package org.example.behavioral.visitor;

public class SportCar implements Car {
    // Создаем массив
    Car[] cars;

    // При создании объекта SportCar будет автоматически создаваться объекты Wheel и Engine
    public SportCar() {
        this.cars = new Car[]{new Wheel(), new Engine()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i < cars.length; i++) {
            // Разрешаем посетителю доступ к объектам в массиве
            cars[i].accept(visitor);
        }
        // Разрешаем посетителю доступ к объекту SportCar
        visitor.visit(this);
    }
}
