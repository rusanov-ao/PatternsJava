package org.example.behavioral.mediator;

public class Mediator {

    public static void sendMessage(User user, String msg) {
        System.out.println(user.getName() + " " + msg);
    }
}
