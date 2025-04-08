package org.example.generative.abstract_factory;

/**
 * Машина для России с ценой
 */

public class RUBMW implements BMW {

    @Override
    public long getBMWPrice() {
        return 3000000L;
    }
}
