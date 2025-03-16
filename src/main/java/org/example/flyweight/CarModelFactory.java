package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory
public class CarModelFactory {
    private static final Map<String, CarModel> cache = new HashMap<>();

    public static CarModel getCarModel(String brand, String model, int enginePower) {
        String key = brand + model + enginePower;
        CarModel carModel = cache.get(key);

        if (carModel == null) {
            carModel = new CarModel(brand, model, enginePower);
            cache.put(key, carModel);
            System.out.println("Создана новая модель: " + brand + " " + model);
        }
        return carModel;
    }

    public static int getCacheSize() {
        return cache.size();
    }
}
