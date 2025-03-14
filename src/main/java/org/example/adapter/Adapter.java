package org.example.adapter;

public class Adapter implements Flash {

    final private USB usb;

    // Конструктор принимает объект USB
    public Adapter(USB usb) {
        this.usb = usb;
    }

    // Переопределяем метод и добавляем в него вызов метода из USB
    @Override
    public void write() {
        usb.connect();
        System.out.println("Данные успешно записаны через USB");
    }

    // Переопределяем метод и добавляем в него вызов метода из USB
    @Override
    public void read() {
        usb.connect();
        System.out.println("Данные успешно прочитаны через USB");
    }
}