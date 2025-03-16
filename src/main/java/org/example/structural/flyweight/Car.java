package org.example.structural.flyweight;

// Context (Контекст)
public class Car {

    private final CarModel model;
    private final String color;
    private final int year;

    public Car(CarModel model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void displayFullInfo() {
        model.displayInfo();
        System.out.println("Цвет: " + color + ", Год выпуска: " + year);
    }
}
