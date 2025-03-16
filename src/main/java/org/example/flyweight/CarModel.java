package org.example.flyweight;

import java.util.Objects;

// Flyweight (Легковес)
// Поля класса не могут изменяться
public class CarModel {

    private final String brand;
    private final String model;
    private final int enginePower;

    public CarModel(String brand, String model, int enginePower) {
        this.brand = brand;
        this.model = model;
        this.enginePower = enginePower;
    }

    public void displayInfo() {
        System.out.println("Модель: " + brand + " " + model + ", Мощность: " + enginePower + " л.с.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CarModel carModel = (CarModel) obj;
        return enginePower == carModel.enginePower &&
                brand.equals(carModel.brand) &&
                model.equals(carModel.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, enginePower);
    }
}
