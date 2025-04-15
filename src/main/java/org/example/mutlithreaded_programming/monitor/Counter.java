package org.example.mutlithreaded_programming.monitor;

public class Counter {
    private int count;

    // Синхронизированный метод для увеличения счетчика
    public synchronized void increment() {
        count++;
    }

    // Синхронизированный метод для получения значения счетчика
    public synchronized int getCount() {
        return count;
    }
}
