package org.example.generative.abstract_factory;

/**
 * Машина для США с ценой
 */

public class USAZeekr implements Zeekr {

    @Override
    public long getZeekrPrice() {
        return 8000L;
    }
}
