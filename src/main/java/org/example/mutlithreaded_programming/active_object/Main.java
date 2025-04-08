package org.example.mutlithreaded_programming.active_object;

public class Main {
    public static void main(String[] args) {
// Создаем активный объект
        ActiveObject activeObject = new ActiveObjectImpl();

        // Вызываем асинхронные методы
        activeObject.printMessage("Hello");
        activeObject.printMessage("World");

        // Главный поток продолжает выполнение
        System.out.println("Main thread continues...");

        // Даем время для завершения асинхронных задач
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
