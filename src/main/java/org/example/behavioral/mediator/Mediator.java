package org.example.behavioral.mediator;

// Пользователи будут использовать метод у Медиатора для общения
public class Mediator {

    public static void sendMessage(User user, String msg) {
        System.out.println(user.getName() + " " + msg);
    }
}
