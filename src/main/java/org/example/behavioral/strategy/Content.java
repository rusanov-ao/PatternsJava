package org.example.behavioral.strategy;

public class Content {

    private Strategy strategy;

    public Content(Strategy strategy) {
        this.strategy = strategy;
    }

    // Метод будет выполняться в зависимости от выбранного объекта
    public void download(String file) {
        strategy.download(file);
    }
}
