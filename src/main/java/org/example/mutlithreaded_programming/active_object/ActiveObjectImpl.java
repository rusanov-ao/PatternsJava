package org.example.mutlithreaded_programming.active_object;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ActiveObjectImpl implements ActiveObject {

    private final BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();

    public ActiveObjectImpl() {
        // Запускаем планировщик в отдельном потоке
        new Thread(this::run).start();

    }

    @Override
    public void printMessage(String message) {
        // Добавляем задачу в очередь
        taskQueue.add(() -> System.out.println("Printing: " + message));
    }

    private void run() {
        while (true) {
            try {
                // Извлекаем задачу из очереди и выполняем её
                Runnable task = taskQueue.take();
                task.run();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }


    }
}
