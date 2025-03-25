package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class University {

    // Список всех наблюдателей
    private List<Observer> observers = new ArrayList<>();

    // Список всех студентов
    private List<String> students = new ArrayList<>();

    public void addStudent(String student) {
        students.add(student);
        notifyObservers();
    }

    public void removeStudent(String student) {
        students.remove(student);
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Настраиваем метод оповещения для любого наблюдателя
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.event(students);
        }
    }
}