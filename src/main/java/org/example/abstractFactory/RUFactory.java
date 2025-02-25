package org.example.abstractFactory;

/**
 * Реализуем абстрактную фабрику для России
 */

public class RUFactory implements Factory {

    @Override
    public BMW getBMW() {
        return new RUBMW();
    }

    @Override
    public Audi getAudi() {
        return new RUAudi();
    }

    @Override
    public Zeekr geteekr() {
        return new RUZeekr();
    }
}
