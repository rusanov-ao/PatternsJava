package org.example.structural.decorator;

// Наследуемся от decorator и добавляем новый функционал в метод draw
class RedCarDecorator extends CarDecorator {
    public RedCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void draw() {
        car.draw();
        setColor();
    }

    public void setColor() {
        System.out.println("Color: red");
    }
}
