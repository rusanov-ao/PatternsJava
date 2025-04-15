package org.example.mutlithreaded_programming.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
    private final ScheduledExecutorService scheduledExecutorService;

    public Scheduler(int poolsize) {
        this.scheduledExecutorService = Executors.newScheduledThreadPool(poolsize);
    }

    // Метод для планирования задачи с фиксированным интервалом
    public void scheduleAtFixedRate(Task task, long initialDelay, long period, TimeUnit unit) {
        scheduledExecutorService.scheduleAtFixedRate(task::execute, initialDelay, period, unit);
    }

    // Метод для остановки планировщика
    public void shutdown() {
        scheduledExecutorService.shutdown();
    }
}
