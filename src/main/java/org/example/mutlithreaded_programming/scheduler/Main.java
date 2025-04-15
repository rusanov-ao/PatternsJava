package org.example.mutlithreaded_programming.scheduler;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // Создаем планировщик
        Scheduler scheduler = new Scheduler(1);

        // Создаем задачи
        Task task1 = new PrintTask("Task1");
        Task task2 = new PrintTask("Task2");


        scheduler.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS); // Каждые 2 секунды
        scheduler.scheduleAtFixedRate(task2, 5, 3, TimeUnit.SECONDS); // Каждые 3 секунды, начиная через 5 секунд

        // Останавливаем планировщик через 20 секунд
        new Thread(() -> {
           try {
               Thread.sleep(20000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            System.out.println("Shutting down scheduler...");
           scheduler.shutdown();
        }).start();



    }
}
