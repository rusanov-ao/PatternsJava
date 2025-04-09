package org.example.mutlithreaded_programming.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // Захватывает блокировку
        try {
            count++;
        } finally {
            lock.unlock(); // Снимает блокировку
        }
    }

    public int getCount() {
        return count;
    }
}
