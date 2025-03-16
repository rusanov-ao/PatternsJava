package org.example.generative.abstractFactory;

/**
 * Машина для США с ценой
 */

public class USAAudi implements Audi {

    @Override
    public long getAudiPrice() {
        return 10000L;
    }
}
