package org.example.mutlithreaded_programming.lock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Создаем 2 потока
        Thread thread1 = new Thread(new Worker(counter));
        Thread thread2 = new Thread(new Worker(counter));

        // Запускаем 2 потока
        thread1.start();
        thread2.start();

        // Ждем завершеня потоков
        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());


    }
}
