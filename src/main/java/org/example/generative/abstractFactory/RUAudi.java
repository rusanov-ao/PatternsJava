package org.example.generative.abstractFactory;

/**
 * Машина для России с ценой
 */

public class RUAudi implements Audi {

    @Override
    public long getAudiPrice() {
        return 2000000L;
    }
}
