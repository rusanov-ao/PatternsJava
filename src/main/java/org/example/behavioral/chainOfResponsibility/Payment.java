package org.example.behavioral.chainOfResponsibility;

public interface Payment {
    void setNext(Payment payment);

    void pay();
}
