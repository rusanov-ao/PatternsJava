package org.example.mutlithreaded_programming.lock;

public class Worker implements Runnable {
    private Counter counter;

    public Worker(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Проходимся циклом, увеличивая count
        }
    }
}
