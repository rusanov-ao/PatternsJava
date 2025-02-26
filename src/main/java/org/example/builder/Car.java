package org.example.builder;

public class Car {
    // Обязательные параметры
    private final String model;
    private final String color;

    // Необязательные параметры
    private int doors = 4;
    private boolean hasNavigator = false;
    private String carInterior = "leather";

    // Создаем приватный конструктор
    private Car(Builder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.doors = builder.doors;
        this.hasNavigator = builder.hasNavigator;
        this.carInterior = builder.carInterior;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", hasNavigator=" + hasNavigator +
                ", carInterior='" + carInterior + '\'' +
                '}';
    }

    public boolean isHasNavigator() {
        return hasNavigator;
    }

    public String getCarInterior() {
        return carInterior;
    }

    // Создаем статический класс внутри класса. Этот класс и будет вызывать конструктор основного класса
    public static class Builder {
        // Обязательные параметры
        private final String model;
        private final String color;

        // Необязательные параметры
        private int doors = 4;
        private boolean hasNavigator = false;
        private String carInterior = "leather";

        public Builder(String model, String color) {
            this.model = model;
            this.color = color;
        }

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder setHasNavigator(boolean hasNavigator) {
            this.hasNavigator = hasNavigator;
            return this;
        }

        public Builder setCarInterior(String carInterior) {
            this.carInterior = carInterior;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}