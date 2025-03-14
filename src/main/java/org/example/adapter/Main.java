package org.example.adapter;

public class Main {

    public static void main(String[] args) {

        // Создаем объект Адаптер
        Flash flash = new Adapter(new USB());

        // Вызываем метод read, который внутри вызовет метод connect
        flash.read();

    }
}