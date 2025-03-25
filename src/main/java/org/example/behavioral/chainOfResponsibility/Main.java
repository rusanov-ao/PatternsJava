package org.example.behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        Payment visa = new Visa();
        Payment masterCard = new MasterCard();

        // Передаем управление другой платежной системе
        visa.setNext(masterCard);
        visa.pay();
    }
}
