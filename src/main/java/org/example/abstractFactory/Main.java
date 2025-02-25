package org.example.abstractFactory;


public class Main {

    public static void main(String[] args) {

        String country = "Russia";

        Factory factory = null;

        /**
         * ПОлучаем сразу пачку объектов (BMW, Audi, Zeekr)
         */
        if (country.equals("Russia")) {
            factory = new RUFactory();
        } else if (country.equals("USA")) {
            factory = new USAFactory();
        }


        BMW bmw = factory.getBMW();
        Audi audi = factory.getAudi();

        System.out.println(bmw.getBMWPrice());

    }
}
