package org.example.factory;

public class MacOS implements OS {
    @Override
    public void getOS() {
        System.out.println("Запуск на Mac");
    }
}