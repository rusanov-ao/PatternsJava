package org.example.structural.bridge;

class SportCar extends Car {

    public SportCar(Engine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.print("SportCar engine: ");
        engine.setEngine();
    }


}
