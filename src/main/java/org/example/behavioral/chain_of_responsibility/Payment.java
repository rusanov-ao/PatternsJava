package org.example.behavioral.chain_of_responsibility;

public interface Payment {
    void setNext(Payment payment);

    void pay();
}
