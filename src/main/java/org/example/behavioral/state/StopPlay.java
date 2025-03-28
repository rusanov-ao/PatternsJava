package org.example.behavioral.state;

public class StopPlay implements State {
    @Override
    public void doAction() {
        System.out.println("Stop play");
    }
}
