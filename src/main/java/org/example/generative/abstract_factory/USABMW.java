package org.example.generative.abstract_factory;

/**
 * Машина для США с ценой
 */

public class USABMW implements BMW {

    @Override
    public long getBMWPrice() {
        return 15000L;
    }
}
