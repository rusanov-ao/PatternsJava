package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Drawing является композитом (или компоновщиком). Он:
 * Хранит список объектов типа Car.
 * Реализует метод draw(String color) так, чтобы он вызывал этот метод для каждого объекта в списке.
 * Предоставляет методы add(Car car) для добавления новых автомобилей и clear() для очистки списка.
 * Таким образом, Drawing может содержать как листья (SportCar, UnknownCar), так и другие композиты
 * (если бы они существовали).
 */

public class Draw implements Car {

    private List<Car> cars = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Car car : cars) {
            car.draw(color);
        }
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public void clear() {
        System.out.println();
        this.cars.clear();
    }
}
