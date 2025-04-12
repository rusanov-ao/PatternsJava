package org.example.mutlithreaded_programming.double_checked_locking;

public class Main {
    public static void main(String[] args) {


        // Создаем несколько потоков, которые будут получать экземпляр Singleton
        Runnable task = () -> {
            Singleton singleton = Singleton.getSingleton();
            System.out.println("Instance hash code: " + singleton.hashCode());
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();



    }
}
