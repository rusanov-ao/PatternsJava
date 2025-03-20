package org.example.behavioral.mediator;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Alex");
        User user2 = new User("Mike");

        // Отправляем сообщение
        user1.sendMessage("message1");
        user2.sendMessage("message2");
    }
}
