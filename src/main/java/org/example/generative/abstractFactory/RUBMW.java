package org.example.generative.abstractFactory;

/**
 * Машина для России с ценой
 */

public class RUBMW implements BMW {

    @Override
    public long getBMWPrice() {
        return 3000000L;
    }
}
