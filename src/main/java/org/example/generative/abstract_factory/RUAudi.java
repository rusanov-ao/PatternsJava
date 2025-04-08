package org.example.generative.abstract_factory;

/**
 * Машина для России с ценой
 */

public class RUAudi implements Audi {

    @Override
    public long getAudiPrice() {
        return 2000000L;
    }
}
