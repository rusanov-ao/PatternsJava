package org.example.generative.factory;

public class LinuxOS implements OS {
    @Override
    public void getOS() {
        System.out.println("Запуск на Linux");
    }
}