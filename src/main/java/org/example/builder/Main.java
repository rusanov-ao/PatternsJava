package org.example.builder;

public class Main {

    public static void main(String[] args) {

        // Создаем объект с помощью строителя
        Car sportCar = new Car.
                Builder("coupe", "red").
                setCarInterior("leather").
                setDoors(2).
                setHasNavigator(false).
                build();

        System.out.println(sportCar);

        Car familyCar = new Car.
                Builder("sedan", "black").
                setCarInterior("textile").
                setDoors(4).
                setHasNavigator(true).
                build();


        System.out.println(familyCar);
    }
}
