package org.example.factory;

public class LinuxOS implements OS {
    @Override
    public void getOS() {
        System.out.println("Запуск на Linux");
    }
}