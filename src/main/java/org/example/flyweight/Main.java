package org.example.flyweight;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(
                CarModelFactory.getCarModel("Toyota", "Corolla", 120),
                "Красный",
                2020
        );

        Car car2 = new Car(
                CarModelFactory.getCarModel("Toyota", "Corolla", 120),
                "Синий",
                2021
        );
        Car car3 = new Car(
                CarModelFactory.getCarModel("Honda", "Civic", 150),
                "Черный",
                2019
        );


        // Вывод информации
        car1.displayFullInfo();
        car2.displayFullInfo();
        car3.displayFullInfo();

        // Проверка кэша
        System.out.println("Количество моделей в кэше: " + CarModelFactory.getCacheSize());

    }
}
