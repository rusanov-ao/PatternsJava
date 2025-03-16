package org.example.structural.bridge;

public class UnknownEngine implements Engine {
    @Override
    public void setEngine() {
        System.out.println("unknown");
    }
}
