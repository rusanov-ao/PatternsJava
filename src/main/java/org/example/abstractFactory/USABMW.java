package org.example.abstractFactory;

/**
 * Машина для США с ценой
 */

public class USABMW implements BMW {

    @Override
    public long getBMWPrice() {
        return 15000L;
    }
}
