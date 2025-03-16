package org.example.generative.abstractFactory;

/**
 * Реализуем абстрактную фабрику для США
 */

public class USAFactory implements Factory {

    @Override
    public BMW getBMW() {
        return new USABMW();
    }

    @Override
    public Audi getAudi() {
        return new USAAudi();
    }

    @Override
    public Zeekr geteekr() {
        return new USAZeekr();
    }
}
