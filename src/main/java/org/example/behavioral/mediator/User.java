package org.example.behavioral.mediator;

// Создадим класс пользователей
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Метод будет вызывать статический метод из медиатора и передавать свой объект и сообщение
    public void sendMessage(String msg) {
        Mediator.sendMessage(this, msg);
    }
}
