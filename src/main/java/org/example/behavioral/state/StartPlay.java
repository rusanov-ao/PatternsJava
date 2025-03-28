package org.example.behavioral.state;

public class StartPlay implements State {
    @Override
    public void doAction() {
        System.out.println("Start play");
    }
}
