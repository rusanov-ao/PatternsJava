package org.example.facade;

public class Key implements Car {

    @Override
    public void start() {
        System.out.println("Вставить ключ");
    }

    @Override
    public void stop() {
        System.out.println("Вынуть ключ");
    }
}
