package org.example.behavioral.state;

public class PlayContext implements State {
    private State state;

    // Меняем состояние объектов
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
