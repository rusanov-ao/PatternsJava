package org.example.behavioral.chain_of_responsibility;

public class Visa implements Payment {
    Payment nextPayment;

    // Метод позволяет провести оплату через другую платежную систему
    @Override
    public void setNext(Payment payment) {
        this.nextPayment = payment;
        nextPayment.pay();
    }

    @Override
    public void pay() {
        System.out.println("Visa payment");
    }
}
