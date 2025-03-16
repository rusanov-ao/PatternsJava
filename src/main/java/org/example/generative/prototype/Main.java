package org.example.generative.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Car bmw = new Car("BMW", "Black", 2);
        Car audi = bmw.withModel("Audi");

        Car familyAudi = audi.withDoors(4);

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(familyAudi);

    }
}