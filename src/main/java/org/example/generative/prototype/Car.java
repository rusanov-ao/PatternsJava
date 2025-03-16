package org.example.generative.prototype;

// Так как интерфейс Cloneable реализовывает метод clone, то будем его использовать
public class Car implements Cloneable {

    private String model;
    private String color;
    private int doors;

    public Car(String model, String color, int doors) {
        this.model = model;
        this.color = color;
        this.doors = doors;
    }

    public Car withModel(String model) throws CloneNotSupportedException {
        Car copy = (Car) clone();
        copy.model = model;
        return copy;
    }

    public Car withColor(String color) throws CloneNotSupportedException {
        Car copy = (Car) clone();
        copy.color = color;
        return copy;
    }

    public Car withDoors(int doors) throws CloneNotSupportedException {
        Car copy = (Car) clone();
        copy.doors = doors;
        return copy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}