package org.example.factory;

public class WindowsOS implements OS {
    @Override
    public void getOS() {
        System.out.println("Запуск на Windows");
    }
}