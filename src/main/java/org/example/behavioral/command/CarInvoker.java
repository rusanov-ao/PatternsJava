package org.example.behavioral.command;

public class CarInvoker {
    private Command command;

    public CarInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
