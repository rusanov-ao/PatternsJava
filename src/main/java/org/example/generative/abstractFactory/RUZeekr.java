package org.example.generative.abstractFactory;

/**
 * Машина для России с ценой
 */

public class RUZeekr implements Zeekr {

    @Override
    public long getZeekrPrice() {
        return 1000000L;
    }
}
