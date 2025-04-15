package org.example.mutlithreaded_programming.scheduler;

public class PrintTask implements Task {
    private String message;

    public PrintTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + message + " at " + System.currentTimeMillis());
    }
}
