package org.example.behavioral.observer;

import java.util.List;

// Создаем класс наблюдателя
public class Director implements Observer {

    @Override
    public void event(List<String> list) {
        System.out.println("The list of students has changed: " + list);
    }
}
