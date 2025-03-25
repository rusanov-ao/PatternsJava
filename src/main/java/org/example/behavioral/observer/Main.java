package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        // Наблюдатель
        Director director = new Director();

        // Университет
        University university = new University();

        // Добавляем в университет наблюдателя
        university.addObserver(director);

        university.addStudent("Mike");
        university.addStudent("Klar");

        university.addStudent("Unknown");

        university.removeStudent("Unknown");
    }
}
