package org.example.abstractFactory;

/**
 * Машина для США с ценой
 */

public class USAZeekr implements Zeekr {

    @Override
    public long getZeekrPrice() {
        return 8000L;
    }
}
