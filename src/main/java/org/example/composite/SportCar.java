package org.example.composite;

/**
 * Классы SportCar и UnknownCar являются листьями в древовидной структуре. Они реализуют интерфейс Car
 * и предоставляют конкретную реализацию метода draw.
 */

public class SportCar implements Car {

    @Override
    public void draw(String color) {
        System.out.println("SportCar color: " + color);
    }
}
